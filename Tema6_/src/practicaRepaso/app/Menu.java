package practicaRepaso.app;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import practicaRepaso.modelo.Equipo;
import practicaRepaso.modelo.Jugador;

public class Menu {
	
	public static void subMenu3() {
		System.out.println("-----------------------------------------------");
		System.out.println("Elige una de estas opciones para el equipo: ");
		System.out.println("           (1) Ver plantilla del equipo");
		System.out.println("           (2) Borrar equipo");
		System.out.println("           (3) Añadir un jugador");
		System.out.println("           (4) Calcular edad media de plantilla");
		System.out.println("           (0) Volver al menú principal");
		System.out.println("-----------------------------------------------");
	}
	public static void menuPrincipal() {
		System.out.println("-----------------------------------------------");
		System.out.println("Elige una de estas opciones: ");
		System.out.println("           (1) Ver todos los equipos registrados");
		System.out.println("           (2) Crear un nuevo equipo");
		System.out.println("           (3) Consultar un equipo por su código");
		System.out.println("           (0) Salir");
		System.out.println("-----------------------------------------------");
	}

	public static Jugador obtenerDatosJugador() {
		Jugador j = new Jugador();
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el dorsal del jugador");
		j.setNumero(sc.nextInt());
		sc.nextLine();
		System.out.println("Introduce el codigo del equipo en el que juega");
		j.setCodigoEquipo(sc.nextLine());
		System.out.println("Introduce el nombre del Jugador");
		j.setNombre(sc.nextLine());
		System.out.println("Introduce la fecha de nacimiento del juador (dd/MM/yyyy)");
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String fechaNacimiento = sc.nextLine();
		LocalDate fechaNacimiento2 = LocalDate.parse(fechaNacimiento, format);
		j.setFechaNacimiento(fechaNacimiento2);
		return j;
	}

	public static Equipo obtenerDatosEquipo() {
		Equipo e1 = new Equipo();
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el código del equipo");
		e1.setCodigo(sc.nextLine());
		System.out.println("Introduce el nombre del equipo");
		e1.setNombre(sc.nextLine());
		return e1;
	}

}
