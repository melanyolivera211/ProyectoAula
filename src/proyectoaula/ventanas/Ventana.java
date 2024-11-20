package proyectoaula.ventanas;

import com.mysql.cj.jdbc.result.ResultSetMetaData;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import proyectoaula.conexionBD.ConexionUsuario;
import java.sql.PreparedStatement;
import proyectoaula.objects.Usuario;
import java.awt.Color;
import java.sql.Date;
import java.sql.DriverManager;
import javax.swing.table.DefaultTableModel;

public class Ventana extends javax.swing.JFrame {
    ConexionUsuario conex = new ConexionUsuario();
    Connection cn = conex.conectar();
    DefaultTableModel modelo;

    DefaultTableModel model = new DefaultTableModel();

    DefaultTableModel modelo2;

    private String cedulaUsuario;
    private String cedula;
    private String cedulaInicial;

    public Ventana(String cedula) {

        initComponents();
        this.cedula = cedula;
        txtCedula2.setText(cedula);
        String[] titulos = {"Cedula", "Electrodomestico", "NroSerie", "Marca"};
        modelo = new DefaultTableModel(null, titulos);
        tablaelectrodomestico.setModel(modelo);
        this.cedulaInicial = cedula;
        txtCedula1.setText(cedula);

        String[] titulos2 = {"Cedula", "NroSerie", "Gastos", "HorasUso", "Fecha", "GastMes"};
        modelo2 = new DefaultTableModel(null, titulos2);
        gastosTable.setModel(modelo2);
        this.cedula = cedula;
        txtCedula2.setText(cedula);

    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
        this.cedulaInicial = cedula;
        txtCedula2.setText(cedula);
        txtCedula1.setText(cedula);
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
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        usuarios = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
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
        botonBuscar = new javax.swing.JButton();
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
        txtPromedio = new javax.swing.JLabel();
        txtElectrodomestico2 = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(66, 66, 66));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Lucida Sans", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("GESTIÓN DE ELECTRODOMÉSTICOS");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 670, 50));

