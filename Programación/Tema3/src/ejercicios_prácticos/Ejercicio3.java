package ejercicios_prácticos;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Cuántos números quieres?");
		
		
		int tamaño =scanner.nextInt();
		
		int[] numeros = new int[tamaño];
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Dime un número");
			int x = scanner.nextInt();
			numeros[i] = x;
		}
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i] + " ");
		}
		
		
		scanner.close();
		
	}
}

