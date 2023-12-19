package ejercicios_repaso;

import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introduce el nombre de una ciudad: ");
		String c1 = scanner.nextLine();
		int largoc1 = c1.length();
		
		
		System.out.println("Introduce otro: ");
		String c2 = scanner.nextLine();
		int largoc2 = c2.length();
		

		System.out.println("El último: ");
		String c3 = scanner.nextLine();
		int largoc3 = c3.length();
		 
		
		if (largoc1 <= largoc2 && largoc1 <= largoc3 && largoc2 <= largoc3) {
			System.out.println(c1);
			System.out.println(c2);
			System.out.println(c3);
		}
		else if (largoc1 <= largoc2 && largoc1 <= largoc3 && largoc3 <= largoc2) {
			System.out.println(c1);
			System.out.println(c3);
			System.out.println(c2);
		}
		else if (largoc2 <= largoc1 && largoc2 <= largoc3 && largoc1<= largoc3) {
			System.out.println(c2);
			System.out.println(c1);
			System.out.println(c3);
		}
		else if (largoc2 <= largoc1 && largoc2 <= largoc3 && largoc3 <= largoc1) {
			System.out.println(c2);
			System.out.println(c1);
			System.out.println(c3);
		}
		else if (largoc3 <= largoc1 && largoc3 <= largoc2 && largoc2 <= largoc1) {
			System.out.println(c3);
			System.out.println(c2);
			System.out.println(c1);
		}
		else if (largoc3 <= largoc1 && largoc3 <= largoc2 && largoc1 <= largoc2) {
			System.out.println(c3);
			System.out.println(c1);
			System.out.println(c2);
		};
		
		
		scanner.close();
	}

}
