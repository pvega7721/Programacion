package tema2;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		String nombre1, nombre2;
		
		do { //Solicitamos primera cadena
		System.out.println("Escribe una nombre: ");
		nombre1 = scanner.nextLine();
		//Solicitamos segunda cadena
		System.out.println("Escribe otro nombre: ");
		nombre2 = scanner.nextLine();
		
		} 
		while (nombre1.isBlank() || nombre2.isBlank());
		
			int comparacion = nombre1.compareTo(nombre2);
		
			if (comparacion <=0) {
			System.out.println("Orden correcto: " + nombre1 + " - " + nombre2);
			}
			else {
			System.out.println("Orden correcto: " + nombre2 + " - " + nombre1);
			}
		
			scanner.close();
		

	}

}
