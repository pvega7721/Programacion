package repasoT1;

import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un número:");
		String num1 = sc.nextLine();
		
		System.out.println("Introduce otro");
		String num2 = sc.nextLine();
		
		int num1_1 = Integer.parseInt(num1);
		int num2_1 = Integer.parseInt(num2);
		
		int mult = num1_1*num2_1;
		System.out.println("El resultado de la multiplicación de los dos números es de: " + mult);
		
		sc.close(); 
	}

}
