package proyectoaula.ventanas;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import proyectoaula.conexionBD.ConexionUsuario;
import proyectoaula.objects.Usuario;

public class VentanaRegistroUsuario extends javax.swing.JDialog {
    ConexionUsuario objConexion = new ConexionUsuario();
    public VentanaRegistroUsuario(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        telefono = new javax.swing.JLabel();
        contraseña = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        apellido = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        cedula = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        email = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtClave = new javax.swing.JPasswordField();
        botonGuardar = new javax.swing.JButton();
        botonBuscar = new javax.swing.JButton();
        botonEditar = new javax.swing.JButton();
        botonEliminar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        RegresarVentana = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        telefono.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        telefono.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        telefono.setText("Télefono:");
        telefono.setMinimumSize(new java.awt.Dimension(60, 23));
        jPanel2.add(telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 85, 30));

        contraseña.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        contraseña.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        contraseña.setText("Contraseña:");
        contraseña.setMinimumSize(new java.awt.Dimension(60, 23));
        jPanel2.add(contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 90, 30));

        nombre.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        nombre.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        nombre.setText("Nombre:");
        nombre.setMinimumSize(new java.awt.Dimension(60, 23));
        jPanel2.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 85, 30));

        txtNombre.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        txtNombre.setAlignmentX(5.0F);
        txtNombre.setBorder(null);
        txtNombre.setMinimumSize(new java.awt.Dimension(60, 23));
        txtNombre.setPreferredSize(new java.awt.Dimension(80, 30));
        jPanel2.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 252, -1));

        apellido.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        apellido.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        apellido.setText("Apellido: ");
        apellido.setMinimumSize(new java.awt.Dimension(60, 23));
        jPanel2.add(apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 85, 30));

        txtApellido.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        txtApellido.setAlignmentX(5.0F);
        txtApellido.setBorder(null);
        txtApellido.setMinimumSize(new java.awt.Dimension(60, 23));
        txtApellido.setPreferredSize(new java.awt.Dimension(80, 30));
        jPanel2.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 252, -1));

        cedula.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        cedula.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        cedula.setText("Cédula:");
        cedula.setMinimumSize(new java.awt.Dimension(60, 23));
        jPanel2.add(cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 85, 30));

        txtCedula.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        txtCedula.setAlignmentX(5.0F);
        txtCedula.setBorder(null);
        txtCedula.setMinimumSize(new java.awt.Dimension(60, 23));
        txtCedula.setPreferredSize(new java.awt.Dimension(80, 30));
        jPanel2.add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 252, -1));

        email.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        email.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        email.setText("Email:");
        email.setMinimumSize(new java.awt.Dimension(60, 23));
        jPanel2.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 85, 30));

        txtTelefono.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        txtTelefono.setAlignmentX(5.0F);
        txtTelefono.setBorder(null);
        txtTelefono.setMinimumSize(new java.awt.Dimension(60, 23));
        txtTelefono.setPreferredSize(new java.awt.Dimension(80, 30));
        jPanel2.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 252, -1));

        txtEmail.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        txtEmail.setAlignmentX(5.0F);
        txtEmail.setBorder(null);
        txtEmail.setMinimumSize(new java.awt.Dimension(60, 23));
        txtEmail.setPreferredSize(new java.awt.Dimension(80, 30));
        jPanel2.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 252, -1));

        txtClave.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        txtClave.setBorder(null);
        txtClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClaveActionPerformed(evt);
            }
        });
        jPanel2.add(txtClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, 252, 30));

        botonGuardar.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        botonGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoaula/imagenes/salvar.png"))); // NOI18N
        botonGuardar.setText("Guardar");
        botonGuardar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });
        jPanel2.add(botonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 434, 117, 40));

        botonBuscar.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        botonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoaula/imagenes/buscar.png"))); // NOI18N
        botonBuscar.setText("Buscar");
        botonBuscar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });
        jPanel2.add(botonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 434, 108, 40));

        botonEditar.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        botonEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoaula/imagenes/editar-codigo.png"))); // NOI18N
        botonEditar.setText("Editar");
        botonEditar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        botonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEditarActionPerformed(evt);
            }
        });
        jPanel2.add(botonEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 434, 102, 40));

        botonEliminar.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        botonEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoaula/imagenes/borrar.png"))); // NOI18N
        botonEliminar.setText("Eliminar");
        botonEliminar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });
        jPanel2.add(botonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 434, 100, 40));

        jLabel2.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel2.setText("FORMULARIO DE REGISTRO DE USUARIO");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 400, 40));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 250, -1));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 390, 250, 0));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 250, 10));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 250, 10));
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 250, 10));
        jPanel2.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, 250, 10));

        jSeparator7.setForeground(new java.awt.Color(204, 204, 204));
        jPanel2.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, 250, 20));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 530, 540));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoaula/imagenes/trabajo-en-equipo.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 280, 290));

        RegresarVentana.setBackground(new java.awt.Color(102, 102, 102));
        RegresarVentana.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        RegresarVentana.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoaula/imagenes/atras.png"))); // NOI18N
        RegresarVentana.setText("Regresar");
        RegresarVentana.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        RegresarVentana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarVentanaActionPerformed(evt);
            }
        });
        jPanel1.add(RegresarVentana, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 440, 120, 40));

        jLabel1.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("GESTIÓN DE USUARIOS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 270, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed
       if (camposVacios()) {
        JOptionPane.showMessageDialog(rootPane, "Todos los campos deben estar llenos.");
    } else if (!validarCedula()) {
        JOptionPane.showMessageDialog(rootPane, "La cédula debe tener entre 8 y 10 dígitos enteros.");
    } else if (!validarEmail()) {
        JOptionPane.showMessageDialog(rootPane, "El formato del email no es válido.");
    } else if (!validarTelefono()) {
        JOptionPane.showMessageDialog(rootPane, "El número de teléfono debe ser un número entero.");
    } else if (!soloLetras(txtNombre.getText()) || !soloLetras(txtApellido.getText())) {
        JOptionPane.showMessageDialog(rootPane, "Los campos de Nombre y Apellido solo deben contener letras.");
    } else {
        if (!cedulaExistente(txtCedula.getText())) {
            crearUsuario();
            JOptionPane.showMessageDialog(rootPane, "¡El usuario ha sido registrado con éxito!");
            limpiarCampos();
        } else {
            JOptionPane.showMessageDialog(rootPane, "La cédula ya está registrada.");
        }
    }
    }//GEN-LAST:event_botonGuardarActionPerformed
   
