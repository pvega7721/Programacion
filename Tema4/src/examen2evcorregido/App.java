package examen2evcorregido;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// 1.
		String especialista = "";
		do {
			System.out.println("¿Cuál es el nombre del especialista?");
			especialista = sc.nextLine();
		} while (especialista.length() < 10);
		especialista = especialista.trim().toUpperCase();

		// 2.
		// a.
		Agenda agenda1 = new Agenda(especialista);
		// borrar
		System.out.println(agenda1.getMedico());
		// b.
		String fechaCadena = "10/05/2024";
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate fecha = LocalDate.parse(fechaCadena, formato);

		CitaNormal cita1 = new CitaNormal(fecha, 16, "Blas de los Montes", false);
		// borrar
		System.out.println(cita1);
		// c.
		String fechaCadena2 = "18/10/2024";
		LocalDate fecha2 = LocalDate.parse(fechaCadena2, formato);
		CitaRevision cita2 = new CitaRevision(fecha2, 17, "Laura Aguilar", true, 3);
		// borrar
		System.out.println(cita2);
		// d.
		agenda1.addCita(cita1);
		agenda1.addCita(cita2);
		// borrar
		System.out.println(agenda1.getListaCitas());
		// 3.
		System.out.println(agenda1.getImportePendienteFacturar());
		// 4.
		sc.close();
	}

}
