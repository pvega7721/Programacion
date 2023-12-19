package ejercicios_prácticos;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Cuántos números quieres?");
		int tamaño =scanner.nextInt();
		
		int[] numeros = new int[tamaño];
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Dime un número");
			int x = scanner.nextInt();
			numeros[i] = x;
		}
		
		for (int i = numeros.length-1; i>= 0; i--) {
			System.out.print(numeros[i] + " ");
		}
		
		
		scanner.close();

	}

}
