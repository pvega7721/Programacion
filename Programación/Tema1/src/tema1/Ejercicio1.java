package tema1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.println("Dime tu nombre por favor");
		
		String nombre = scanner.nextLine();
		
		System.out.println("Dime tu apellido por favor");
		
		String apellido = scanner.nextLine();
		
		System.out.println("Tu nombre completo es: " + nombre + " " + apellido);
		
		scanner.close();
	}
	

}
