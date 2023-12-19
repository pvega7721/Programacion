package ejercicios_prácticos;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner scanner = new Scanner(System.in);
	System.out.println("Introduce tu nombre completo");
	String nombreCompleto = scanner.nextLine();
	
	String[] array = nombreCompleto.split(" ");
	
	System.out.println("Nombre: " + array[0]);
	System.out.println("Apellido1: " + array[1]);
	System.out.println("Apellido2: " + array[2]);
	
	System.out.println();	
	System.out.println("Recorrido con for");
	for(int i=0; i<array.length; i++) {
		System.out.println(array[i]);
	}
	
	System.out.println();
		
	scanner.close();
		
	}

}
