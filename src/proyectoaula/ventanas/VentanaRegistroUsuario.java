package proyectoaula.ventanas;

import java.sql.Connection;
import javax.swing.JOptionPane;
import proyectoaula.conexionBD.ConexionUsuario;
import proyectoaula.objects.Usuario;

public class VentanaRegistroUsuario extends javax.swing.JDialog {
    ConexionUsuario conex = new ConexionUsuario();
    Connection cn = conex.conectar();

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
        jPanel2.add(txtClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, 252, 33));

        botonGuardar.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        botonGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoaula/imagenes/salvar.png"))); // NOI18N
        botonGuardar.setText("Guardar");
        botonGuardar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });
        jPanel2.add(botonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 430, 117, 40));

        jLabel2.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel2.setText("FORMULARIO DE REGISTRO DE USUARIO");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 400, 40));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 250, -1));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 390, 250, 0));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 250, 10));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 250, 10));
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 250, 10));
        jPanel2.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, 250, 10));
        jPanel2.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, 250, 30));

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
        if (crearUsuario()) {
        limpiarCampos();
    }

    }//GEN-LAST:event_botonGuardarActionPerformed

    private boolean crearUsuario() {
        Usuario usuario = recuperarDatosGUI();
        try {
            // Verificar si la cédula ya existe
            String consultaVerificacion = "SELECT COUNT(*) FROM usuarios WHERE cedula = ?";
            java.sql.PreparedStatement psVerificacion = cn.prepareStatement(consultaVerificacion);
            psVerificacion.setString(1, usuario.getCedula());
            java.sql.ResultSet rs = psVerificacion.executeQuery();
            rs.next();
            int count = rs.getInt(1);

            if (count > 0) {
                // La cédula ya existe
                JOptionPane.showMessageDialog(null, "La cédula ya está registrada");
                limpiarCampos();
            } else {
                // La cédula no existe, proceder con la inserción
                String consulta = "INSERT INTO usuarios (cedula, nombre, apellido, telefono, gmail, contraseña) VALUES (?, ?, ?, ?, ?, ?)";
                java.sql.PreparedStatement ps = cn.prepareStatement(consulta);

               // Establece los parámetros
                ps.setString(1, usuario.getCedula());
                ps.setString(2, usuario.getNombre());
                ps.setString(3, usuario.getApellido());
                ps.setString(4, usuario.getTelefono() );
                ps.setString(5, usuario.getEmail());
                ps.setString(6, usuario.getContraseña());


                // Ejecuta la actualización
                ps.executeUpdate();

                // Limpia los campos
                limpiarCampos();

                JOptionPane.showMessageDialog(null, "Datos registrados correctamente");
                return true; // Registro exitoso
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo registrar los datos: " + e);
            
        }
            return false; // Registro fallido
    
    }
    public Usuario recuperarDatosGUI() {
    Usuario usuario = new Usuario();
    usuario.setCedula(txtCedula.getText());
    usuario.setNombre(txtNombre.getText());
    usuario.setApellido(txtApellido.getText());
    usuario.setTelefono(txtTelefono.getText());
    usuario.setEmail(txtEmail.getText());
    usuario.setContraseña(txtClave.getText());
    return usuario;
}  

    

    private void RegresarVentanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarVentanaActionPerformed
        VentanaLogin abc = new VentanaLogin();
        abc.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_RegresarVentanaActionPerformed

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
