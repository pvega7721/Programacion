package repasoT2;

import java.util.Scanner;

public class Ej8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String frase = sc.nextLine();
		
		Boolean inicio = true;
		Boolean fin = true;
		
		if (frase.startsWith("hola") || frase.startsWith("Hola")) {
			inicio=true;
			
		}
		else{
			inicio=false;
		}
		if (frase.endsWith("adios") || frase.endsWith("Adios")) {
			fin=true;
			
		}
		else{
			inicio=false;
		}
	}

}
