package ejercicio3.app;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import ejercicio3.modelo.Persona;
import ejercicio3.services.PersonasService;

public class App {

	public static void main(String[] args) throws SQLException {
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
		}

		System.out.println("Indica el nombre o apellido que buscas");
		String nombreOApellido = "";
		do {
			nombreOApellido = sc.nextLine();
		} while (nombreOApellido.isEmpty());

		try {
			List<Persona> p = service.buscarPersonas(nombreOApellido);
			if (p == null) {
				System.out.println("No exste persona con los datos solicitados");
			} else {
				for (Persona per : p) {
					System.out.println(per);
				}
			}
		} catch (SQLException e) {
			System.out.println("Excepción en mail: " + e.getMessage());
		} finally {
			sc.close();
		}

		Persona Julio = new Persona();
		Julio.setDNI("12345678N");
		Julio.setNombre("Julio");
		Julio.setApellidos("Lopez");
		Julio.setFechaNacimiento(LocalDate.of(2001, 10, 4));
		service.insertarPersona(Julio);
		
	}

}