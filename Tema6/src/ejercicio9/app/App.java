package src.ejercicio9.app;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ejercicio9.modelo.Persona;
import ejercicio9.services.PersonasService;

public class App {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		PersonasService service = new PersonasService();

		Scanner sc = new Scanner(System.in);
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		Integer opcion;
		do {
			System.out.println("¿Qué quieres hacer?");
			System.out.println("Escribe 1 para consultar una persona");
			System.out.println("Escribe 2 para buscar a personas");
			System.out.println("Escribe 3 para añadir una nueva persona");
			System.out.println("Escribe 4 para actualizar persona");
			System.out.println("Escribe 5 para borrar una persona");
			System.out.println("Escribe 6 para añadir una lista");
			System.out.println("Escribe 9 para ver todas las personas");
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
			case 6:{
				sc.nextLine();
				List<Persona> personas = new ArrayList<>();
				
				System.out.println("¿Cuántas personas quieres añadir a la lista?");
				Integer nPersonas = sc.nextInt();
				
				for (int i = 0; i < nPersonas; i++) {
					Persona p1 = new Persona();
					sc.nextLine();
					System.out.println("Introduce el nombre de la persona");
					p1.setNombre(sc.nextLine());
					
					System.out.println("Introduce el apellido de la persona");
					p1.setApellidos(sc.nextLine());
					
					System.out.println("Introduce el DNI");
					p1.setDNI(sc.nextLine());
					
					System.out.println("Introduce su fecha de naciemiento (dd/MM/yyyy");
					p1.setFechaNacimiento(LocalDate.parse(sc.nextLine(), format));
					
					personas.add(p1);
				}
				
				service.insertarLista(personas);
				break;
			}
			case 9:{
				System.out.println(service.verTabla());
				break;
			}
			case 0:{
				System.out.println("Has salido del menú");
				break;
			}
			default:
				System.out.println("Opción incorrecta, intentalo de nuevo");
			}

		} while (opcion != 0);
		sc.close();
	}

}