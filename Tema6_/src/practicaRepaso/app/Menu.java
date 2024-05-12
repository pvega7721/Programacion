package practicaRepaso.app;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import practicaRepaso.modelo.Equipo;
import practicaRepaso.modelo.Jugador;

public class Menu {
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
