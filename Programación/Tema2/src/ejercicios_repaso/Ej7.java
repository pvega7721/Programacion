package ejercicios_repaso;

import java.util.Scanner;

public class Ej7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Introduce un número: ");
		int suma = scanner.nextInt();
		
		for (int i = 1; i <= 10; i++) {
			int numero = i * 3;
			suma = suma + numero;
			if (i == 10) {
				System.out.print(numero + " = ");
			}
			else {
				System.out.print(numero + " + ");
			}
		}
		System.out.println(suma);
				scanner.close();

	}

}
