package ejercicios_prácticos;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Por favor, introduce un número");
		int numero = scanner.nextInt();
		int cuadrados[] = new int[6];
		
		for (int i=0; i < cuadrados.length ;i++) {
			cuadrados[i] = numero*numero;
			numero++;
		}
		
		
		for (int i=0; i<cuadrados.length; i++) {
			System.out.println(cuadrados[i] + " ");
		}
	
		scanner.close();
	}

}
