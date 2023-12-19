package repasoT1;

import java.util.Scanner;

public class Ej1 {

	public static final double PI = 3.14;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el radio del círculo (en cm): ");
		int radio = sc.nextInt();
		
		double c= 2*PI*radio;
		double a= PI*(radio*radio);
		
		System.out.println("La circunferencia del círculo es de: " + c + "cm");
		System.out.println("El área del circulo es de: " + a + "cm2");
		
		sc.close();
	}

}
