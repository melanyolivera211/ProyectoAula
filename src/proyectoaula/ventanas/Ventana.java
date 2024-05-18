package proyectoaula.ventanas;

import java.awt.Color;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import proyectoaula.conexionBD.ConexionElectrodomestico;
import proyectoaula.conexionBD.ConexionUsuario;
import proyectoaula.objects.Electrodomestico;
import java.sql.SQLException;

public class Ventana extends javax.swing.JFrame {
    DefaultTableModel modelo;
    private String cedulaUsuario;
    private String cedula;
    private String cedulaInicial;
    ConexionUsuario objConexion = new ConexionUsuario();
    
    public Ventana(String cedula) {
    initComponents();
    this.cedulaInicial = cedula;
    txtCedula1.setText(cedula);
    String[] titulos = {"Cedula", "Electrodomestico", "NroSerie", "Marca"};
    modelo = new DefaultTableModel(null, titulos);
    tablaelectrodomestico.setModel(modelo);

    }

    public Ventana() {
    initComponents();
    String[] titulos = {"Cedula", "Electrodomestico", "NroSerie", "Marca"};
        modelo = new DefaultTableModel(null, titulos);
        tablaelectrodomestico.setModel(modelo);
    }
    public void limpiarCampos() {
        txtElectrodomestico.setText("");
        txtNroSerie1.setText("");
        txtMarca.setText("");
        
        botonGuardar.setEnabled(true);
        botonEditar.setEnabled(false);
        botonEliminar.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        RegresarVentana = new javax.swing.JButton();
        Principal = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtCedula1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tablaelectrodomestico = new rojerusan.RSTableMetro();
        jSeparator1 = new javax.swing.JSeparator();
        txtElectrodomestico = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        txtNroSerie1 = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        txtMarca = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        botonEditar = new javax.swing.JButton();
        botonGuardar = new javax.swing.JButton();
        Mostrar = new javax.swing.JButton();
        botonEliminar = new javax.swing.JButton();
        Cancelar = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtGastos = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        Guardar = new javax.swing.JButton();
        Mostrar1 = new javax.swing.JButton();
        Editar = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JSeparator();
        txtuso = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtCedula2 = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        txtNroSerie2 = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        jScrollPane9 = new javax.swing.JScrollPane();
        gastosTable = new rojerusan.RSTableMetro();
        jLabel14 = new javax.swing.JLabel();
        calcular = new javax.swing.JButton();
        jSeparator9 = new javax.swing.JSeparator();
        txtFecha = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(66, 66, 66));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Lucida Sans", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("GESTIÓN DE ELECTRODOMÉSTICOS");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 670, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, -20, 1080, 90));

