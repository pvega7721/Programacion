package practicaRepaso.app;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import practicaRepaso.modelo.Equipo;
import practicaRepaso.modelo.Jugador;

public class App {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Jugador jugador1 = new Jugador();
		LocalDate FechaNacimiento1 = LocalDate.of(2002, Month.APRIL, 2);
		jugador1.setFechaNacimiento(FechaNacimiento1);
		Jugador jugador2 = new Jugador();
		LocalDate FechaNacimiento2 = LocalDate.of(2005, Month.APRIL, 2);
		jugador2.setFechaNacimiento(FechaNacimiento2);
		Equipo equipo1 = new Equipo();
		List<Jugador> jugadores = new ArrayList<>();
		jugadores.add(jugador1);
		jugadores.add(jugador2);
		equipo1.setListaJugadores(jugadores);
		System.out.println(equipo1.getEdadMedia(jugadores));

	}

}
