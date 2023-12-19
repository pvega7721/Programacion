package tema1;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		//Le pedimos la edad al usuario
		System.out.println("Indica tu edad: ");
	
		String edad = scanner.nextLine();
		
		System.out.println("Su edad es de " + edad);
		
		scanner.close();
	}

}