private void crearUsuario() {
    Usuario usuario = recuperarDatosGUI();
    String strSentenciaInsert = String.format("INSERT INTO Usuarios (Cedula, Nombre, Apellido, Telefono, Correo, Clave) "
            + "VALUES ('%s', '%s', '%s', '%s', '%s', '%s')", usuario.getCedula(), usuario.getNombre(), usuario.getApellido(),
            usuario.getTelefono(), usuario.getEmail(), usuario.getContraseña());
    objConexion.ejecutarSentenciaSQL(strSentenciaInsert);
}

public Usuario recuperarDatosGUI() {
    Usuario usuario = new Usuario();
    int cedula = Integer.parseInt(txtCedula.getText());
    usuario.setCedula(cedula);
    usuario.setNombre(txtNombre.getText());
    usuario.setApellido(txtApellido.getText());
    usuario.setTelefono(txtTelefono.getText());
    usuario.setEmail(txtEmail.getText());
    usuario.setContraseña(txtClave.getText());
    return usuario;
}

    private boolean cedulaExistente(String cedula) {
    try {
        String strSentenciaSelect = String.format("SELECT * FROM Usuarios WHERE Cedula = '%s'", cedula);
        ResultSet resultado = objConexion.consultarRegistros(strSentenciaSelect);
        return resultado.next();
    } catch (Exception e) {
        System.out.println(e);
        return false;
    }
}
    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        if (!txtCedula.getText().isEmpty()) {
            int cedula = Integer.parseInt(txtCedula.getText());
            Usuario usuario = consultarUsuario(cedula);
            if (usuario != null) {
                txtNombre.setText(usuario.getNombre());
                txtApellido.setText(usuario.getApellido());
                txtTelefono.setText(usuario.getTelefono());
                txtEmail.setText(usuario.getEmail());
                txtClave.setText(usuario.getContraseña());
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Ingrese una cédula válida para consultar.");
        }
    }//GEN-LAST:event_botonBuscarActionPerformed
    public Usuario consultarUsuario(int cedula) {      
        String strSentenciaSelect = String.format("SELECT * FROM Usuarios WHERE Cedula = '%d'", cedula);
        try {
            ResultSet resultado = objConexion.consultarRegistros(strSentenciaSelect);
            if (resultado.next()) {
                Usuario usuario = new Usuario();
                usuario.setCedula(resultado.getInt("Cedula"));
                usuario.setNombre(resultado.getString("Nombre"));
                usuario.setApellido(resultado.getString("Apellido"));
                usuario.setTelefono(resultado.getString("Telefono"));
                usuario.setEmail(resultado.getString("Correo"));
                usuario.setContraseña(resultado.getString("Clave"));
                return usuario;
            } else {
                JOptionPane.showMessageDialog(rootPane, "No se encontró un usuario con esa cédula.");
                return null;
            }
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

    private void botonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEditarActionPerformed
      if (camposVacios()) {
        JOptionPane.showMessageDialog(rootPane, "Todos los campos deben estar llenos.");
    } else if (!validarCedula()) {
        JOptionPane.showMessageDialog(rootPane, "La cédula debe tener entre 8 y 10 dígitos enteros.");
    } else if (!validarEmail()) {
        JOptionPane.showMessageDialog(rootPane, "El formato del email no es válido.");
    } else if (!validarTelefono()) {
        JOptionPane.showMessageDialog(rootPane, "El número de teléfono debe ser un número entero.");
    } else if (!soloLetras(txtNombre.getText()) || !soloLetras(txtApellido.getText())) {
        JOptionPane.showMessageDialog(rootPane, "Los campos de Nombre y Apellido solo deben contener letras.");
    } else {
         int respuesta = JOptionPane.showConfirmDialog(rootPane, "¿Está seguro de que desea modificar el usuario?", "Confirmar modificación", JOptionPane.YES_NO_OPTION);
    
         if (respuesta == JOptionPane.YES_OPTION) {
            JPasswordField pf = new JPasswordField();
            int okCxl = JOptionPane.showConfirmDialog(rootPane, pf, "Ingrese la contraseña para confirmar", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

            if (okCxl == JOptionPane.OK_OPTION) {
                String contraseña = new String(pf.getPassword());
                if (!contraseña.isEmpty()) {
                    editarUsuario(contraseña);
                    limpiarCampos();
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Debe ingresar una contraseña para confirmar.");
                }
        }
    }
    }

    }//GEN-LAST:event_botonEditarActionPerformed

    public void editarUsuario(String contraseña) {
    Usuario usuario = recuperarDatosGUI();
    // Suponiendo que la contraseña debe coincidir con la almacenada en el objeto Usuario
    if (usuario.getContraseña().equals(contraseña)) {
        String strSentenciaInsert = String.format("UPDATE Usuarios SET Nombre='%s', Apellido='%s', Telefono='%s', Correo='%s', Clave='%s' WHERE Cedula=%s",
                usuario.getNombre(), usuario.getApellido(), usuario.getTelefono(),
                usuario.getEmail(), usuario.getContraseña(), usuario.getCedula());

        objConexion.ejecutarSentenciaSQL(strSentenciaInsert);
        JOptionPane.showMessageDialog(rootPane, "Usuario modificado correctamente.");
    } else {
        JOptionPane.showMessageDialog(rootPane, "Contraseña incorrecta. No se realizó la modificación.");
    }
    }
    
    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
    if (!txtCedula.getText().isEmpty()) {
        int respuesta = JOptionPane.showConfirmDialog(rootPane, "¿Está seguro de que desea eliminar el usuario?", "Confirmar eliminación", JOptionPane.YES_NO_OPTION);
        if (respuesta == JOptionPane.YES_OPTION) {
            JPasswordField pf = new JPasswordField();
            int okCxl = JOptionPane.showConfirmDialog(rootPane, pf, "Ingrese la contraseña para confirmar", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

            if (okCxl == JOptionPane.OK_OPTION) {
                String contraseña = new String(pf.getPassword());
                if (!contraseña.isEmpty()) {
                    eliminarUsuario(contraseña);
                    limpiarCampos();
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Debe ingresar una contraseña para confirmar.");
                }
            }
        }
    } else {
        JOptionPane.showMessageDialog(rootPane, "Ingrese una cédula para eliminar.");
    }
    }//GEN-LAST:event_botonEliminarActionPerformed
    public void eliminarUsuario(String contraseña) {
    Usuario usuario = recuperarDatosGUI();
    // Suponiendo que la contraseña debe coincidir con la almacenada en el objeto Usuario
    if (usuario.getContraseña().equals(contraseña)) {
        String strSentenciaDelete = String.format("DELETE FROM Usuarios WHERE Cedula='%d'", usuario.getCedula());
        //System.out.println("Sentencia SQL de eliminación: " + strSentenciaDelete);
        try {
            objConexion.ejecutarSentenciaSQL(strSentenciaDelete);
            JOptionPane.showMessageDialog(rootPane, "¡El usuario ha sido eliminado con éxito!");
        } catch (Exception e) {
            System.out.println("Error al eliminar usuario: " + e.getMessage());
            JOptionPane.showMessageDialog(rootPane, "Ocurrió un error al eliminar el usuario.");
        }
    } else {
        JOptionPane.showMessageDialog(rootPane, "Contraseña incorrecta. No se realizó la eliminación.");
      }
    }
    private void RegresarVentanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarVentanaActionPerformed
        VentanaLogin abc = new VentanaLogin();
        abc.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_RegresarVentanaActionPerformed

    private void txtClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClaveActionPerformed

    public static void main(String args[]) {
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VentanaRegistroUsuario dialog = new VentanaRegistroUsuario(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton RegresarVentana;
    private javax.swing.JLabel apellido;
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton botonEditar;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonGuardar;
    private javax.swing.JLabel cedula;
    private javax.swing.JLabel contraseña;
    private javax.swing.JLabel email;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel telefono;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JPasswordField txtClave;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
private boolean camposVacios() {
        return txtCedula.getText().isEmpty() || txtNombre.getText().isEmpty()
                || txtApellido.getText().isEmpty() || txtTelefono.getText().isEmpty()
                || txtEmail.getText().isEmpty() || txtClave.getText().isEmpty();
    }

    public boolean validarContraseña(String contraseña1) {
        return this.contraseña.equals(contraseña);
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
        String email = txtEmail.getText();
        return email.matches(".*@.*\\.com");
    }

 private boolean validarTelefono() {
    String telefono = txtTelefono.getText();
    return telefono.matches("\\d{10}");
}
// método para limpiar campos

    public void limpiarCampos() {
        txtNombre.setText("");
        txtApellido.setText("");
        txtEmail.setText("");
        txtTelefono.setText("");
        txtCedula.setText("");
        txtClave.setText("");
    }
}
