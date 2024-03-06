package repasoExamen;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String compañia;
// 		1.
		do {
			System.out.println("Introduce la compañía del avión:");
			compañia = sc.nextLine();
		} while (compañia.isEmpty() || compañia.startsWith(" "));
//		2.
		// a.
		Avion avion1 = new Avion(compañia);
		// b.
		avion1.setFechaFabricacion(LocalDate.of(2015, Month.NOVEMBER, 23));
		// c.
		Asiento asiento1 = new Asiento(15, "A");
		asiento1.setEstaOcupado(true);
		// d.
		Asiento asiento2 = new Asiento(15, "B");
		// e.
		AsientoPrimera primera1 = new AsientoPrimera(1, "A");

		avion1.añadirAsiento(asiento1);
		avion1.añadirAsiento(asiento2);
		avion1.añadirAsiento(primera1);

//		3.
		BigDecimal precioAsientos = BigDecimal.ZERO;
		// Preguntamos el precio del asiento hasta que sea mayor a 100
		do {
			System.out.println("¿Cuál es el precio base de los asientos?");
			precioAsientos = sc.nextBigDecimal();
			Asiento.precioBase = precioAsientos;
		} while (Asiento.precioBase.compareTo(new BigDecimal(100)) == -1);
//		4.
		// a.
		avion1.establecerPrecioBaseAsiento(precioAsientos);
		// b.
		System.out.println(avion1);
		// c.
		System.out.println(avion1.getAntiguedad());
		
		// d.
		System.out.println(avion1.getCantidadAsientosOcupados());
		// e.
		System.out.println(avion1.getAsientosLibres());
		// f.
		System.out.println(avion1.precioMedioVenta());
		// g.
		System.out.println(avion1.getAsientoLibreMasBarato());
		// h.
		avion1.eliminarAsientosFila(15);

		sc.close();
	}

}
