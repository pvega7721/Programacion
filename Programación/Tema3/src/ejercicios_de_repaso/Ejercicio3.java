package ejercicios_de_repaso;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] listaNotas = new Integer[] {7, 9, 8, 4, 0, 6, 3, 4, 1, 7, 3, 1, 9, 10};
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Qué nota buscas?");
		int nota = sc.nextInt();
		boolean encontrado = false;
		
		for (int i = 0; i < listaNotas.length; i++) {
			if(nota==listaNotas[i]) {
				encontrado=true;
				System.out.println("La nota buscada existe y está en la posición " + i);
			}
		}
		
		if(encontrado==false) {
			System.out.println("La nota buscada no existe");
		}
		sc.close();
		
	}

}
