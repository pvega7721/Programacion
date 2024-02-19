package ejercicio53;

import java.math.BigDecimal;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Paso 1
		Hucha hucha1 = new Hucha();
		System.out.println(hucha1.getAhorro());
		
		/*Paso 2
		el método meterDinero debe recibir como parámetro de entrada un BigDecimal, por eso creo una variable que convierte la cantidad que quiero a BigDecimal
		*/
		BigDecimal ingreso1 = BigDecimal.valueOf(100);
		hucha1.meterDinero(ingreso1);
		System.out.println(hucha1.getAhorro());
		
		//Paso 3
		BigDecimal ingreso2 = BigDecimal.valueOf(50.501);
		hucha1.meterDinero(ingreso2);
		System.out.println(hucha1.getAhorro());
		
		//Paso 4
		BigDecimal gasto1 = BigDecimal.valueOf(20.5);
		hucha1.sacarDinero(gasto1);
		System.out.println(hucha1.getAhorro());
		
		//Paso 5 --
		BigDecimal gasto2 = BigDecimal.valueOf(200);
		//Guardo lo que hay en la hucha antes de borrarlo
		BigDecimal ahorroActual = hucha1.getAhorro();
		hucha1.sacarDinero(ahorroActual);
		System.out.println(hucha1.getAhorro());
		
		//Paso 6 --
		//Imprimo lo que tenía en la hucha antes de borrarlo
		hucha1.meterDinero(ahorroActual);
		System.out.println(hucha1.getAhorro());
		
		//Paso7
		hucha1.meterDinero(hucha1.contarDinero());
		System.out.println(hucha1.getAhorro());
		
		//Paso8
		hucha1.meterDinero(hucha1.romperHucha());
		System.out.println(hucha1.getAhorro());
	}	

}
