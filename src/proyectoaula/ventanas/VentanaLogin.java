package proyectoaula.ventanas;

import proyectoaula.conexionBD.ConexionUsuario;

import javax.swing.JOptionPane;

public class VentanaLogin extends javax.swing.JFrame {

    public VentanaLogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        botonEntrar = new javax.swing.JButton();
        txtContraseña = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        botonRegistrarse = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Contraseña:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 150, 30));

        txtCedula.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        txtCedula.setBorder(null);
        txtCedula.setPreferredSize(new java.awt.Dimension(80, 35));
        jPanel2.add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 160, 30));

        jLabel5.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Cédula: ");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 130, 30));

        botonEntrar.setBackground(new java.awt.Color(204, 204, 204));
        botonEntrar.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        botonEntrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoaula/imagenes/ingresar.png"))); // NOI18N
        botonEntrar.setText("Entrar");
        botonEntrar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        botonEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEntrarActionPerformed(evt);
            }
        });
        jPanel2.add(botonEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 120, 40));

        txtContraseña.setBorder(null);
        txtContraseña.setPreferredSize(new java.awt.Dimension(80, 35));
        jPanel2.add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 160, 30));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 160, 10));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 160, 10));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoaula/imagenes/clave.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 30, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoaula/imagenes/licencia-de-conducir.png"))); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 40, 30));

        botonRegistrarse.setBackground(new java.awt.Color(204, 204, 204));
        botonRegistrarse.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        botonRegistrarse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoaula/imagenes/agregar-contacto.png"))); // NOI18N
        botonRegistrarse.setText("Registrarse");
        botonRegistrarse.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        botonRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarseActionPerformed(evt);
            }
        });
        jPanel2.add(botonRegistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 140, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 80, 350, 360));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoaula/imagenes/encendiendo.png"))); // NOI18N
        jLabel6.setText("ECO-POWER");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel6.setInheritsPopupMenu(false);
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 290, 80));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoaula/imagenes/nature-3475815_1280.jpg"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 640));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarseActionPerformed
        VentanaRegistroUsuario ventana = new VentanaRegistroUsuario(this, true);
        ventana.setLocationRelativeTo(this);
        ventana.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonRegistrarseActionPerformed

    private void botonEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEntrarActionPerformed
        String cedula = txtCedula.getText();
        String contraseña = new String(txtContraseña.getPassword());
        if (verificarInicioSesion(cedula, contraseña)) {
            mostrarMensajeInicioSesionExitoso();
            abrirNuevaVentana();
            cerrarVentanaActual();
        } else {
            mostrarMensajeError("Cédula o contraseña incorrecta.");
        }

    }//GEN-LAST:event_botonEntrarActionPerformed
    private boolean verificarInicioSesion(String cedula, String contraseña) {
        ConexionUsuario objConexion = new ConexionUsuario();
        return objConexion.verificarInicioSesion(cedula, contraseña);
    }

    private void mostrarMensajeInicioSesionExitoso() {
        JOptionPane.showMessageDialog(rootPane, "Inicio de sesión exitoso.");
    }

    private void abrirNuevaVentana() {
        Ventana nuevaVentana = new Ventana();
        nuevaVentana.setVisible(true);
    }

    private void cerrarVentanaActual() {
        this.setVisible(false);
    }

    private void mostrarMensajeError(String mensaje) {
        JOptionPane.showMessageDialog(rootPane, mensaje, "Error de Inicio de Sesión", JOptionPane.ERROR_MESSAGE);
    }

    public static void main(String[] args) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonEntrar;
    private javax.swing.JButton botonRegistrarse;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JPasswordField txtContraseña;
    // End of variables declaration//GEN-END:variables
}
