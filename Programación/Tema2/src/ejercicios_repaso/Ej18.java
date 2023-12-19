package ejercicios_repaso;

import java.util.Scanner;

public class Ej18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Escribe una palabra: ");
		
		String palabra = scanner.nextLine();
		
		int largoPalabra = palabra.length();
		
		int lPalabra = palabra.length();
		
		for (int i = 0; i < lPalabra; i++) {
			
			String subPalabra = palabra.substring(largoPalabra -1, largoPalabra);
			
			System.out.print(subPalabra);
			largoPalabra--;
		}
			
		scanner.close();
		
		
	}

}
