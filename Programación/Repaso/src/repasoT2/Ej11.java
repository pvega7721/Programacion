package repasoT2;

import java.util.Scanner;

public class Ej11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un número: ");
		int num1 = sc.nextInt();
		
		System.out.println("Introduce otro: ");
		int num2 = sc.nextInt();
		
		int respuesta;
		
		do {
			
		System.out.println("Elige una opción:");
		System.out.println("**Menu**");
		System.out.println("1. Sumar");
		System.out.println("2. Restar");
		System.out.println("3. Multiplicar");
		System.out.println("4. Dividir");
		System.out.println("0. Salir");
		respuesta = sc.nextInt();
		
		
		switch (respuesta) {
		case 1:
			System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
			break;
		case 2:
			System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
			break;
		case 3:
			System.out.println(num1 + " X " + num2 + " = " + (num1*num2));
			break;
		case 4:
			System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
			break;
		}
		
		} while (respuesta!=0);
		
		sc.close();
	}

}
