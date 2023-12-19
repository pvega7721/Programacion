package repaso_tema1;

import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un número");
		String num1 = sc.nextLine();
		int numero1 = Integer.parseInt(num1);
		
		System.out.println("Introduce otro");
		String num2 = sc.nextLine();
		int numero2 = Integer.parseInt(num2);
		
		int resultado = numero1 * numero2;
		
		System.out.println(num1 + "x" + num2 + "=" + resultado );
		
		sc.close();
	}

}
