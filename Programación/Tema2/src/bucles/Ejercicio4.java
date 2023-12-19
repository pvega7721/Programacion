package bucles;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		int numero;
		int suma = 0;
		
		do {
			System.out.println("Introduce un número:");
			numero = scanner.nextInt();
			suma += numero;
			//+= se suma así mismo más lo siguiente
		} while (numero != 0);
		
		System.out.println("La suma total es de: " + suma);
		
		scanner.close();
		
		
		
		/*Realizar un programa que solicite números por consola y los vaya sumando en una cuenta acumulativa. 
		 *Pedirá números hasta que el usuario introduzca el número 0. Cuando lo haga, dejará de pedir números,
		 *mostrará el total de la suma, y terminará el programa. */
	
	
	}

}
