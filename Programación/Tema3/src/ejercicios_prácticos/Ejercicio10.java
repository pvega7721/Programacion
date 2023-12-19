package ejercicios_prácticos;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		int tamaño=0;
		
		do{
			System.out.println("Introduce un número mayor que 2");
			tamaño = scanner.nextInt();
		}while (tamaño<=2);
		
		
		Integer[] array = new Integer[tamaño];
		array[0] = 0;
		array[1] = 1;
		
		for (int i = 2; i < array.length; i++) {
			
			array[i] = array[i-1] + array[i-2];
		}
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
		
		scanner.close();
		
	}

}
