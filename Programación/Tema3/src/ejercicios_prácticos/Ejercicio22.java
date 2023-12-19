package ejercicios_prácticos;

import java.util.Scanner;

public class Ejercicio22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una palabra:");		
		
		String[] letras = sc.nextLine().split("");
		
		for (String palabra : letras) {
			System.out.println(palabra);
			
		}
		
		sc.close();
	}

}
