package bucles;

import java.util.Scanner;

public class Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int contador = 1;
		int acumulado = 0;
		
		while (contador <=7) {
			acumulado = acumulado + 10;
			contador = contador +1;
		}
		
		System.out.println("Resultado:" + acumulado);

	
		
		scanner.close();
	}

}
