package examen.app;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import examen.modelo.Libreria;
import examen.modelo.Libro;
import examen.services.LibreriaService;
import examen.services.LibroException;

public class App {
	public static void main(String[] args) throws SQLException, LibroException {
		// TODO Auto-generated method stub
		LibreriaService service = new LibreriaService();
		/*Libro l1 = new Libro();

		l1.setAutor("Autor2");
		l1.setIsbn("2345");
		l1.setPrecio(new BigDecimal(14));
		l1.setTitulo("titulo2");
		// service.insertarLibroNuevo(l1);

		service.actualizarPrecioLibroNuevo(l1, new BigDecimal(20));
*/
		Libreria libreria = new Libreria();
		Libreria.setMap(libros);
		System.out.println(libreria.getTasacionCompleta());
		System.out.println(libreria.getPrecioMedio());
	}

	public Libreria solicitarLibreria() {
		Scanner sc = new Scanner(System.in);
		Libreria l1 = new Libreria();
		l1.setNombre("Páginas desiertas");
		String opcion = "";
		Map<String, Libro> mapaLibros = new HashMap<>();
		do {

		} while (opcion.equalsIgnoreCase("FIN"));

		return l1;
	}

}
