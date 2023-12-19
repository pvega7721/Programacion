package ejercicios_de_repaso;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un código HTML");
		String html = sc.nextLine();
		String[] array = html.split("");
		Boolean etiquetaAbierta = false;
		
		for(String caracter : array) {
			if (caracter.equals("<")) {
				etiquetaAbierta = true;
			}
			else if (caracter.equals(">")) {
				etiquetaAbierta = false;
			}
			else if (!etiquetaAbierta) {
				System.out.print(caracter);
			}
		}
		sc.close();
		
	}

}
