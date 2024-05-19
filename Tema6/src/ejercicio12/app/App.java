package ejercicio12.app;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import ejercicio12.modelo.Pedido;
import ejercicio12.services.PedidosService;

public class App {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		// Hay que crear una instancia de la clase CochesServices para poder llamar a
		// sus métodos.
		PedidosService service = new PedidosService();
		Scanner sc = new Scanner(System.in);
		Integer opcion = 0;

		do {
			System.out.println("¿Qué quieres hacer?");
			System.out.println("0. Salir");
			System.out.println("1. Ver un pedido");
			System.out.println("2. Crear un pedido nuevo");

			opcion = sc.nextInt();
			sc.nextLine();

			switch (opcion) {
			case 0:
				break;
			case 1:
				System.out.println("Introduce el número del pedido deseado");
				Integer nPedido = sc.nextInt();
				System.out.println(service.consultarLineasPedido(nPedido));
				break;
			case 2:
				break;
			default:
				System.out.println("Opción no válida");
			}

		} while (opcion != 0);

		sc.close();
	}

	public static Pedido solicitarDatos() {
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		Pedido pedido1 = new Pedido();

		System.out.println("Introduce el número de pedido:");
		pedido1.setNumero(sc.nextInt());

		System.out.println("Introduce el nombre del cliente:");
		pedido1.setCliente(sc.nextLine());

		try {
			System.out.println("Introduce la fecha y hora de compra (dd-MM-yyyy):");
			String fechaCompra = sc.nextLine();
			pedido1.setFecha_entrega(LocalDate.parse(fechaCompra, format));
		} catch (Exception e) {
			System.out.println("Formato incorrecto");
		}
		return pedido1;

	}
}
