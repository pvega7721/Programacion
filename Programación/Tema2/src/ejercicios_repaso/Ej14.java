package ejercicios_repaso;

import java.util.Scanner;

public class Ej14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Escribe una palabra de al menos 8 caracteres");
		String cont= scanner.nextLine();
		
		String nuevaCont = cont.replaceAll("a", "4").replaceAll("e", "3").replaceAll("i", "1").replaceAll("o", "0").replaceAll("t", "7");
		
		System.out.println("Tu contraseña es: " + nuevaCont);

		scanner.close();
	}

}
