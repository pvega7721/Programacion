package ejercicios_repaso;

import java.util.Scanner;

public class Ej11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
	
		System.out.println("Introduce un número entero");
		int num1 = scanner.nextInt();
		System.out.println("Introduce otro");
		int num2 = scanner.nextInt();
		int operacion;
		
		do {
		
			System.out.println("¿Qué quieres hacer con ellos?");
			System.out.println("1. Sumar");
			System.out.println("2. Restar");
			System.out.println("3. Multiplicar");
			System.out.println("4. Dividir");
			System.out.println("0. Salir");
			operacion = scanner.nextInt();
		
			int suma = (num1 + num2);
			int resta = (num1 - num2);
			int x = (num1 * num2);
			int div = (num1 % num2);
		
			if(operacion == 1) 
			{
				System.out.println(num1 + "+" + num2 + "=" + suma);
			}
			else if(operacion == 2) 
			{
				System.out.println(num1 + "-" + num2 + "=" + resta);
			}
			else if(operacion == 3) 
			{
				System.out.println(num1 + "x" + num2 + "=" + x);
			}
			else if(operacion == 4) 
			{
				System.out.println(num1 + "/" + num2 + "=" + div);
			}
		
		}while(operacion !=0);
		
		
		scanner.close();
	
	}

}
