package ejercicios_prácticos;

import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una palabra");
		String palabra = sc.nextLine();
		sc.close();
		String[] letras = palabra.split("");
		
		for (int i = letras.length-1; i>=0; i--)
			System.out.print(letras[i]);
	}

}