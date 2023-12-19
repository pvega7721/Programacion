package tema2;

import java.util.Scanner;

public class Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Indica la nota del examen:");
		
		int nota = scanner.nextInt();
	
		
		if (nota < 5) {
			System.out.println("Suspenso");
		} 
		else if (nota >= 5 && nota <7) {
			System.out.println("Aprobado");
			
		} 
		else if (nota >= 7 && nota <=8) {
			System.out.println("Notable");
		
		} 
		else { System.out.println("Sobresaliente");
			
			
			
		}
		
		scanner.close();
		
		
		
	}

}
