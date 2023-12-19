package test;

import java.util.Scanner;

public class MiScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Dame tu nombre por favor:");
		String nombre = scanner.nextLine();
		
		//nextLine se usa solamente para String, si quiero usar int, sería nextint
		System.out.println("Valor introducido: " + nombre);
		
		scanner.close();
		
	
	}

}

