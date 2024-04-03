package ejBasicos;

import java.util.ArrayList;
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
				System.out.println("Introduce un número entero (-1 para parar)");
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

		} finally {
			sc.close();
			System.out.println("Scanner cerrado correctamente");
		}

	}

}
