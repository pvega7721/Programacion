package ej2Repaso.app;

import java.sql.SQLException;
import java.util.Scanner;
import ej2Repaso.modelo.Persona;
import ej2Repaso.services.PersonasService;

public class App {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		// Creamos una instancia de la clase PersonaService para llamar a sus métodos.
		PersonasService service = new PersonasService();
		Scanner sc = new Scanner(System.in);
		
		service.buscarPersonas();

		// Consultar Persona
		try {
			// Creo instancia de persona llamando al método
			Persona p = service.consultarPersona();
			// Si el método devuelve null(No hay persona) imprime un mensaje de error
			if (p == null) {
				System.out.println("No exste persona con los datos solicitados");
				// En caso de que si haya persona, la imprime
			} else {
				System.out.println(p);
			}
		} catch (SQLException e) {
			System.out.println("Excepción en mail: " + e.getMessage());
		} finally {
			sc.close();
		}

	}

}