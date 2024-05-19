package ej7Repaso.app;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ej7Repaso.modelo.Persona;
import ej7Repaso.services.DatosIncompletosException;
import ej7Repaso.services.PersonasService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class App {

	public static void main(String[] args) throws SQLException {
		// Formato para todas las fechas
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		// Creamos una instancia de la clase PersonaService para llamar a sus métodos.
		PersonasService service = new PersonasService();
		Scanner sc = new Scanner(System.in);
		Integer opcion = 0;
		do {
			System.out.println("Qué quieres hacer?");
			System.out.println("0. Salir");
			System.out.println("1. Consultar una persona");
			System.out.println("2. Buscar personas");
			System.out.println("3. Insertar una persona");
			System.out.println("4. Actuilzar una persona");
			System.out.println("5. Borrar una persona");
			System.out.println("6. Insertar una lista de personas");
			opcion = sc.nextInt();

			switch (opcion) {
			case 0:
				break;
			case 1:
				sc.nextLine();
				// Consultar Persona Ejercicio 1
				try {
					System.out.println("Ejercicio1");
					System.out.println("Introduce el dni de la persona que buscas");
					String dni = sc.nextLine();
					// Creo instancia de persona llamando al método
					Persona p = service.consultarPersona(dni);
					// Si el método devuelve null(No hay persona) imprime un mensaje de error
					if (p == null) {
						System.out.println("No exste persona con los datos solicitados");
						// En caso de que si haya persona, la imprime
					} else {
						System.out.println(p);
					}
				} catch (SQLException e) {
					System.out.println("Excepción en mail: " + e.getMessage());
				}
				break;
			case 2:
				sc.nextLine();
				// Buscar personas Ejercicio2
				System.out.println("Ejercicio2");
				System.out.println("Introduce el nombre o apellido buscados");
				String filtro = sc.nextLine();
				System.out.println(service.buscarPersonas(filtro));
				break;
			case 3:
				sc.nextLine();
				// Introducir persona Ejercicio3
				Persona p = new Persona();
				//
				Boolean error = false;
				do {
					System.out.println("Ejercicio 3");

					System.out.println("Introduce el dni de la persona");
					p.setDNI(sc.nextLine());

					System.out.println("Introduce el nombre de la persona");
					p.setNombre(sc.nextLine());

					System.out.println("Introduce el apellido de la persona");
					p.setApellidos(sc.nextLine());

					System.out.println("Introduce la fecha de nacimiento de la persona (dd/MM/yyyy)");
					String fechaNacimiento1 = sc.nextLine();

					LocalDate fechaNacimiento3 = LocalDate.parse(fechaNacimiento1, format);
					p.setFechaNacimiento(fechaNacimiento3);

					if (!error) {
						try {
							p.validar();
						} catch (DatosIncompletosException e) {
							System.out.println("Los datos no están completos");
							error = true;
						}
					}
				} while (error);

				service.insertarPersona(p);
				break;

			case 4:
				sc.nextLine();
				Persona pnueva = new Persona();
				System.out.println("Ejercicio 4");

				System.out.println("Introduce el dni de la persona que quieres cambiar");
				pnueva.setDNI(sc.nextLine());

				System.out.println("Introduce el nuevo nombre de la persona");
				pnueva.setNombre(sc.nextLine());

				System.out.println("Introduce el nuevo apellido de la persona");
				pnueva.setApellidos(sc.nextLine());

				System.out.println("Introduce la nueva fecha de nacimiento de la persona (dd/MM/yyyy)");
				String fechaNacimiento2 = sc.nextLine();
				LocalDate fechaNacimiento4 = LocalDate.parse(fechaNacimiento2, format);
				pnueva.setFechaNacimiento(fechaNacimiento4);

				service.actualizarPersona(pnueva);
				break;

			case 5:
				sc.nextLine();
				System.out.println("Introduce el dni de la persona que quieras eliminar");
				String dni = sc.nextLine();
				service.borrarPersona(dni);
				break;
			case 6:
				sc.nextLine();
				// Creamos lista de personas
				List<Persona> listaPersonas = new ArrayList<>();
				System.out.println("Cuántas personas quieres añadir?");
				Integer contador = sc.nextInt();
				do {
					sc.nextLine();
					/*
					 * Creamos persona para luego añadirla a la lista La tenemos que crear dentro
					 * del bucle, para que al iterar cree otra persona en lugar de sobreescribirla.
					 */
					Persona p1 = new Persona();
					// Solicitamos datos para la persona
					System.out.println("Introduce el dni de la persona");
					p1.setDNI(sc.nextLine());

					System.out.println("Introduce el nombre de la persona");
					p1.setNombre(sc.nextLine());

					System.out.println("Introduce el apellido de la persona");
					p1.setApellidos(sc.nextLine());

					System.out.println("Introduce la fecha de nacimiento de la persona (dd/MM/yyyy)");
					String fechaNacimiento3 = sc.nextLine();
					LocalDate fechaNacimiento6 = LocalDate.parse(fechaNacimiento3, format);
					p1.setFechaNacimiento(fechaNacimiento6);
					// La añadimos a la lista
					listaPersonas.add(p1);
					contador--;
				} while (contador != 0);
				service.insertarPersonas(listaPersonas);

				break;
			default:
				System.out.println("Opción no válida");
			}

		} while (opcion != 0);

		sc.close();
	}

}