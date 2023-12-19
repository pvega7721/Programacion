package ejercicios_prácticos;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Cuántos números quieres?");
		int tamaño =scanner.nextInt();
		
		int[] numeros = new int[tamaño];
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Dime un número");
			int x = scanner.nextInt();
			numeros[i] = x;
		}
		
		for (int i = numeros.length-1; i>= 0; i--) {
			System.out.println(numeros[i] + " ");
		}
		
		int maximo = numeros[0];
		int minimo = numeros[0];
		int posMaximo = 0;
		int posMinimo = 0;
		int suma = 0;
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i] + " ");
			System.out.println();
			
			if (numeros[i] > maximo) {
				maximo = numeros[i];
				posMaximo = i;
			}else if (numeros[i] < minimo) {
				minimo = numeros[i];
				posMinimo = i;
			}
			suma += numeros[i];
		}
		int media = suma/numeros.length;
		System.out.println("Máximo: " + maximo + " en posición " + posMaximo);
		System.out.println("Mínimo: " + minimo + " en posición " + posMinimo);
		System.out.println("Media: " + media);
		
		
		
		scanner.close();
	}

}
