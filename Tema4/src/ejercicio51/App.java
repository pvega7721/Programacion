package ejercicio51;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
				break;
			}
			
		}while(lista.size()<5);
		
		
		
		sc.close();
	}

}
