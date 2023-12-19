package ej.avanzados;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Introduce tu número favorito: ");
		
		int numerofav = scanner.nextInt();
		
		scanner.nextLine();
				
		System.out.println("Introduce tu Ciudad favorita: ");
		
		String ciudadfav = scanner.nextLine();
				
		System.out.println("Tu número favorito es: " + numerofav + "\nTu ciudad favorita es: " + ciudadfav);
		
		scanner.close();
		
	}

}
