package ejercicio1.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OpenConnection {

	public Connection getNetworkConnection() throws SQLException {
        String usuario = "root";
        String password = "pvega7721";

        String url = "jdbc:mysql://localhost:3306/Programacion";
        String driverClass = "com.mysql.jbdc.Driver";

        try {
            Class.forName(driverClass);
        } catch (ClassNotFoundException e) {
            System.err.println("No se encuentra el driver JDBC. Revisa su configuración");
            throw new RuntimeException(e);
        }

        Connection conn = DriverManager.getConnection(url, usuario, password);
        return conn;
    } 

}
