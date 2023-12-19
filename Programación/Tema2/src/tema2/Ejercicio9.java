package tema2;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introduce tu nombre y apellidos: ");
		String nombreCompleto = scanner.nextLine();
		
		int primerEspacio = nombreCompleto.indexOf(" ");
		
		int segundoEspacio = nombreCompleto.lastIndexOf(" ");
		
		String nombre = nombreCompleto.substring(0, primerEspacio);
		
		String apellido1 = nombreCompleto.substring(primerEspacio+1, segundoEspacio);
		
		String apellido2 = nombreCompleto.substring(segundoEspacio+1);
				
		System.out.println("Nombre: " + nombre + "\nPrimer apellido: " + apellido1 + "\nSegundo apellido: " + apellido2);
		
		scanner.close();
		
		
	}

}
