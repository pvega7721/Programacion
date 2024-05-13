package practicaRepaso.app;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import practicaRepaso.modelo.Equipo;
import practicaRepaso.modelo.Jugador;
import practicaRepaso.services.EquipoServiceException;
import practicaRepaso.services.EquiposService;
import practicaRepaso.services.NotFoundException;

public class App {
	public static void main(String[] args) throws SQLException, EquipoServiceException, NotFoundException {
		// TODO Auto-generated method stub
		EquiposService service = new EquiposService();
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		Integer opcion = 0;
		System.out.println("Pruebas");
		//System.out.println(service.consultarEquipoCompleto("sv"));
		/*
		do {
			Menu.menuPrincipal();
			opcion = sc.nextInt();
			switch (opcion) {
			case 0:
				System.out.println("Bye!!");
				break;
			case 1:
				sc.nextLine();
				System.out.println(service.consultarEquipos());
				break;
			case 2:
				sc.nextLine();
				Equipo e2 = Menu.obtenerDatosEquipo();
				service.crearEquipo(e2);
				Jugador j2 = new Jugador();
				String opcion1 = "";
				do {
					System.out.println("Introduce el nombre del jugador");
					j2.setNombre(sc.nextLine());
					System.out.println("Introduce la fecha de nacimiento del juador (dd/MM/yyyy)");
					String fechaNacimiento = sc.nextLine();
					LocalDate fechaNacimiento2 = LocalDate.parse(fechaNacimiento, format);
					j2.setFechaNacimiento(fechaNacimiento2);
					System.out.println("¿Deseas añadir otro jugador? (S/N)");
					opcion1 = sc.nextLine();
					e2.getListaJugadores().add(j2);
				} while (!opcion1.equalsIgnoreCase("n"));
				System.out.println("Equipo guardado!!");
				break;
			case 3:
				sc.nextLine();
				System.out.println("Introduce el código del equipo: ");
				String codigo = sc.nextLine();
				System.out.println(service.consultarEquipoCompleto(codigo));
				System.out.println(">> PLANTILLA:");
				// REcorre la lista de jugadores del equipo devuelto por el método y muestra su
				// nombre y fecha de nacimiento
				// Falta por terminar.
				for (int i = 0; i < service.consultarEquipoCompleto(codigo).getListaJugadores().size() - 1; i++) {
					System.out.println(i + " - "
							+ service.consultarEquipoCompleto(codigo).getListaJugadores().get(i).getNombre() + " - "
							+ service.consultarEquipoCompleto(codigo).getListaJugadores().get(i).getFechaNacimiento());
				}
				Integer opcionMenu3 = 0;
				do {
					Menu.subMenu3();
					opcionMenu3 = sc.nextInt();
					switch (opcionMenu3) {
					case 0:
						break;
					case 1:
						System.out.println(service.consultarEquipoCompleto(codigo));
						System.out.println(">> PLANTILLA:");
						// REcorre la lista de jugadores del equipo devuelto por el método y muestra su
						// nombre y fecha de nacimiento
						// Falta por terminar.
						for (int i = 0; i < service.consultarEquipoCompleto(codigo).getListaJugadores().size()
								- 1; i++) {
							System.out.println(i + " - "
									+ service.consultarEquipoCompleto(codigo).getListaJugadores().get(i).getNombre()
									+ " - " + service.consultarEquipoCompleto(codigo).getListaJugadores().get(i)
											.getFechaNacimiento());
						}
						break;
					case 2:
						service.borrarEquipoCompleto(codigo);
						opcionMenu3 = 0;
						break;
					// Falta mirar
					case 3:
						Jugador j3 = new Jugador();
						System.out.println("Indica el nombre del jugador");
						j3.setNombre(sc.nextLine());
						sc.nextLine();
						System.out.println("Introduce la fecha de nacimiento del juador (dd/MM/yyyy)");
						String fechaNacimiento = sc.nextLine();
						LocalDate fechaNacimiento3 = LocalDate.parse(fechaNacimiento, format);
						j3.setFechaNacimiento(fechaNacimiento3);
						service.añadirJugadorAEquipo(service.consultarEquipoCompleto(codigo), j3);
						break;
					case 4:
						service.calcularEdadMediaPlantilla(service.consultarEquipoCompleto(codigo));
						break;

					default:
						System.out.println("Opción no válida");
						break;
					}
				} while (opcionMenu3 != 0);

				break;
			default:
				System.out.println("Opción no válida");
			}
		} while (opcion != 0);
		*/
		sc.close();
	}

}
