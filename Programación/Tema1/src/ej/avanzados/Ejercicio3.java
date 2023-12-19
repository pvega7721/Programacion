package ej.avanzados;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		//Le pedimos al usuario un número
		System.out.println("Introduce el primer número: ");
		//Lo guardamos en una variable
		String numero1 = scanner.nextLine();
		//Le pedimos el segundo número
		System.out.println("Introduce el segundo número");
		//Lo guardamos en otra variable
		String numero2 = scanner.nextLine();
		//Cambiamos de formato número1 y número2 de String a Long
		Long numeroLargo1 = Long.parseLong(numero1);
		Long numeroLargo2 = Long.parseLong(numero2);
		//Hacemos la operación 
		float resultado = numeroLargo1 * numeroLargo2;
		//Mostramos el resultado
		System.out.println("El resultado de la operación es: " + resultado);
		
		scanner.close();
		//Usamos long para poder introducir números muy grandes
		
		
	}

}
