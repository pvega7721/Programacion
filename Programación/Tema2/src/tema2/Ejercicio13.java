package tema2;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Por favor, introduce un texto:");
		String texto = scanner.nextLine();
		
		int inicio = 0;
		int fin = 5;
		int tamTotal = texto.length();
		
		while (fin <= tamTotal) {
			System.out.println(texto.substring(inicio, fin));
			inicio = fin;
			fin = fin +5;
		}
		
		scanner.close();
		
		
	}
}