        jPanel3.setBackground(new java.awt.Color(66, 66, 66));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(66, 66, 66));
        jPanel7.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel7MouseMoved(evt);
            }
        });
        jPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel7MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel7MouseExited(evt);
            }
        });
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoaula/imagenes/rayo.png"))); // NOI18N
        jLabel8.setText("Administrar gastos");
        jPanel7.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 210, 60));

        jPanel3.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 320, 120));

        jPanel8.setBackground(new java.awt.Color(66, 66, 66));
        jPanel8.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jPanel8AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel8.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel8MouseMoved(evt);
            }
        });
        jPanel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel8MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel8MouseExited(evt);
            }
        });
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoaula/imagenes/home-appliance.png"))); // NOI18N
        jLabel4.setText("Explorar electrodomésticos");
        jPanel8.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 270, 60));

        jPanel3.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 188, 320, 120));

        RegresarVentana.setBackground(new java.awt.Color(102, 102, 102));
        RegresarVentana.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        RegresarVentana.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoaula/imagenes/atras.png"))); // NOI18N
        RegresarVentana.setText("Regresar");
        RegresarVentana.setBorder(null);
        RegresarVentana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarVentanaActionPerformed(evt);
            }
        });
        jPanel3.add(RegresarVentana, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 490, 140, 50));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 670));

        Principal.setBackground(new java.awt.Color(153, 153, 153));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoaula/imagenes/electrodomesticos.png"))); // NOI18N
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 270, 260));

        jLabel5.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Cédula:");
        jLabel5.setPreferredSize(new java.awt.Dimension(60, 23));
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 150, -1));

        txtCedula1.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        txtCedula1.setBorder(null);
        txtCedula1.setMinimumSize(new java.awt.Dimension(60, 23));
        jPanel4.add(txtCedula1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 150, 30));

        jLabel2.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Electrodomestico:");
        jLabel2.setPreferredSize(new java.awt.Dimension(60, 23));
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 150, -1));

        jLabel1.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Nro. Serie:");
        jLabel1.setPreferredSize(new java.awt.Dimension(60, 23));
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 160, -1));

        jLabel3.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Marca:");
        jLabel3.setPreferredSize(new java.awt.Dimension(60, 23));
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 160, -1));

        tablaelectrodomestico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Cédula", "Electrodomestico", "NroSerie", "Marca"
            }
        ));
        tablaelectrodomestico.setAltoHead(25);
        tablaelectrodomestico.setColorBackgoundHead(new java.awt.Color(66, 66, 66));
        tablaelectrodomestico.setColorFilasBackgound2(new java.awt.Color(240, 240, 240));
        tablaelectrodomestico.setColorFilasForeground1(new java.awt.Color(51, 51, 51));
        tablaelectrodomestico.setColorFilasForeground2(new java.awt.Color(51, 51, 51));
        tablaelectrodomestico.setFuenteFilas(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tablaelectrodomestico.setFuenteHead(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tablaelectrodomestico.setGrosorBordeFilas(0);
        tablaelectrodomestico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaelectrodomesticoMouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(tablaelectrodomestico);

        jPanel4.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 50, 580, 390));
        jPanel4.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 150, 20));

        txtElectrodomestico.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        txtElectrodomestico.setBorder(null);
        txtElectrodomestico.setMinimumSize(new java.awt.Dimension(60, 23));
        jPanel4.add(txtElectrodomestico, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 150, 30));
        jPanel4.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 150, 20));

        txtNroSerie1.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        txtNroSerie1.setBorder(null);
        txtNroSerie1.setMinimumSize(new java.awt.Dimension(60, 23));
        txtNroSerie1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNroSerie1ActionPerformed(evt);
            }
        });
        jPanel4.add(txtNroSerie1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 160, 30));
        jPanel4.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 160, 20));

        txtMarca.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        txtMarca.setBorder(null);
        txtMarca.setMinimumSize(new java.awt.Dimension(60, 23));
        jPanel4.add(txtMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 160, 30));
        jPanel4.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 160, 20));

        botonEditar.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        botonEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoaula/imagenes/editar-codigo.png"))); // NOI18N
        botonEditar.setText("Editar");
        botonEditar.setBorder(null);
        botonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEditarActionPerformed(evt);
            }
        });
        jPanel4.add(botonEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 460, 100, 40));

        botonGuardar.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        botonGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoaula/imagenes/salvar.png"))); // NOI18N
        botonGuardar.setText("Guardar");
        botonGuardar.setBorder(null);
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });
        jPanel4.add(botonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 460, 110, 40));

        Mostrar.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        Mostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoaula/imagenes/mostrar.png"))); // NOI18N
        Mostrar.setText("Mostrar");
        Mostrar.setBorder(null);
        Mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarActionPerformed(evt);
            }
        });
        jPanel4.add(Mostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 460, 110, 40));

        botonEliminar.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        botonEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoaula/imagenes/borrar.png"))); // NOI18N
        botonEliminar.setText("Eliminar");
        botonEliminar.setBorder(null);
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });
        jPanel4.add(botonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 520, 110, 40));

        Cancelar.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        Cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoaula/imagenes/cancelado.png"))); // NOI18N
        Cancelar.setText("Cancelar");
        Cancelar.setBorder(null);
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });
        jPanel4.add(Cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 520, 110, 40));

        Principal.addTab("0", jPanel4);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("Cédula:");
        jPanel9.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 70, 30));

        txtGastos.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        txtGastos.setBorder(null);
        jPanel9.add(txtGastos, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 150, 30));

        jSeparator5.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator5.setForeground(new java.awt.Color(204, 204, 204));
        jPanel9.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 150, 20));

        Guardar.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        Guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoaula/imagenes/salvar.png"))); // NOI18N
        Guardar.setText("Guardar");
        Guardar.setBorder(null);
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });
        jPanel9.add(Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 460, 120, 40));

        Mostrar1.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        Mostrar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoaula/imagenes/mostrar.png"))); // NOI18N
        Mostrar1.setText("Mostrar");
        Mostrar1.setBorder(null);
        Mostrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mostrar1ActionPerformed(evt);
            }
        });
        jPanel9.add(Mostrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 460, 120, 40));

        Editar.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        Editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoaula/imagenes/editar-codigo.png"))); // NOI18N
        Editar.setText("Editar");
        Editar.setBorder(null);
        Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarActionPerformed(evt);
            }
        });
        jPanel9.add(Editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 510, 120, 40));

        Eliminar.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        Eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoaula/imagenes/borrar.png"))); // NOI18N
        Eliminar.setText("Eliminar");
        Eliminar.setBorder(null);
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });
        jPanel9.add(Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 510, 120, 40));

        jSeparator6.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator6.setForeground(new java.awt.Color(204, 204, 204));
        jPanel9.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 150, 20));

        txtuso.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        txtuso.setBorder(null);
        txtuso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusoActionPerformed(evt);
            }
        });
        jPanel9.add(txtuso, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 150, 30));

        jLabel10.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Nro.Serie:");
        jPanel9.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 80, -1));

        jLabel11.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("Gasto:");
        jPanel9.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 60, 30));

        jLabel12.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("Horas de Uso:");
        jPanel9.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 110, -1));

        txtCedula2.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        txtCedula2.setBorder(null);
        jPanel9.add(txtCedula2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 150, 30));

        jSeparator7.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator7.setForeground(new java.awt.Color(204, 204, 204));
        jPanel9.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 150, 20));

        txtNroSerie2.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        txtNroSerie2.setBorder(null);
        jPanel9.add(txtNroSerie2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 150, 30));

        jSeparator8.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator8.setForeground(new java.awt.Color(204, 204, 204));
        jPanel9.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 150, 20));

        gastosTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, "", "", null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Electrodoméstico", "Nro.serie", "Gasto", "Fecha", "horas"
            }
        ));
        gastosTable.setAltoHead(25);
        gastosTable.setColorBackgoundHead(new java.awt.Color(66, 66, 66));
        gastosTable.setColorFilasBackgound2(new java.awt.Color(240, 240, 240));
        gastosTable.setColorFilasForeground1(new java.awt.Color(51, 51, 51));
        gastosTable.setColorFilasForeground2(new java.awt.Color(51, 51, 51));
        gastosTable.setFuenteFilas(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        gastosTable.setFuenteHead(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        gastosTable.setGrosorBordeFilas(0);
        gastosTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gastosTableMouseClicked(evt);
            }
        });
        jScrollPane9.setViewportView(gastosTable);

        jPanel9.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 50, 570, 390));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoaula/imagenes/luz-de-ahorro-de-energia.png"))); // NOI18N
        jPanel9.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, 260, 260));

        calcular.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        calcular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoaula/imagenes/calcular.png"))); // NOI18N
        calcular.setText("Calcular");
        calcular.setBorder(null);
        calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularActionPerformed(evt);
            }
        });
        jPanel9.add(calcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 460, 120, 40));

        jSeparator9.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator9.setForeground(new java.awt.Color(204, 204, 204));
        jPanel9.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, 150, 20));

        txtFecha.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        txtFecha.setBorder(null);
        txtFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaActionPerformed(evt);
            }
        });
        jPanel9.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 150, 30));

        jLabel13.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setText("Fecha/Hora:");
        jPanel9.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 90, -1));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, 1058, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, 585, Short.MAX_VALUE)
        );

        Principal.addTab("1", jPanel6);

        jPanel1.add(Principal, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 50, -1, 620));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 671, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel8AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jPanel8AncestorAdded
        Principal.setSelectedIndex(0);
    }//GEN-LAST:event_jPanel8AncestorAdded

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        txtElectrodomestico.setText("");
        txtNroSerie1.setText("");
        txtMarca.setText("");
    }//GEN-LAST:event_CancelarActionPerformed

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
     EliminarElectrodomestico();
        
    }//GEN-LAST:event_botonEliminarActionPerformed

    private void MostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarActionPerformed
       MostrarElectrodomestico();
       limpiarCampos();
       
    }//GEN-LAST:event_MostrarActionPerformed
    private void guardarElectrodomestico() {

       Electrodomestico electrodomestico = recuperarDatosGUI();
    

    // Verificar si la cédula actual es diferente a la cédula inicial
    if (!electrodomestico.getCedula().equals(cedulaInicial)) {
        JOptionPane.showMessageDialog(rootPane, "No se permite guardar un electrodoméstico con una cédula diferente a la inicialmente ingresada");
        return;
    }

    String strSentenciaInsert = String.format("INSERT INTO Electrodomesticos (Cedula, Nombre, NroSerie, Marca) "
            + "VALUES ('%s', '%s', '%s', '%s')", electrodomestico.getCedula(), electrodomestico.getNombreE(), electrodomestico.getNroserie(), electrodomestico.getMarca());

    objConexion.ejecutarSentenciaSQL(strSentenciaInsert);
    this.MostrarElectrodomestico();

    }

    public Electrodomestico recuperarDatosGUI() {
        Electrodomestico electrodomestico = new Electrodomestico();
        String nombreElectrodomestico = txtElectrodomestico.getText();
        String nroSerie = txtNroSerie1.getText();
        String marca = txtMarca.getText();
        String cedula = txtCedula1.getText();

        if (nombreElectrodomestico.isEmpty() || nroSerie.isEmpty() || marca.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Rellene todos los campos antes de continuar", "Error", JOptionPane.INFORMATION_MESSAGE);
            return null;
        }

        electrodomestico.setNombreE(txtElectrodomestico.getText());
        electrodomestico.setNroserie(txtNroSerie1.getText());
        electrodomestico.setMarca(txtMarca.getText());
        electrodomestico.setCedula(txtCedula1.getText());

        return electrodomestico;
    }
    
    public void MostrarElectrodomestico() {
    String cedula = txtCedula1.getText();
    // Verificar si el campo cedula está lleno
    if (cedula.isEmpty()) {
        JOptionPane.showMessageDialog(rootPane, "El campo cédula está vacío");
        return;
    }
    // Limpiar la tabla antes de agregar nuevos datos
    modelo.setRowCount(0);
    ConexionElectrodomestico objConexion = new ConexionElectrodomestico();
    try {
        // Consulta para obtener los registros con la cedula proporcionada
        String consulta = String.format("SELECT * FROM Electrodomesticos WHERE Cedula = '%s'", cedula);
        ResultSet resultado = objConexion.consultarRegistros(consulta);
        boolean registrosEncontrados = false;
        // Iterar a través de los resultados y agregar a la tabla si hay registros
        while (resultado.next()) {
            registrosEncontrados = true;
            Object[] electrodomesticos = {
                resultado.getString("Cedula"),
                resultado.getString("Nombre"),
                resultado.getString("NroSerie"),
                resultado.getString("Marca"),
            };
            modelo.addRow(electrodomesticos);
        }
        // Mostrar mensaje si no se encontraron registros
        if (!registrosEncontrados) {
            JOptionPane.showMessageDialog(rootPane, "No se encontraron registros con la cédula proporcionada");
        } else {
            JOptionPane.showMessageDialog(rootPane, "Se encontraron registros con la cédula proporcionada");
        }
    } catch (Exception e) {
        System.out.println(e);
    }
    // Establecer la cédula en el campo de texto nuevamente
    txtCedula1.setText(cedula);
   }
    
    //metodo para eliminar
    public void EliminarElectrodomestico() {
    Electrodomestico electrodomestico = recuperarDatosGUI();
    String strSentenciaDelete = String.format("DELETE FROM Electrodomesticos WHERE NroSerie='%s'", electrodomestico.getNroserie());

    objConexion.ejecutarSentenciaSQL(strSentenciaDelete);
    this.MostrarElectrodomestico();
    }
    
    //metodo para editar
    public void EditarElectrodomesticos() {
    String cedula = txtCedula1.getText(); // Obtener la cédula ingresada

    // Verificar si el campo cédula está vacío
    if (cedula.isEmpty()) {
        JOptionPane.showMessageDialog(rootPane, "El campo cédula está vacío");
        return;
    }
    Electrodomestico electrodomestico = recuperarDatosGUI();
    // Verificar si se intenta cambiar la cédula
    if (!cedulaInicial.equals(cedula) && existeElectrodomesticoConCedula(cedula)) {
        JOptionPane.showMessageDialog(rootPane, "Ya existe un electrodoméstico registrado con la cédula ingresada");
        return;
    }
    String strSentenciaUpdate = String.format("UPDATE Electrodomesticos SET Cedula='%s', Nombre='%s', Marca='%s' WHERE NroSerie='%s'", cedula, electrodomestico.getNombreE(), electrodomestico.getMarca(), electrodomestico.getNroserie());
    objConexion.ejecutarSentenciaSQL(strSentenciaUpdate);

    // Actualizar la tabla para mostrar los electrodomésticos actualizados
    DefaultTableModel modelo = (DefaultTableModel) tablaelectrodomestico.getModel();
    modelo.setRowCount(0);
    try {
        // Consulta para obtener los electrodomésticos con la cédula actual
        String consulta = String.format("SELECT * FROM Electrodomesticos WHERE Cedula = '%s'", cedula);
        ResultSet resultado = objConexion.consultarRegistros(consulta);
        boolean registrosEncontrados = false;
        // Iterar a través de los resultados y agregar a la tabla
        while (resultado.next()) {
            registrosEncontrados = true;
            String cedulaDB = resultado.getString("Cedula");
            String nombre = resultado.getString("Nombre");
            String nroSerie = resultado.getString("NroSerie");
            String marca = resultado.getString("Marca");
            Object[] electrodomesticos = {
                cedulaDB,
                nombre,
                nroSerie,
                marca
            };
            modelo.addRow(electrodomesticos);
        }

        // Mostrar mensaje si no se encontraron registros
        if (!registrosEncontrados) {
            JOptionPane.showMessageDialog(rootPane, "No se encontraron electrodomésticos con la cédula actual");
        } else {
            JOptionPane.showMessageDialog(rootPane, "Se actualizó el electrodoméstico y se mostraron los registros con la cédula actual");
        }
    } catch (Exception e) {
        System.out.println(e);
    }
}

    private boolean existeElectrodomesticoConCedula(String cedula) {
    // Verificar si existe un electrodoméstico con la cédula especificada en la base de datos
    String consulta = String.format("SELECT COUNT(*) FROM Electrodomesticos WHERE Cedula = '%s'", cedula);
    ResultSet resultado = objConexion.consultarRegistros(consulta);

    try {
        if (resultado.next()) {
            int count = resultado.getInt(1);
            return count > 0;
        }
    } catch (SQLException e) {
        System.out.println(e);
    }

    return false;
    }
    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed
       guardarElectrodomestico();
       limpiarCampos();
    }//GEN-LAST:event_botonGuardarActionPerformed

    private void botonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEditarActionPerformed
    EditarElectrodomesticos();
    limpiarCampos();
    }//GEN-LAST:event_botonEditarActionPerformed

    private void tablaelectrodomesticoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaelectrodomesticoMouseClicked
        if (evt.getClickCount() == 1) {
            JTable recetor = (JTable) evt.getSource();
            
            txtCedula1.setText(recetor.getModel().getValueAt(recetor.getSelectedRow(), 0).toString());
            txtElectrodomestico.setText(recetor.getModel().getValueAt(recetor.getSelectedRow(), 1).toString());
            txtNroSerie1.setText(recetor.getModel().getValueAt(recetor.getSelectedRow(), 2).toString());
            txtMarca.setText(recetor.getModel().getValueAt(recetor.getSelectedRow(), 3).toString());

            botonGuardar.setEnabled(false);
            botonEditar.setEnabled(true);
            botonEliminar.setEnabled(true);

        }
    }//GEN-LAST:event_tablaelectrodomesticoMouseClicked
    //Aquí empiezan los métodos de gastos
    
    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
    
    }//GEN-LAST:event_GuardarActionPerformed

    private void Mostrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mostrar1ActionPerformed
      
    }//GEN-LAST:event_Mostrar1ActionPerformed

    private void EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarActionPerformed
       /* if (!txtCedula2.getText().isBlank() || !txtCedula2.getText().isEmpty()) {
            if (!txtNroSerie2.getText().isBlank() || !txtNroSerie2.getText().isEmpty()) {
                if (!txtFecha.getText().isBlank() || !txtFecha.getText().isEmpty() || !txtGastos.getText().isBlank() || !txtGastos.getText().isEmpty() || !txtuso.getText().isBlank() || !txtuso.getText().isEmpty()) {
                    if (txtGastos.getText().matches("\\d+(\\.\\d+)?") && txtuso.getText().matches("\\d+(\\.\\d+)?")) {
                        String fecha = txtFecha.getText();
                        double consumo = Double.parseDouble(txtGastos.getText());
                        double uso = Double.parseDouble(txtuso.getText());
                        gastos.fecha = fecha;
                        gastos.gasto = consumo;
                        gastos.horas = uso;
                        editarGastos(gastos);
                        txtuso.setText("");
                        txtGastos.setText("");
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "El campo de texto para gastos tiene que ser rellenado con números");
                    }
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Ingrese la fecha(AA-MM-DD) y/o el gasto del electrodomestico");
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Ingrese el número de serie del electrodoméstico.");
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Ingrese la cédula del usuario.");
        }*/
    }//GEN-LAST:event_EditarActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
       /* if (!txtCedula2.getText().isBlank() || !txtCedula2.getText().isEmpty()) {
            if (!txtNroSerie2.getText().isBlank() || !txtNroSerie2.getText().isEmpty()) {
                if (!txtFecha.getText().isBlank() || !txtFecha.getText().isEmpty()) {
                    gastos.fecha = txtFecha.getText();
                    eliminarGasto(gastos);
                } else {
                    JOptionPane.showMessageDialog(rootPane, "ingrese la fecha(AA/MM/DD) y/o el gasto del electrodomestico");
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "ingrese el numero de serie del electrodomestico");
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "ingrese la cedula del usuarios");
        }*/
    }//GEN-LAST:event_EliminarActionPerformed

    private void RegresarVentanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarVentanaActionPerformed
        VentanaLogin abc = new VentanaLogin();
        abc.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_RegresarVentanaActionPerformed

    private void gastosTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gastosTableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_gastosTableMouseClicked

    private void txtusoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusoActionPerformed

    private void txtNroSerie1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNroSerie1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNroSerie1ActionPerformed

    private void calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularActionPerformed
       /* if (!txtCedula2.getText().isBlank() || !txtCedula2.getText().isEmpty()) {
            if (!txtNroSerie2.getText().isBlank() || !txtNroSerie2.getText().isEmpty()) {
                calcularPromedioGastos();
            } else {
                JOptionPane.showMessageDialog(rootPane, "ingrese el numero de serie del electrodomestico");
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "ingrese la cedula del usuarios");
        }*/
    }//GEN-LAST:event_calcularActionPerformed

    private void jPanel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseClicked
        Principal.setSelectedIndex(0);
    }//GEN-LAST:event_jPanel8MouseClicked

    private void jPanel8MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseMoved
        jPanel8.setBackground(new Color(205,205,205));
    }//GEN-LAST:event_jPanel8MouseMoved

    private void jPanel8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseExited
        jPanel8.setBackground(new Color(66, 66, 66));
    }//GEN-LAST:event_jPanel8MouseExited

    private void jPanel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseClicked
        Principal.setSelectedIndex(1);
    }//GEN-LAST:event_jPanel7MouseClicked

    private void jPanel7MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseMoved
        jPanel7.setBackground(new Color(205,205,205));
    }//GEN-LAST:event_jPanel7MouseMoved

    private void jPanel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseExited
        jPanel7.setBackground(new Color(66, 66, 66));
    }//GEN-LAST:event_jPanel7MouseExited

    private void txtFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancelar;
    private javax.swing.JButton Editar;
    private javax.swing.JButton Eliminar;
    private javax.swing.JButton Guardar;
    private javax.swing.JButton Mostrar;
    private javax.swing.JButton Mostrar1;
    private javax.swing.JTabbedPane Principal;
    private javax.swing.JButton RegresarVentana;
    private javax.swing.JButton botonEditar;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonGuardar;
    private javax.swing.JButton calcular;
    private rojerusan.RSTableMetro gastosTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private rojerusan.RSTableMetro tablaelectrodomestico;
    private javax.swing.JTextField txtCedula1;
    private javax.swing.JTextField txtCedula2;
    private javax.swing.JTextField txtElectrodomestico;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtGastos;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtNroSerie1;
    private javax.swing.JTextField txtNroSerie2;
    private javax.swing.JTextField txtuso;
    // End of variables declaration//GEN-END:variables
}
