package ejercicio1.app;

import java.sql.SQLException;
import java.util.Scanner;

import ejercicio1.modelo.Persona;
import ejercicio1.services.PersonasService;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PersonasService service = new PersonasService();

		Scanner sc = new Scanner(System.in);

		System.out.println("Indica el DNI de la persona");
		String dni = sc.nextLine();
		try {
			Persona p = service.consultarPersona(dni);

			if (p == null) {
				System.out.println("No exste persona con los datos solicitados");
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