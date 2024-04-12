package ejercicio2.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OpenConnection {

	public Connection getNetworkConnection() throws SQLException {
        String usuario = "programacion";
        String password = "pvega7721";

        String url = "jdbc:oracle:thin:@localhost:1521:XE";
        String driverClass = "oracle.jdbc.driver.OracleDriver";

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
