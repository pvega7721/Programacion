package ejBasico;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Integer num = 0;
		List<Integer> listaNumeros = new ArrayList<>();

		try {
			
			while (true) {
				System.out.println("Introduce un número");
				num = sc.nextInt();

				if (num != -1) {
					listaNumeros.add(num);
				} else {
					System.out.println("Fin de programa");
					break;
				}
			}

			for (Integer integer : listaNumeros) {
				System.out.println(integer);
			}
			
			
		} catch (InputMismatchException e) {
			System.out.println("Has introducido un caracter inválido");
		} finally {
			sc.close();
			System.out.println("Scanner cerrado correctamente");
		}
	
	}

}
