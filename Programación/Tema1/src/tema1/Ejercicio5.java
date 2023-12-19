package tema1;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		//Le hacemos la pregunta al usuario
		System.out.println("¿Cuánto te gustaría ganar al año?");
		//Guardamos la respuesta en una variable
		int sueldoAnual = scanner.nextInt();
		//Hacemos la operación
		int sueldoMensual = sueldoAnual / 12;
		System.out.println("Tu sueldo mensual será de " + sueldoMensual + "€");
		
		scanner.close();
	}

}
