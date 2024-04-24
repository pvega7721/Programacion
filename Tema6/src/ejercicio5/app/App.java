package ejercicio5.app;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.List;
import java.util.Scanner;

import ejercicio5.modelo.Persona;
import ejercicio5.services.PersonasService;

public class App {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		PersonasService service = new PersonasService();

		Scanner sc = new Scanner(System.in);

		Integer opcion;

		do {
			System.out.println("¿Qué quieres hacer?");
			System.out.println("Escribe 1 para consultar una persona");
			System.out.println("Escribe 2 para buscar a personas");
			System.out.println("Escribe 3 para añadir una nueva persona");
			System.out.println("Escribe 4 para actualizar persona");
			System.out.println("Escribe 5 para borrar una persona");
			System.out.println("Escribe 0 para salir");

			opcion = sc.nextInt();

			switch (opcion) {
			case 1: {
				sc.nextLine();
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
				break;
			}
			case 2: {
				sc.nextLine();
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
				}
				break;
			}
			case 3: {
				sc.nextLine();
				Persona persona = new Persona();

				System.out.println("¿Cuál es el nombre de la persona?");
				persona.setNombre(sc.nextLine());

				System.out.println("¿Cuáles son sus apellidos?");
				persona.setApellidos(sc.nextLine());

				System.out.println("¿Cuál es el dni de la persona?");
				persona.setDNI(sc.nextLine());

				System.out.println("¿Cuál es su fecha de nacimiento?");
				String fecha = sc.nextLine();
				DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");

				try {
					LocalDate fechaNacimiento = LocalDate.parse(fecha, format);
					persona.setFechaNacimiento(fechaNacimiento);
				} catch (DateTimeParseException e) {
					System.out.println("La fecha indicada no es correta. Empieza de nuevo");
				}

				service.insertarPersona(persona);
				break;
			}
			case 4:{
				sc.nextLine();
				Persona persona = new Persona();
				
				System.out.println("¿Cuál es el nombre de la persona?");
				persona.setNombre(sc.nextLine());

				System.out.println("¿Cuáles son sus apellidos?");
				persona.setApellidos(sc.nextLine());

				System.out.println("¿Cuál es el dni de la persona?");
				persona.setDNI(sc.nextLine());

				System.out.println("¿Cuál es su fecha de nacimiento?");
				String fecha = sc.nextLine();
				DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");

				try {
					LocalDate fechaNacimiento = LocalDate.parse(fecha, format);
					persona.setFechaNacimiento(fechaNacimiento);
				} catch (DateTimeParseException e) {
					System.out.println("La fecha indicada no es correta. Empieza de nuevo");
				}

				service.actualizarPersona(persona);
				break;
			}
			case 5:{
				sc.nextLine();
				
				System.out.println("Introduce el DNI de la persona que quieres borrar");
				String dni = sc.nextLine();

				service.borrarPersona(dni);
				break;
			}
			case 0:{
				System.out.println("Has salido del menú");
				break;
			}
			default:
				System.out.println("Opción incorrecta, intentalo de nuevo");
			}

		} while (opcion != 4);
		sc.close();
	}

}