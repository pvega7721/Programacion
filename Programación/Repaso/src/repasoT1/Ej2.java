package repasoT1;

import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un número:");
		double num1 = sc.nextInt();
		System.out.println("Introduce otro:");
		double num2 = sc.nextInt();
		
		double mult = num1*num2;
		
		System.out.println("El reslutado de la multiplicación es de: " + mult);
		
		sc.close();
	}

}
