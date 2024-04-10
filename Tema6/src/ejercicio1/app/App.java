package ejercicio1.app;

import java.sql.SQLException;

import ejercicio1.services.OpenConnection;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OpenConnection con = new OpenConnection();
		
		try {
			System.out.println(con.getNetworkConnection());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}