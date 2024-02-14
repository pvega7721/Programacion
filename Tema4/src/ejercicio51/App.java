package ejercicio51;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.Iterator;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<BigDecimal> lista = new ArrayList<>();
		
		
		
		
		do{
			System.out.println("Introduce un número");
			BigDecimal numero = sc.nextBigDecimal();
			
			if(lista.isEmpty()) {
				lista.add(numero);
			}else if(numero.max(lista.get(lista.size()-1)).equals(numero)) {
				lista.add(numero);
			}else {
				System.out.println("Introduce un número mayor que el anterior");
			}
			
		}while(lista.size()<5);
		
		BigDecimal suma = BigDecimal.ZERO;
		
		for (BigDecimal numero : lista) {
			suma=suma.add(suma);
		}
		System.out.println("Suma sin redondear: " + suma);
		suma = suma.setScale(1, RoundingMode.HALF_DOWN);
		System.out.println("Suma redondeada" + suma);
		
		//apartado 3
		
		
		sc.close();
		}
		
	}


