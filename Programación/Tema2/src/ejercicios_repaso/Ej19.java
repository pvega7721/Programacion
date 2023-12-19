package ejercicios_repaso;

import java.util.Scanner;

public class Ej19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		float pesetas = 0;
		float euros = 0;
		String opcion;
		do {
			
		
		System.out.println("Elige una opción: ");
		System.out.println("1 - Pasar de Pesetas a Euros: ");
		System.out.println("2 - Pasar de Euros a Pesetas: ");
		System.out.println("3 - Salir: ");
		
		opcion = scanner.nextLine();
		
		switch(opcion) {
		
		case "1":
			System.out.println("Introduce la cantidad de pesetas");
			pesetas = scanner.nextInt();
			System.out.println(pesetas + " pesetas son: " + (pesetas / 166.386) + "€");
			break;
			
		case "2":
			System.out.println("Introduce la cantidad de euros: ");
			euros = scanner.nextInt();
			System.out.println(euros + "euros son: " + (euros * 166.386) + " Pesetas");
			break;
			
		case "3":
			break;
			
		default:
			System.out.println("Opción no válida");
		}
		scanner.nextLine();
		
		}while(!opcion.equals("3"));
		
		
		scanner.close();
	}

}
