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
		EquiposService equiposService = new EquiposService();
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		Integer opcion = 0;
		do {
			System.out.println("-----------------------------------------------");
			System.out.println("Elige una de estas opciones: ");
			System.out.println("           (1) Ver todos los equipos registrados");
			System.out.println("           (2) Crear un nuevo equipo");
			System.out.println("           (3) Consultar un equipo por su código");
			System.out.println("           (0) Salir");
			System.out.println("-----------------------------------------------");
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
				}while(!opcion1.equalsIgnoreCase("n"));
				System.out.println("Equipo guardado!!");
			case 3:
				sc.nextLine();
				System.out.println("Introduce el código del equipo: ");
				String codigo = sc.nextLine();
				System.out.println(service.consultarEquipoCompleto(codigo));
				break;
			default:
				System.out.println("Opción no válida");
			}
		} while (opcion != 0);
		sc.close();
	}

	

	
}
