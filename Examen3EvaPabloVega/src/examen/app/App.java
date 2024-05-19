package examen.app;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

import examen.modelo.Productora;
import examen.services.PeliculaErrorException;
import examen.services.PeliculasService;

public class App {
	public static void main(String[] args) throws SQLException, PeliculaErrorException {
		Scanner sc = new Scanner(System.in);
		Boolean validar = false;
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		PeliculasService service = new PeliculasService();
		String fechaInicial = "";
		String fechaFinal = "";
		try {
			do {
				System.out.println("Indica la fecha INICIAL desde la que quieres buscar (dd/MM/yyyy)");
				fechaInicial = sc.nextLine();

				System.out.println("Indica la fecha FINAL hasta la que quieres buscar (dd/MM/yyyy)");
				fechaFinal = sc.nextLine();
			

			} while (validar);

			LocalDate fechaInicial1 = LocalDate.parse(fechaInicial, format);
			LocalDate fechaFinal1 = LocalDate.parse(fechaFinal, format);

			
			Productora p1 = new Productora();
			p1.setNombre("Univerblas Picture");
			p1.setListaPeliculas(service.consultarPeliculas(fechaInicial1, fechaFinal1));
			System.out.println(p1);
			
			
		} catch (DateTimeParseException e) {
			System.out.println("Formato de fecha incorrecto");
			
			validar = false;
		} catch(Exception e) {
			System.err.println("Error");
		}
		finally {
			sc.close();
		}

	}

}
