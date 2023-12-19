package tema1;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		//Le pedimos el nombre al usuario
		System.out.println("Dime tu nombre por favor");
		//Esperamos a que responda
		String nombre = scanner.nextLine();
		//Le damos la bienvenida
		System.out.println("Bienvenido " + nombre);
		//Le preguntamos de donde es
		System.out.println("¿De dónde eres?");
		//Esperamos a que responda
		String direccion = scanner.nextLine();
		//Le preguntamos cómo se vive allí
		System.out.println("¿Qué tal se vive en " + direccion + "?");
		//Esperamos a que responda
		scanner.nextLine();
		
		System.out.println("Gracias. Un saludo!");
		
		scanner.close();
	}
}
