package ejercicio9y10.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OpenConnection {

	public Connection getNetworkConnection() throws SQLException {
		// 1. Datos y url de conexión que necesitaremos para conectarnos a la BBDD
		String usuario = "programacion";
		String password = "pvega7721";

		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String driverClass = "oracle.jdbc.driver.OracleDriver";

		try {
			//2. Cargamos la clase del driver
			Class.forName(driverClass);
				//Controlamos que haya un error en caso que no se encuentre el driver
		} catch (ClassNotFoundException e) {
			System.err.println("No se encuentra el driver JDBC. Revisa su configuración");
			throw new RuntimeException(e);
		}
		//3. Obtenemos nueva conexión
		Connection conn = DriverManager.getConnection(url, usuario, password);
		return conn;
	}

}
