package ejRepaso4;

import java.time.LocalDate;
import java.time.Month;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Crear libreria con dirección y telefono
		Libreria libreria1 = new Libreria();
		libreria1.setDireccion("Avda. de los sueños perdidos, 89");
		libreria1.setNumTelefono(954954954);
		
		//Crear dos libros fisicos
		LibroFisico libro1 = new LibroFisico();
		libro1.setAlto(15);
		libro1.setAncho(8);
		libro1.setAutor("Ismael Sánchez");
		libro1.setFechaEdicion(LocalDate.of(2015, Month.AUGUST, 13));
		libro1.setNumPaginas(400);
		libro1.setPeso(450);
		libro1.setTitulo("Título del libro 1");
		
		LibroFisico libro2 = new LibroFisico();
		libro2.setAlto(14);
		libro2.setAncho(6);
		libro2.setAutor("Hugo lópez");
		libro2.setFechaEdicion(LocalDate.of(2020, Month.MARCH, 25));
		libro2.setNumPaginas(345);
		libro2.setPeso(200);
		libro2.setTitulo("Título del libro 2");
		
		//Crear dos libros digitales
		LibroDigital libro3 = new LibroDigital();
		libro3.setAutor("Alberto Perez");
		libro3.setFechaEdicion(LocalDate.of(2023, Month.JANUARY, 16));
		libro3.setNumPaginas(654);
		libro3.setTitulo("Titulo del libro 3");
		
		LibroDigital libro4 = new LibroDigital();
		libro4.setAutor("Fernando Jiménez");
		libro4.setFechaEdicion(LocalDate.of(2018, Month.JULY, 30));
		libro4.setNumPaginas(228);
		libro4.setTitulo("Titulo del libro 4");
		
		//Los añado a la lista
		libreria1.añadirLibroFisico(libro1);
		libreria1.añadirLibroFisico(libro2);
		libreria1.añadirLibroDigital(libro3);
		libreria1.añadirLibroDigital(libro4);
		
		//llamo a los métodos
		System.out.println(libreria1.obtenerLibroMasAntiguo());
		System.out.println(libreria1.obtenerNumPaginasMedio());
		System.out.println(libreria1.obtenerPesoTotal());
	}

}
