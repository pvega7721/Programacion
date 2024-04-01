package ejercicio55;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		paso1
		Evaluacion eva1 = new Evaluacion();

//		paso2
		eva1.addNota("00000000T", new BigDecimal(8.9));
		eva1.addNota("40061025Q", new BigDecimal(4.1));
		eva1.addNota("51140024F", new BigDecimal(6.1));
		eva1.addNota("91282910G", new BigDecimal(3.9));
		eva1.addNota("22392293E", new BigDecimal(7.4));
		System.out.println(eva1);

//		paso3
		eva1.addNota("12345678a", new BigDecimal(8.8));
		System.out.println(eva1);

//		paso4
		eva1.corregirNota("22392293E", new BigDecimal(4.5));
		eva1.corregirNota("50891336H", new BigDecimal(8.5));
		System.out.println(eva1);

//		paso5
		DecimalFormat formato = new DecimalFormat("#0.0");
		System.out.println(formato.format(eva1.obtenerNotaAlumno("22392293E")));
		
		System.out.println("Nota media: " + formato.format(eva1.obtenerNotaMedia()));
//		paso6
		System.out.println("Aprobados: " + eva1.obtenerCantidadAprobados());
//		paso7
		System.out.println("Suspensos: " + eva1.obtenerSuspensos());
//		paso8
		eva1.borrarAprobados();
		System.out.println(eva1);
	}

}
