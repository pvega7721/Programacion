package ej.avanzados;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		//Le pedimos al usuario un número
		System.out.println("Introduce el primer número: ");
		//Lo guardamos en una variable
		long numero1 = scanner.nextLong();
		//Le pedimos el segundo número
		System.out.println("Introduce el segundo número");
		//Lo guardamos en otra variable
		long numero2 = scanner.nextLong();
		//Hacemos la operación 
		float resultado = numero1 * numero2;
		//Mostramos el resultado
		System.out.println("El resultado de la operación es: " + resultado);
		
		scanner.close();
		//Usamos long para poder introducir números muy grandes
		
		
	}

}
