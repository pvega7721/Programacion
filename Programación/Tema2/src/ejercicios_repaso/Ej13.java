package ejercicios_repaso;

import java.util.Scanner;

public class Ej13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		String frase;
		String todo = "";
		
		do {
			System.out.println("Escribe una frase");
			frase = scanner.nextLine();
			
			if(!frase.equalsIgnoreCase("fin"))
				todo+=frase + " ";
			
		}while(!frase.equalsIgnoreCase("fin"));
		System.out.println("frase completa: " + todo);
	
		scanner.close();
	}

}
