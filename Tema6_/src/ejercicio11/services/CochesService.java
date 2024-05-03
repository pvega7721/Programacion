package ejercicio11.services;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import ejercicio11.modelo.Coche;

public class CochesService {
	private OpenConnection openConn;

	public CochesService() {
		openConn = new OpenConnection();
	}

}
