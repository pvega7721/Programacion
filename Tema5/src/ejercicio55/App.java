package ejercicio55;

import java.math.BigDecimal;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		paso1
		Evaluacion eva1 = new Evaluacion();
//		paso2
		BigDecimal nota1 = new BigDecimal(4.5);
		eva1.addNota("12345678a", nota1);
		
		BigDecimal nota2 = new BigDecimal(7.2);
		eva1.addNota("12345678b", nota2);
		
		BigDecimal nota3 = new BigDecimal(8.1);
		eva1.addNota("12345678c", nota3);
		
		BigDecimal nota4 = new BigDecimal(5.0);
		eva1.addNota("12345678d", nota4);
		
		BigDecimal nota5 = new BigDecimal(6.9);
		eva1.addNota("12345678e", nota5);
//		paso3
		eva1.addNota("12345678a", nota5);
		System.out.println(eva1);
//		paso4
		eva1.corregirNota("12345678b", nota4);
		eva1.corregirNota("12345677C", nota2);
		System.out.println(eva1);
//		paso5
		eva1.obtenerNotaAlumno("12345678c");
		System.out.println(eva1.obtenerNotaMedia());
//		paso6
		System.out.println(eva1.obtenerCantidadAprobados());
//		paso7
		System.out.println(eva1.obtenerSuspensos());
//		paso8
		eva1.borrarAprobados();
		System.out.println(eva1);
	}

}
