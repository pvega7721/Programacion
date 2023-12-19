package tema2;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introduce tu año de nacimiento:");
		
		int edad = scanner.nextInt();
		
		if (edad >= 2013) {
			System.out.println("Perteneces a la Generación Alfa");
		}
		else if (edad >= 1997) {
			System.out.println("Perteneces a la Generación Z");
		}
		else if (edad >= 1981) {
			System.out.println("Perteneces a la Generación Y");
		}
		else if (edad >= 1965) {
			System.out.println("Perteneces a la Generación X");
		}
		else if (edad >= 1946) {
			System.out.println("Prteneces a la Generación de Baby Boomers");
		}
		else if (edad >= 1928) {
			System.out.println("Perteneces a la Generación Silenciosa");
		}
		else if (edad >= 1901) {
			System.out.println("Perteneces a la Generación Grandiosa");
		}
		else {
			System.out.println("Perteneces a la Generación Perdida");
		}
		
		scanner.close();
		
		
		
		
	}

}
