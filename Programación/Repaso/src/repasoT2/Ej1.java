package repasoT2;

import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce tu nombre");
		String nombre = sc.nextLine();
		
		System.out.println("Introduce tu año de nacimiento");
		int anyo = sc.nextInt();
		
		int edad = 2030-anyo;
		
		System.out.println("Hola " + nombre + ", en el año 2030 tendrás " + edad + " años");
		
		sc.close();
	}

}
