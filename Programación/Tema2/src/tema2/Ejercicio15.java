package tema2;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introduce un número: ");
		
		int numero =scanner.nextInt();
		
		int i =0;
		
		while (i <=10) {
			System.out.println(numero + "x" + i + " = " + numero * i);
			i++;
		}
		
		scanner.close();
		
	}

}
