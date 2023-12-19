package Switch;

import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introduce el precio sin IVA");
		int precioIva=scanner.nextInt();
		
		scanner.nextLine();
		
		System.out.println("Introduce el tipo de IVA");
		String tipoIva=scanner.nextLine();

		switch (tipoIva) {
		case "Normal":
			System.out.println("El precio del produto es de: " + precioIva * 1.21);
			break;
		case "Reducido":
			System.out.println("El precio del produto es de: " + precioIva * 1.10);
			break;
		case "Superreducido":
			System.out.println("El precio del produto es de: " + precioIva * 1.04);
			break;
		case "Exento":
			System.out.println("El precio del produto es de: " + precioIva * 1);
			break;
		default:
			System.out.println("Tipo de IVA no reconocido");
			break;	
		}
		scanner.close();
		}
		
	}


