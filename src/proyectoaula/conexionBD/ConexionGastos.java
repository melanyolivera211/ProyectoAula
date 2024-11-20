package proyectoaula.conexionBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author Luis Maldonado
 */
public class ConexionGastos {
    
    String currentDir = System.getProperty("user.dir");
    String strConexionDB = "jdbc:sqlite:" + currentDir + "/BD/BD.s3db";
    Connection conn;

    public ConexionGastos() {
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
    
       public void cerrarConexion() {
        if (conn != null) {
            try {
                conn.close();
                System.out.println("Conexión cerrada.");
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión: " + e.getMessage());
            }
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

    public boolean verificarInicioSesion(String cedula, String contraseña) {
        String strSentenciaSelect = "SELECT COUNT(*) FROM Usuarios WHERE Cedula = ? AND Clave = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(strSentenciaSelect)) {
            pstmt.setString(1, cedula);
            pstmt.setString(2, contraseña);
            ResultSet rs = pstmt.executeQuery();
            int count = rs.getInt(1);
            return count > 0; // Devuelve true si se encuentra al menos un registro con la cédula y contraseña dadas
        } catch (SQLException e) {
            System.out.println("Error al verificar inicio de sesión: " + e.getMessage());
            return false;
        }
    }
}
