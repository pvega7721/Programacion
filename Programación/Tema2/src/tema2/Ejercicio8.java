package tema2;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);

		
		String numero1, numero2;
		
		
		
		System.out.println("Introduce una palabra:");
		
		numero1 = scanner.nextLine().trim();
		
		do {
			
			
			System.out.println("Escribe otra palabra: ");
			numero2 = scanner.nextLine().trim();
			
		if (!numero1.equalsIgnoreCase(numero2))
			System.out.println(numero1 + " y " + numero2 + " no son iguales");
			
		} while (!numero1.equalsIgnoreCase(numero2));
		
		System.out.println("Gracias!" + numero1 + " y " + numero2 + " son iguales");
		
		scanner.close();
		
		
	}

}