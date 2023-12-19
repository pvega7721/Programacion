package ejercicios_prácticos;

import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
	
		System.out.println("Dime un texto");
		String texto = sc.nextLine();
		
		String[] array = texto.split(" ");
		int numPalabras = array.length;
		System.out.println("En la frase hay " + numPalabras + " palabras");
		
		String[] letra = texto.split("");
		int contador = 0;
		
		for (int i = 0; i < letra.length; i++) {
			if (letra[i].equalsIgnoreCase("a")) {
				contador++;
			}
		}
		System.out.println("En la frase hay " + contador + " letras 'a'");
		
		
		
		
		
		
		
		
		sc.close();
	}

}
