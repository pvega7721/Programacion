package ejercicios_de_repaso;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] listaNotas = new Integer[] {7, 9, 8, 4, 0, 6, 3, 4, 1, 7, 3, 1, 9, 10};
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Qué nota buscas?");
		int nota = sc.nextInt();
		int contador=0;
		
		for (int i = 0; i < listaNotas.length; i++) {
			if(nota<listaNotas[i]) {
				contador++;
			}
		}
		System.out.println("Hay " + contador + " notas mayores a la indicada");
		sc.close();
	}

}
