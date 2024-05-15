/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoaula.conexionBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author pc
 */
public class ConexionElectrodomestico {
     String currentDir = System.getProperty("user.dir");
    String strConexionDB = "jdbc:sqlite:" + currentDir + "/BD/usuariosBD.s3db";
    Connection conn;

    public ConexionElectrodomestico() {
        try {
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection(strConexionDB);

            System.out.println("Conexion establecida");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error de conexion " + e);
        }
    }

    public int ejecutarSentenciaSQL(String strSentenciaSQL) {
        try {
            PreparedStatement pstm = conn.prepareStatement(strSentenciaSQL);
            pstm.execute();
            return 1;
        } catch (SQLException e) {
            System.out.println(e);
            return 0;
        }

    }

    public ResultSet consultarRegistros(String strSentenciaSQL) {
        try {
            PreparedStatement pstm = conn.prepareStatement(strSentenciaSQL);
            ResultSet respuesta = pstm.executeQuery();
            return respuesta;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }

    }
}

