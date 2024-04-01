package ejercicio56;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Map<Integer, Integer> numeros = new HashMap<>();

		Integer num = 1;
		Integer contador = 0;

		do {
			System.out.println("Introduce un número entero");
			num = sc.nextInt();
			if (!num.equals(0)) {

				if (numeros.containsKey(num)) {
					Integer cantidadActual = numeros.get(num);
					numeros.put(num, cantidadActual + 1);
				} else {
					numeros.put(num, 1);
				}
				contador++;
			}

		} while (!num.equals(0));

		sc.close();

	}

}
