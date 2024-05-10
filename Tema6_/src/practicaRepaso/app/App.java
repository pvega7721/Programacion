package practicaRepaso.app;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import practicaRepaso.modelo.Equipo;
import practicaRepaso.modelo.Jugador;
import practicaRepaso.services.EquipoServiceException;
import practicaRepaso.services.EquiposService;

public class App {
	public static void main(String[] args) throws SQLException, EquipoServiceException {
		// TODO Auto-generated method stub
		EquiposService service = new EquiposService();
		Scanner sc = new Scanner(System.in);
		/*
		 * Jugador jugador1 = new Jugador(); LocalDate FechaNacimiento1 =
		 * LocalDate.of(2002, Month.APRIL, 2);
		 * jugador1.setFechaNacimiento(FechaNacimiento1); Jugador jugador2 = new
		 * Jugador(); LocalDate FechaNacimiento2 = LocalDate.of(2005, Month.APRIL, 2);
		 * jugador2.setFechaNacimiento(FechaNacimiento2); Equipo equipo1 = new Equipo();
		 * List<Jugador> jugadores = new ArrayList<>(); jugadores.add(jugador1);
		 * jugadores.add(jugador2); equipo1.setListaJugadores(jugadores);
		 * System.out.println(equipo1.getEdadMedia(jugadores));
		 */
		System.out.println(service.consultarJugadoresEquipo("bcn"));

		Integer opcion = 0;
		do {
			System.out.println("-----------------------------------------------");
			System.out.println("Elige una de estas opciones: ");
			System.out.println("           (1) Ver todos los equipos registrados");
			System.out.println("           (2) Crear un nuevo equipo");
			System.out.println("           (3) Consultar un equipo por su código");
			System.out.println("           (0) Salir");
			opcion = sc.nextInt();
			switch (opcion) {
			case 0:
				break;
			case 1:
				System.out.println(service.consultarEquipos());
				break;
			case 3:
				break;
			default:
				System.out.println("Opción no válida");
			}
		} while (opcion != 0);
	}

}
