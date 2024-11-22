package proyectoaula.ventanas;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import proyectoaula.conexionBD.ConexionUsuario;
import proyectoaula.objects.Usuario;

public class OpUsuarios extends javax.swing.JFrame {

    private String cedula;

    public OpUsuarios(String cedula) {
        initComponents();
        this.cedula = cedula;
        cargarDatosUsuario();
    }

 

    private void cargarDatosUsuario() {
        String sql = "SELECT cedula, nombre, apellido, telefono, gmail, contraseña FROM usuarios WHERE cedula = ?";

        // Obtener la conexión desde la clase ConexionUsuario
        try (Connection conexionUsuarios = new ConexionUsuario().conectar(); 
                PreparedStatement pst = conexionUsuarios.prepareStatement(sql)) {
            // Asignar la cédula al parámetro de la consulta
            pst.setString(1, this.cedula);
            // Ejecutar la consulta
            try (ResultSet rs = pst.executeQuery()) {
                // Verificar si hay resultados
                if (rs.next()) {
                    // Llenar los campos de texto con los datos del usuario
                    txtCedula.setText(rs.getString("cedula"));
                    txtNombre.setText(rs.getString("nombre"));
                    txtApellido.setText(rs.getString("apellido"));
                    txtTelefono.setText(rs.getString("telefono"));
                    txtCorreo.setText(rs.getString("gmail"));
                    txtContraseña.setText(rs.getString("contraseña"));
                } else {
                    JOptionPane.showMessageDialog(this, "Usuario no encontrado", "Error", JOptionPane.WARNING_MESSAGE);
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al cargar los datos: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }

    // Método para guardar los cambios del usuario en la base de datos
    public boolean guardarCambiosUsuario() {
    // Verificar que los campos no estén vacíos
    if (camposVacios()) {
        JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        return false; // Retorna false si hay campos vacíos
    }

    Usuario usuario = recuperarDatosGUI();

    // Consulta SQL para actualizar los datos del usuario
    String sql = "UPDATE usuarios SET nombre = ?, apellido = ?, telefono = ?, gmail = ?, contraseña = ? WHERE cedula = ?";

    try (Connection conexionUsuarios = new ConexionUsuario().conectar();
         PreparedStatement pst = conexionUsuarios.prepareStatement(sql)) {

        // Asignar los valores a la consulta
        pst.setString(1, usuario.getNombre());
        pst.setString(2, usuario.getApellido());
        pst.setString(3, usuario.getTelefono());
        pst.setString(4, usuario.getEmail());
        pst.setString(5, usuario.getContraseña());
        pst.setString(6, usuario.getCedula());

        int filasActualizadas = pst.executeUpdate();

        if (filasActualizadas > 0) {
            JOptionPane.showMessageDialog(this, "Datos actualizados correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            return true; // Retorna true si la actualización fue exitosa
        } else {
            JOptionPane.showMessageDialog(this, "No se encontró el usuario con la cédula especificada.", "Error", JOptionPane.ERROR_MESSAGE);
            return false; // Retorna false si no se actualizó nada
        }

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error al actualizar los datos: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();
        return false; // Retorna false si ocurre una excepción
    }
}

    
    public Usuario recuperarDatosGUI() {
    Usuario usuario = new Usuario();
    usuario.setCedula(txtCedula.getText());
    usuario.setNombre(txtNombre.getText());
    usuario.setApellido(txtApellido.getText());
    usuario.setTelefono(txtTelefono.getText());
    usuario.setEmail(txtCorreo.getText());
    usuario.setContraseña(txtContraseña.getText());
    return usuario;
    }  
    public void eliminarUsuario() {
    
    if (txtCedula.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, ingrese la cédula del usuario.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        return;
    }

    String cedula = txtCedula.getText();

    String contraseñaIngresada = JOptionPane.showInputDialog(this, "Ingrese su contraseña para confirmar:", "Confirmar eliminación", JOptionPane.QUESTION_MESSAGE);

    if (contraseñaIngresada == null) {
        JOptionPane.showMessageDialog(this, "Eliminación cancelada.", "Información", JOptionPane.INFORMATION_MESSAGE);
        return;
    }

    String sqlValidacion = "SELECT contraseña FROM usuarios WHERE cedula = ?";
    String contraseñaAlmacenada = null;

    try (Connection conexionUsuarios = new ConexionUsuario().conectar();
         PreparedStatement pstValidacion = conexionUsuarios.prepareStatement(sqlValidacion)) {

        pstValidacion.setString(1, cedula);
        ResultSet rs = pstValidacion.executeQuery();

        if (rs.next()) {
            contraseñaAlmacenada = rs.getString("contraseña");
        } else {
            JOptionPane.showMessageDialog(this, "No se encontró el usuario con la cédula especificada.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error al validar la contraseña: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();
        return;
    }

    if (!contraseñaIngresada.equals(contraseñaAlmacenada)) {
        JOptionPane.showMessageDialog(this, "Contraseña incorrecta. No se puede eliminar el usuario.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    String sqlEliminar = "DELETE FROM usuarios WHERE cedula = ?";

    try (Connection conexionUsuarios = new ConexionUsuario().conectar();
         PreparedStatement pstEliminar = conexionUsuarios.prepareStatement(sqlEliminar)) {

        pstEliminar.setString(1, cedula);
        int filasEliminadas = pstEliminar.executeUpdate();

        if (filasEliminadas > 0) {
            JOptionPane.showMessageDialog(this, "Usuario eliminado correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            this.dispose();

            VentanaLogin ventanaLogin = new VentanaLogin();
            ventanaLogin.setVisible(true);

        } else {
            JOptionPane.showMessageDialog(this, "No se pudo eliminar el usuario. Intente nuevamente.", "Error", JOptionPane.ERROR_MESSAGE);
        }

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error al eliminar el usuario: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();
    }
}




    private boolean camposVacios() {
        return txtCedula.getText().isEmpty() || txtNombre.getText().isEmpty()
                || txtApellido.getText().isEmpty() || txtTelefono.getText().isEmpty()
                || txtCorreo.getText().isEmpty() || txtContraseña.getText().isEmpty();
    }

    public OpUsuarios() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        Guardar_cambios = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        eliminar_cuena = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        txtContraseña = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 18)); // NOI18N
        jLabel1.setText("Editar usuario");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, -1, -1));

        jLabel2.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        jLabel2.setText("Cédula");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 270, 30));

        jLabel3.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        jLabel3.setText("Nombre");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 270, 30));

        jLabel4.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        jLabel4.setText("Apellido");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 260, 30));

        jLabel5.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        jLabel5.setText("Teléfono");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, 270, 30));

        txtCedula.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        txtCedula.setBorder(null);
        txtCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaActionPerformed(evt);
            }
        });
        jPanel1.add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, 270, 30));

        Guardar_cambios.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        Guardar_cambios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoaula/imagenes/salvar.png"))); // NOI18N
        Guardar_cambios.setText("Guardar");
        Guardar_cambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Guardar_cambiosActionPerformed(evt);
            }
        });
        jPanel1.add(Guardar_cambios, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 570, -1, -1));

        jLabel6.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        jLabel6.setText("Correo");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 390, 270, -1));

        jLabel7.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        jLabel7.setText("Contraseña");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 470, 270, -1));

        txtNombre.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        txtNombre.setBorder(null);
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 270, 30));

        txtApellido.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        txtApellido.setBorder(null);
        jPanel1.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 270, 30));

        txtTelefono.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        txtTelefono.setBorder(null);
        jPanel1.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 340, 270, 30));

        txtCorreo.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        txtCorreo.setBorder(null);
        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });
        jPanel1.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 420, 270, 30));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoaula/imagenes/atras.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 570, 80, 40));

        eliminar_cuena.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        eliminar_cuena.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoaula/imagenes/borrar.png"))); // NOI18N
        eliminar_cuena.setText("Eliminar cuenta ");
        eliminar_cuena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminar_cuenaActionPerformed(evt);
            }
        });
        jPanel1.add(eliminar_cuena, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 30, 190, 40));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoaula/imagenes/usuario.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 530, 270, 20));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 270, 20));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 270, 20));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, 270, 20));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, 270, 20));

        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 450, 270, 20));

        txtContraseña.setText("jPasswordField1");
        jPanel1.add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 500, 270, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 722, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.dispose(); // Cierra la ventana Opusuarios
        Ventana ventanaPrincipal = new Ventana(); // Crear nueva instancia de Ventana
        ventanaPrincipal.setCedula(this.cedula); // Pasar la cédula de vuelta
        ventanaPrincipal.setLocationRelativeTo(null); // Centrar en pantalla
        ventanaPrincipal.setVisible(true);


    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void Guardar_cambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Guardar_cambiosActionPerformed
        // TODO add your handling code here:
        
        
        if (camposVacios()) {
            JOptionPane.showMessageDialog(rootPane, "Todos los campos deben estar llenos.");
            return;
        } else if (!validarCedula()) {
            JOptionPane.showMessageDialog(rootPane, "La cédula debe tener entre 8 y 10 dígitos enteros.");
            return;
        } else if (!validarEmail()) {
            JOptionPane.showMessageDialog(rootPane, "El formato del email no es válido.");
            return;
        } else if (!validarTelefono()) {
            JOptionPane.showMessageDialog(rootPane, "El número de teléfono debe ser un número entero.");
            return;
        } else if (!soloLetras(txtNombre.getText()) || !soloLetras(txtApellido.getText())) {
            JOptionPane.showMessageDialog(rootPane, "Los campos de Nombre y Apellido solo deben contener letras.");
            return;
        } 
        guardarCambiosUsuario();


    }//GEN-LAST:event_Guardar_cambiosActionPerformed

    private void eliminar_cuenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminar_cuenaActionPerformed
        // TODO add your handling code here:
        eliminarUsuario();
    }//GEN-LAST:event_eliminar_cuenaActionPerformed

    private void txtCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaActionPerformed

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(OpUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OpUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OpUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OpUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OpUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Guardar_cambios;
    private javax.swing.JButton eliminar_cuena;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables

    

    public boolean validarContraseña(String contraseñaIngresada) {
    String contraseñaAlmacenada = txtContraseña.getText(); 
    return contraseñaAlmacenada.equals(contraseñaIngresada);
}


    private boolean soloLetras(String texto) {
        // Verifica si el texto solo contiene letras
        return texto.matches("[a-zA-Z]+");
    }

    private boolean validarCedula() {
        String cedula = txtCedula.getText();
        return cedula.matches("\\d{8,10}");
    }

    private boolean validarEmail() {
        String email = txtCorreo.getText();
        return email.matches(".*@.*\\.com");
    }

    private boolean validarTelefono() {
        String telefono = txtTelefono.getText();
        return telefono.matches("\\d{10}");
    }

}

