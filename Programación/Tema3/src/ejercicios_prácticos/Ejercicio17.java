package ejercicios_prácticos;

import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un texto");
		String texto = sc.nextLine();
		
		
		String[] array = texto.split(" ");
		
		for (int i=0; i < array.length; i++) {
			String primeraLetra =  array[i].substring(0,1).toUpperCase();
			if (i == 0) {
				System.out.print(array[i].toLowerCase());
				
			}else {
				System.out.print(primeraLetra + array[i].substring(1));
			}
		}
		
		
		
		sc.close();
	}

}
