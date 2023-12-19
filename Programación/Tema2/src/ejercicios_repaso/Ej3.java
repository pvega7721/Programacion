package ejercicios_repaso;

import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int respuesta = 0;
		
		do {
		System.out.println("***Menú***");
		System.out.println(" 1. Abrir");
		System.out.println(" 2. Guardar");
		System.out.println(" 3. Modificar");
		System.out.println(" 4. Salir");
		
		 respuesta = scanner.nextInt();
		
		switch (respuesta) {
		case 1: 
			System.out.println("Has elegido la opción Abrir");
			break;
		case 2: 
			System.out.println("Has elegido la opción Guardar");
			break;
		case 3: 
			System.out.println("Has elegido la opción Modificar");
			break;
		case 4: 
			System.out.println("Bye Bye");
			break;
		default:
				System.out.println("Opción incorrecta");
		}
		}while (respuesta != 4);
		
		
		scanner.close();
		}
	}

		
		
	
