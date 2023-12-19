package ejercicios_repaso;

import java.util.Scanner;

public class Ej16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introduce una palabra:");
		String palabra = scanner.nextLine();
		int longitud = palabra.length();
		
		for(int i =0; i < longitud; i++) {
			String nLetras = palabra.substring(i,i+1);
			System.out.println(nLetras);
		}
		
		scanner.close();
		
	}

}
