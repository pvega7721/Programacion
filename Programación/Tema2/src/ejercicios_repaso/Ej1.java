package ejercicios_repaso;

import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introduce tu nombre: ");
		String nombre = scanner.nextLine();
		
		System.out.println("Introduce tu año de nacimiento: ");
		int edad = scanner.nextInt();
		
		int n = (2030 - edad);
		
		System.out.println("Hola " + nombre + ", en el año 2030 tendrás " + n + " años.");
				
		
		scanner.close();
		
	}

}
