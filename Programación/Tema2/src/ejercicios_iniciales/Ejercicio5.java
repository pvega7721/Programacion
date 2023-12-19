package ejercicios_iniciales;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		//Pedimos la usuario un número entero
		System.out.println("Escribe un número entero: ");
		//Creamos la variable con el número introducido
		int numero = scanner.nextInt();
		
		if ((numero % 2) == 0) {
		    System.out.println("El número introducido es par");
		}
		else {
		    System.out.println("El número introducido es impar");
		}

			
	
		scanner.close();
	}

}