        usuarios.setBackground(new java.awt.Color(66, 66, 66));
        usuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoaula/imagenes/usuario1.png"))); // NOI18N
        usuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuariosActionPerformed(evt);
            }
        });
        jPanel2.add(usuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 20, 90, 80));

        jLabel16.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Mi Perfil");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 100, 90, 20));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, -10, 1100, 130));

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

        jLabel8.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoaula/imagenes/rayo.png"))); // NOI18N
        jLabel8.setText("Administrar gastos");
        jPanel7.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 220, 60));

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

        jLabel4.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoaula/imagenes/home-appliance.png"))); // NOI18N
        jLabel4.setText("Explorar electrodomésticos");
        jPanel8.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 290, 60));

        jPanel3.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 188, 320, 120));

        RegresarVentana.setBackground(new java.awt.Color(102, 102, 102));
        RegresarVentana.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        RegresarVentana.setText("Cerrar sesión");
        RegresarVentana.setBorder(null);
        RegresarVentana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarVentanaActionPerformed(evt);
            }
        });
        jPanel3.add(RegresarVentana, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 480, 150, 60));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 760));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoaula/imagenes/electrodomesticos.png"))); // NOI18N
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 270, 260));

        jLabel5.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Cédula:");
        jLabel5.setPreferredSize(new java.awt.Dimension(60, 23));
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 150, -1));

        txtCedula1.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        txtCedula1.setBorder(null);
        txtCedula1.setMinimumSize(new java.awt.Dimension(60, 23));
        jPanel4.add(txtCedula1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 150, 30));

        jLabel2.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Electrodomestico:");
        jLabel2.setPreferredSize(new java.awt.Dimension(60, 23));
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 150, -1));

        jLabel1.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Nro. Serie:");
        jLabel1.setPreferredSize(new java.awt.Dimension(60, 23));
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 160, -1));

        jLabel3.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Marca:");
        jLabel3.setPreferredSize(new java.awt.Dimension(60, 23));
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 160, -1));

        tablaelectrodomestico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Cédula", "Electrodomestico", "Nro. Serie", "Marca"
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

        jPanel4.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 40, 580, 390));
        jPanel4.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 150, 20));

        txtElectrodomestico.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        txtElectrodomestico.setBorder(null);
        txtElectrodomestico.setMinimumSize(new java.awt.Dimension(60, 23));
        jPanel4.add(txtElectrodomestico, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 150, 30));
        jPanel4.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 150, 20));

        txtNroSerie1.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        txtNroSerie1.setBorder(null);
        txtNroSerie1.setMinimumSize(new java.awt.Dimension(60, 23));
        txtNroSerie1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNroSerie1ActionPerformed(evt);
            }
        });
        jPanel4.add(txtNroSerie1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 160, 30));
        jPanel4.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 160, 20));

        txtMarca.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        txtMarca.setBorder(null);
        txtMarca.setMinimumSize(new java.awt.Dimension(60, 23));
        jPanel4.add(txtMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 160, 30));
        jPanel4.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 160, 20));

        botonEditar.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        botonEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoaula/imagenes/editar-codigo.png"))); // NOI18N
        botonEditar.setText("Editar");
        botonEditar.setBorder(null);
        botonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEditarActionPerformed(evt);
            }
        });
        jPanel4.add(botonEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 530, 100, 40));

        botonGuardar.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        botonGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoaula/imagenes/salvar.png"))); // NOI18N
        botonGuardar.setText("Guardar");
        botonGuardar.setBorder(null);
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });
        jPanel4.add(botonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 470, 110, 40));

        Mostrar.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        Mostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoaula/imagenes/mostrar.png"))); // NOI18N
        Mostrar.setText("Mostrar");
        Mostrar.setBorder(null);
        Mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarActionPerformed(evt);
            }
        });
        jPanel4.add(Mostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 470, 110, 40));

        botonEliminar.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        botonEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoaula/imagenes/borrar.png"))); // NOI18N
        botonEliminar.setText("Eliminar");
        botonEliminar.setBorder(null);
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });
        jPanel4.add(botonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 530, 110, 40));

        botonBuscar.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        botonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoaula/imagenes/buscar.png"))); // NOI18N
        botonBuscar.setText("Buscar");
        botonBuscar.setBorder(null);
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });
        jPanel4.add(botonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 470, 110, 40));

        Cancelar.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        Cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoaula/imagenes/cancelado.png"))); // NOI18N
        Cancelar.setText("Cancelar");
        Cancelar.setBorder(null);
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });
        jPanel4.add(Cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 530, 110, 40));

        Principal.addTab("0", jPanel4);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("Cédula:");
        jPanel9.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 70, 30));

        txtGastos.setBorder(null);
        jPanel9.add(txtGastos, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 150, 30));

        jSeparator5.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator5.setForeground(new java.awt.Color(51, 51, 51));
        jPanel9.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 150, 20));

        Guardar.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        Guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoaula/imagenes/salvar.png"))); // NOI18N
        Guardar.setText("Guardar");
        Guardar.setBorder(null);
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });
        jPanel9.add(Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 480, 120, 40));

        Mostrar1.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        Mostrar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoaula/imagenes/mostrar.png"))); // NOI18N
        Mostrar1.setText("Mostrar");
        Mostrar1.setBorder(null);
        Mostrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mostrar1ActionPerformed(evt);
            }
        });
        jPanel9.add(Mostrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 480, 120, 40));

        Editar.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        Editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoaula/imagenes/editar-codigo.png"))); // NOI18N
        Editar.setText("Editar");
        Editar.setBorder(null);
        Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarActionPerformed(evt);
            }
        });
        jPanel9.add(Editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 530, 120, 40));

        Eliminar.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        Eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoaula/imagenes/borrar.png"))); // NOI18N
        Eliminar.setText("Eliminar");
        Eliminar.setBorder(null);
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });
        jPanel9.add(Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 530, 120, 40));

        jSeparator6.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        jPanel9.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 150, 20));

        txtuso.setBorder(null);
        txtuso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusoActionPerformed(evt);
            }
        });
        jPanel9.add(txtuso, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 150, 30));

        jLabel10.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Electrodoméstico:");
        jPanel9.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 150, -1));

        jLabel11.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("Potencia:");
        jPanel9.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, 90, 30));

        jLabel12.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("Horas de Uso:");
        jPanel9.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 110, -1));

        txtCedula2.setBorder(null);
        jPanel9.add(txtCedula2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 150, 30));

        jSeparator7.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator7.setForeground(new java.awt.Color(51, 51, 51));
        jPanel9.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 150, 20));

        txtNroSerie2.setBorder(null);
        jPanel9.add(txtNroSerie2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 150, 30));

        jSeparator8.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator8.setForeground(new java.awt.Color(0, 0, 0));
        jPanel9.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 150, 20));

        gastosTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, "", "", null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Electrodoméstico", "Nro.serie", "Gasto", "Fecha", "Horas de uso"
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

        jPanel9.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 60, 570, 390));

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
        jPanel9.add(calcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 480, 120, 40));

        jSeparator9.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator9.setForeground(new java.awt.Color(0, 0, 0));
        jPanel9.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 150, 20));

        txtFecha.setBorder(null);
        txtFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaActionPerformed(evt);
            }
        });
        jPanel9.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, 150, 30));

        jLabel13.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setText("Fecha/Hora:");
        jPanel9.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 90, -1));
        jPanel9.add(txtPromedio, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 110, 30));

        txtElectrodomestico2.setBorder(null);
        txtElectrodomestico2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtElectrodomestico2ActionPerformed(evt);
            }
        });
        jPanel9.add(txtElectrodomestico2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 150, 30));
        jPanel9.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 350, -1, -1));

        jLabel17.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel17.setText("Nro.Serie:");
        jPanel9.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 80, -1));

        jSeparator10.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator10.setForeground(new java.awt.Color(0, 0, 0));
        jPanel9.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, 150, 20));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, 1060, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, 645, Short.MAX_VALUE)
        );

        Principal.addTab("1", jPanel6);

        jPanel1.add(Principal, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, 1060, 680));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel8AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jPanel8AncestorAdded
        Principal.setSelectedIndex(1);
    }//GEN-LAST:event_jPanel8AncestorAdded

    PreparedStatement ps;
    ResultSet rs;

    public static Connection getConection() {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/proyectobd", "root", "");
            JOptionPane.showMessageDialog(null, "Conexion exitosa");
        } catch (Exception e) {
            System.out.println(e);
        }
        return con;

    }

    private void guardarElectrodomesticoGasto() {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet resultado = null;
        try {
            // Obtener la conexión
            con = getConection();

            // Crear la sentencia SQL para verificar si la fecha ya existe
            String consultaFecha = "SELECT COUNT(*) AS total FROM gastos WHERE Fecha = ?";
            ps = con.prepareStatement(consultaFecha);
            ps.setDate(1, Date.valueOf(txtFecha.getText()));
            resultado = ps.executeQuery();

            if (resultado.next() && resultado.getInt("total") > 0) {
                // Si la fecha ya existe, mostrar mensaje y no realizar la inserción
                JOptionPane.showMessageDialog(null, "Ya existe un registro con la misma fecha. No se puede guardar el registro.");
            } else {
                // Si la fecha no existe, proceder con la inserción
                String strSentenciaInsert = "INSERT INTO gastos (Cedula, NroSerie, Electrodomestico, Gasto, HorasUso, Fecha, GastoMes) VALUES (?, ?, ?, ?, ?, ?, ?)";
                ps = con.prepareStatement(strSentenciaInsert);
                ps.setString(1, txtCedula2.getText());
                ps.setString(2, txtNroSerie2.getText());
                ps.setString(3, txtElectrodomestico2.getText());
                ps.setString(4, txtGastos.getText());
                ps.setString(5, txtuso.getText());
                ps.setDate(6, Date.valueOf(txtFecha.getText()));
                var gastoMes = Double.parseDouble(txtGastos.getText()) * Double.parseDouble(txtuso.getText());
                ps.setString(7, String.valueOf(gastoMes));

                ps.execute();

                JOptionPane.showMessageDialog(null, "Gasto guardado exitosamente.");

                MostrarElectrodomestico();

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al guardar gasto.");
            e.printStackTrace();
        }

    }
    
    public void MostrarElectrodomestico() {
        try {
            // Limpiar filas del modelo antes de agregar nuevos datos
            model.setRowCount(0);
            // Solo agregar columnas si el modelo no tiene columnas
            if (model.getColumnCount() == 0) {
                model.addColumn("ID");
                model.addColumn("Cedula");
                model.addColumn("NroSerie");
                model.addColumn("Electrodomestico");
                model.addColumn("Gasto");
                model.addColumn("HorasUso");
                model.addColumn("Fecha");
                model.addColumn("GastoMes");
            }
            gastosTable.setModel(model);
            PreparedStatement ps = null;
            ResultSet rs = null;
            Ventana conn = new Ventana();
            Connection con = conn.getConection();

            String sql = "SELECT Id, cedula, NroSerie, Electrodomestico, Gasto, HorasUso, Fecha, GastoMes FROM gastos ";
            System.out.println(sql);

            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

            int[] anchos = {20, 50, 100, 100, 50, 50, 100, 50};

            for (int x = 0; x < cantidadColumnas; x++) {
                gastosTable.getColumnModel().getColumn(x).setPreferredWidth(anchos[x]);
            }
            // Llenar las filas con los datos obtenidos
            while (rs.next()) {
                Object[] filas = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                model.addRow(filas);
            }
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }

    public void guardar_electrodomestco() {
        String cedula1 = txtCedula1.getText();
        String nombreElectrodomestico = txtElectrodomestico.getText();
        String nroSerie = txtNroSerie1.getText();
        String marca = txtMarca.getText();

        if (cedula1.isEmpty() || nombreElectrodomestico.isEmpty() || nroSerie.isEmpty() || marca.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Completar todos los datos");
        } else {
            try {
                String consulta = "INSERT INTO `electromesticos` (`cedula`, `e.nombre`, `nro.serie`, `marca`) VALUES (?, ?, ?, ?)";
                PreparedStatement ps = cn.prepareStatement(consulta);

                ps.setString(1, cedula1);
                ps.setString(2, nombreElectrodomestico);
                ps.setString(3, nroSerie);
                ps.setString(4, marca);

                ps.executeUpdate();

                limpiarCampos();

                JOptionPane.showMessageDialog(null, "Electrodoméstico registrado correctamente");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "No se pudo registrar el electrodoméstico: " + e);
            }
        }

    }

    public void editar_electrodomestico() {
        String cedula1 = txtCedula1.getText();
        String nombreElectrodomestico = txtElectrodomestico.getText();
        String nroSerie = txtNroSerie1.getText();
        String marca = txtMarca.getText();

        if (cedula1.isEmpty() || nombreElectrodomestico.isEmpty() || nroSerie.isEmpty() || marca.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Completar todos los datos para editar");
        } else {
            try {
                PreparedStatement ps = cn.prepareStatement("UPDATE `electromesticos` SET `e.nombre` = '" + nombreElectrodomestico
                        + "', `marca` = '" + marca + "' WHERE `cedula` = '" + cedula1 + "' AND `nro.serie` = '" + nroSerie + "'");
                int filasEliminadas = ps.executeUpdate();

                if (filasEliminadas > 0) {
                    limpiarCampos();
                    JOptionPane.showMessageDialog(null, "Electrodoméstico eliminado correctamente");
                } else {
                    JOptionPane.showMessageDialog(null, "No se encontró el electrodoméstico con la cédula y el número de serie especificados");
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "No se pudo actualizar el electrodoméstico: " + e);
            }
        }
    }

    public void eliminar_electrodomestico() {
        String cedula1 = txtCedula1.getText();
        String nroSerie = txtNroSerie1.getText();

        if (cedula1.isEmpty() || nroSerie.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Especifique la cédula y el número de serie del electrodoméstico a eliminar");
        } else {
            try {

                PreparedStatement ps = cn.prepareStatement("DELETE FROM `electromesticos` WHERE `cedula` = '" + cedula1 + "' AND `nro.serie` = '" + nroSerie + "'");

                int filasEliminadas = ps.executeUpdate();

                if (filasEliminadas > 0) {
                    limpiarCampos();
                    JOptionPane.showMessageDialog(null, "Electrodoméstico eliminado correctamente");
                } else {
                    JOptionPane.showMessageDialog(null, "No se encontró el electrodoméstico con la cédula y el número de serie especificados");
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "No se pudo eliminar el electrodoméstico: " + e);
            }
        }
    }

    public void mostrar_electrodomesticos() {
        String cedula1 = txtCedula1.getText();

        if (cedula1.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese una cédula para buscar los electrodomésticos.");
        } else {
            try {
                modelo.setRowCount(0);

                PreparedStatement ps = cn.prepareStatement("SELECT `cedula`, `e.nombre`, `nro.serie`, `marca` FROM `electromesticos` WHERE `cedula` = ?");
                ps.setString(1, cedula1);
                ResultSet rs = ps.executeQuery();

                while (rs.next()) {
                    String[] fila = {
                        rs.getString("cedula"),
                        rs.getString("e.nombre"),
                        rs.getString("nro.serie"),
                        rs.getString("marca")
                    };
                    modelo.addRow(fila);
                }
                if (modelo.getRowCount() == 0) {
                    JOptionPane.showMessageDialog(null, "No se encontraron electrodomésticos para la cédula especificada.");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al mostrar los electrodomésticos: " + e);
            }
        }
    }
    public void buscar_electrodomestico() {
        String cedula1 = txtCedula1.getText();
        String nroSerie = txtNroSerie1.getText();

        if (cedula1.isEmpty() || nroSerie.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese la cédula y el número de serie para buscar el electrodoméstico.");
        } else {
            try {

                PreparedStatement ps = cn.prepareStatement("SELECT `cedula`, `e.nombre`, `nro.serie`, `marca` FROM `electromesticos` WHERE `cedula` = '" + cedula1 + "' AND `nro.serie` = '" + nroSerie + "'");
                ResultSet rs = ps.executeQuery();
                if (rs.next()) {
                    txtCedula1.setText(rs.getString("cedula"));
                    txtElectrodomestico.setText(rs.getString("e.nombre"));
                    txtNroSerie1.setText(rs.getString("nro.serie"));
                    txtMarca.setText(rs.getString("marca"));
                    JOptionPane.showMessageDialog(null, "Electrodoméstico encontrado.");
                } else {
                    JOptionPane.showMessageDialog(null, "No se encontró un electrodoméstico con la cédula y el número de serie especificados.");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al buscar el electrodoméstico: " + e);
            }
        }
    }
    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_CancelarActionPerformed

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        buscar_electrodomestico();
    }//GEN-LAST:event_botonBuscarActionPerformed
    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        eliminar_electrodomestico();
        mostrar_electrodomesticos();
        limpiarCampos();
    }//GEN-LAST:event_botonEliminarActionPerformed
    private void MostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarActionPerformed
        mostrar_electrodomesticos();
    }//GEN-LAST:event_MostrarActionPerformed
    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed
        guardar_electrodomestco();
        mostrar_electrodomesticos();
        limpiarCampos();
    }//GEN-LAST:event_botonGuardarActionPerformed
    private void botonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEditarActionPerformed
        editar_electrodomestico();
        mostrar_electrodomesticos();
        limpiarCampos();
    }//GEN-LAST:event_botonEditarActionPerformed
    private void tablaelectrodomesticoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaelectrodomesticoMouseClicked
    }//GEN-LAST:event_tablaelectrodomesticoMouseClicked
    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
        if (txtCedula2.getText().isEmpty() || txtNroSerie2.getText().isEmpty() || txtGastos.getText().isEmpty() || txtuso.getText().isEmpty() || txtFecha.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Rellene todos los campos antes de continuar", "Error", JOptionPane.INFORMATION_MESSAGE);
            return; // Devuelve null si hay campos vacíos
        }
        float gasto = Integer.parseInt(txtuso.getText());
        if (gasto > 24) {
            JOptionPane.showMessageDialog(null, "Un dia no puede tener mas de 24 horas", "Error", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        guardarElectrodomesticoGasto();

    }//GEN-LAST:event_GuardarActionPerformed

    private void Mostrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mostrar1ActionPerformed
        String campo = txtCedula2.getText();
        String where = "";
        if (!"".equals(campo)) {
            where = "WHERE cedula = '" + campo + "'";
        }
        try {
            // Limpiar filas del modelo antes de agregar nuevos datos
            model.setRowCount(0);
            // Solo agregar columnas si el modelo no tiene columnas
            if (model.getColumnCount() == 0) {
                model.addColumn("ID");
                model.addColumn("Cedula");
                model.addColumn("NroSerie");
                model.addColumn("Electrodomestico");
                model.addColumn("Gasto");
                model.addColumn("HorasUso");
                model.addColumn("Fecha");
                model.addColumn("GastoMes");
            }

            gastosTable.setModel(model);

            PreparedStatement ps = null;
            ResultSet rs = null;
            Ventana conn = new Ventana();
            Connection con = conn.getConection();

            String sql = "SELECT Id, cedula, NroSerie, Electrodomestico, Gasto, HorasUso, Fecha, GastoMes FROM gastos " + where;
            System.out.println(sql);

            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();
            int[] anchos = {20, 50, 100, 100, 50, 50, 100, 50};
            for (int x = 0; x < cantidadColumnas; x++) {
                gastosTable.getColumnModel().getColumn(x).setPreferredWidth(anchos[x]);
            }
            // Llenar las filas con los datos obtenidos
            while (rs.next()) {
                Object[] filas = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                model.addRow(filas);
            }
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }//GEN-LAST:event_Mostrar1ActionPerformed
    private void limpiarCajas() {
        txtCedula2.setText(null);
        txtNroSerie2.setText(null);
        txtElectrodomestico2.setText(null);
        txtGastos.setText(null);
        txtuso.setText(null);
        txtFecha.setText(null);
    }
    private void EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarActionPerformed
        // Verificar que los campos no estén vacíos
        if (txtId.getText().isEmpty() || txtCedula2.getText().isEmpty() || txtNroSerie2.getText().isEmpty()
                || txtElectrodomestico2.getText().isEmpty() || txtGastos.getText().isEmpty()
                || txtuso.getText().isEmpty() || txtFecha.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios. Por favor, complete todos los campos.");
            return;
        }
        // Validar que el ID sea un número entero
        int id;
        try {
            id = Integer.parseInt(txtId.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "El ID debe ser un número entero válido.");
            return;
        }
        // Validar que los campos numéricos sean válidos
        double gasto;
        double horasUso;
        try {
            gasto = Double.parseDouble(txtGastos.getText());
            horasUso = Double.parseDouble(txtuso.getText());
            if (horasUso > 24) {
                JOptionPane.showMessageDialog(null, "Un dia no puede tener mas de 24 horas", "Error", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Los campos 'Gasto' y 'Horas de uso' deben contener valores numéricos válidos.");
            return;
        }
        // Validar formato de la fecha
        java.sql.Date fecha;
        try {
            fecha = java.sql.Date.valueOf(txtFecha.getText());
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, "El formato de la fecha es incorrecto. Use el formato 'YYYY-MM-DD'.");
            return;
        }
        // Calcular el gasto mensual
        double gastoMes = gasto * horasUso;

        try (Connection con = getConection(); PreparedStatement ps = con.prepareStatement(
                "UPDATE gastos SET Cedula=?, NroSerie=?, Electrodomestico=?, Gasto=?, HorasUso=?, Fecha=?, GastoMes=? WHERE Id=?")) {

            // Asignar los valores a la consulta preparada
            ps.setString(1, txtCedula2.getText());
            ps.setString(2, txtNroSerie2.getText());
            ps.setString(3, txtElectrodomestico2.getText());
            ps.setDouble(4, gasto);
            ps.setDouble(5, horasUso);
            ps.setDate(6, fecha);
            ps.setDouble(7, gastoMes);
            ps.setInt(8, id);

            // Ejecutar la actualización
            int res = ps.executeUpdate();

            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Registro modificado exitosamente.");
                limpiarCajas();
            } else {
                JOptionPane.showMessageDialog(null, "Error al modificar el registro. Verifique el ID.");
                limpiarCajas();
            }

        } catch (Exception ex) {
            System.out.println(ex);
        }

    }//GEN-LAST:event_EditarActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        if (txtId.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El campo ID es obligatorio. No se puede eliminar sin un ID, para hacerlo busque su cedula o seleccionela desde la tabl@a.");
            return; // Salir del método si el campo está vacío
        }
        Connection con = null;
        try {
            con = getConection();
            ps = con.prepareStatement("DELETE FROM gastos WHERE id=? ");
            ps.setInt(1, Integer.parseInt(txtId.getText()));

            int res = ps.executeUpdate();

            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Persona Eliminada");
                limpiarCajas();
            } else {
                JOptionPane.showMessageDialog(null, "error al Eliminar persona");
                limpiarCajas();
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_EliminarActionPerformed

    private void RegresarVentanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarVentanaActionPerformed
       
        VentanaLogin abc = new VentanaLogin();
        abc.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_RegresarVentanaActionPerformed

    private void gastosTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gastosTableMouseClicked
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            Ventana objCon = new Ventana();
            Connection conn = objCon.getConection();

            int Fila = gastosTable.getSelectedRow();
            String id = gastosTable.getValueAt(Fila, 0).toString();
            ps = conn.prepareStatement(" SELECT Id, Cedula, NroSerie, Electrodomestico, Gasto, HorasUso, Fecha FROM gastos WHERE Id =? ");
            ps.setString(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                txtId.setText(rs.getString("Id"));
                txtCedula2.setText(rs.getString("Cedula"));
                txtNroSerie2.setText(rs.getString("NroSerie"));
                txtElectrodomestico2.setText(rs.getString("Electrodomestico"));
                txtGastos.setText(rs.getString("Gasto"));
                txtuso.setText(rs.getString("HorasUso"));
                txtFecha.setText(rs.getString("Fecha"));
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_gastosTableMouseClicked

    private void txtusoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusoActionPerformed

    private void txtNroSerie1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNroSerie1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNroSerie1ActionPerformed

    private void calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularActionPerformed

        Calcular ventanaCalculo = new Calcular();
        ventanaCalculo.setVisible(true);
    }//GEN-LAST:event_calcularActionPerformed

    private void jPanel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseClicked
        Principal.setSelectedIndex(0);
    }//GEN-LAST:event_jPanel8MouseClicked

    private void jPanel8MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseMoved
        jPanel8.setBackground(new Color(205, 205, 205));
    }//GEN-LAST:event_jPanel8MouseMoved

    private void jPanel8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseExited
        jPanel8.setBackground(new Color(66, 66, 66));
    }//GEN-LAST:event_jPanel8MouseExited

    private void jPanel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseClicked
        Principal.setSelectedIndex(1);
    }//GEN-LAST:event_jPanel7MouseClicked

    private void jPanel7MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseMoved
        jPanel7.setBackground(new Color(205, 205, 205));
    }//GEN-LAST:event_jPanel7MouseMoved

    private void jPanel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseExited
        jPanel7.setBackground(new Color(66, 66, 66));
    }//GEN-LAST:event_jPanel7MouseExited

    private void txtFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaActionPerformed

    private void usuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuariosActionPerformed
        // TODO add your handling code here:
        Usuario abcd = new Usuario();
        abcd.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_usuariosActionPerformed

    private void txtElectrodomestico2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtElectrodomestico2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtElectrodomestico2ActionPerformed
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
    private javax.swing.JButton botonBuscar;
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
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
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
    private javax.swing.JSeparator jSeparator10;
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
    private javax.swing.JTextField txtElectrodomestico2;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtGastos;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtNroSerie1;
    private javax.swing.JTextField txtNroSerie2;
    private javax.swing.JLabel txtPromedio;
    private javax.swing.JTextField txtuso;
    private javax.swing.JButton usuarios;
    // End of variables declaration//GEN-END:variables
}
