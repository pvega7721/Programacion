package ejercicio11.app;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import ejercicio11.modelo.Coche;
import ejercicio11.services.CochesService;

public class App {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		// Hay que crear una instancia de la clase CochesServices para poder llamar a
		// sus métodos.
		CochesService service = new CochesService();
		Scanner sc = new Scanner(System.in);
		Integer opcion = 0;

		do {
			System.out.println("¿Qué quieres hacer?");
			System.out.println("0. Salir");
			System.out.println("1. Insertar un coche");
			System.out.println("2. Actualizar un coche");
			System.out.println("3. Consultar un coche");

			opcion = sc.nextInt();
			sc.nextLine();

			switch (opcion) {
			case 0:
				break;
			case 1:
				Coche coche1 = solicitarDatos();
				service.insertarCoche(coche1);
				break;
			case 2:
				System.out.println("Introduce los nuevos datos del coche a modificar");
				Coche coche2 = solicitarDatos();
				service.actualizarCoche(coche2);
				break;
			case 3:
				System.out.println("Introduce la matrícula del coche buscado");
				System.out.println(service.consultarCoche(sc.nextLine()));
				break;
			default:
				System.out.println("Opción no válida");
			}

		} while (opcion != 0);

		sc.close();
	}

	public static Coche solicitarDatos() {
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
		Coche coche1 = new Coche();

		System.out.println("Introduce la matrícula:");
		coche1.setMatricula(sc.nextLine());

		System.out.println("Introduce la marca:");
		coche1.setMarca(sc.nextLine());

		System.out.println("Introduce el precio:");
		coche1.setPrecio(sc.nextBigDecimal());

		sc.nextLine();
		try {
			System.out.println("Introduce la fecha y hora de compra (dd-MM-yyyy HH:mm):");
			String fechaCompra = sc.nextLine();
			coche1.setFechaHoraCompra(LocalDateTime.parse(fechaCompra, format));
		} catch (Exception e) {
			System.out.println("Formato incorrecto");
		}
		return coche1;

	}

}
