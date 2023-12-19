package bucles;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);

		
		int numero1, numero2;
		
		System.out.println("Introduce un número:");
		
		numero1 = scanner.nextInt();
		
		do {
			System.out.println("Escribe otro número: ");
			numero2 = scanner.nextInt();
			
		if (numero1 != numero2)
			System.out.println("Los números " + numero1 + " y " + numero2 + " no son iguales");
			
		} while (numero1 != numero2);
		
		System.out.println("Gracias! Los números " + numero1 + " y " + numero2 + " son iguales");
		
		scanner.close();
		
		
	}

}
