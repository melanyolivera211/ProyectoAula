package proyectoaula.conexionBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConexionUsuario {

    Connection cn = null;

    public Connection conectar() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost/login-proyecto", "root", "");
            System.out.println("Conexión exitosa");
        } catch (SQLException e) {
            System.out.println("Conexión fallida: " + e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConexionUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cn;
    }

}
