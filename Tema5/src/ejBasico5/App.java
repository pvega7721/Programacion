package ejBasico5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Integer num = 0;
		SacoNumeros lista = new SacoNumeros();

		try {

			while (true) {
				try {
					System.out.println("Introduce un número");
					num = sc.nextInt();

					if (num != -1) {
						lista.addNumero(num);
					} else {
						System.out.println("Fin de programa");
						System.out.println(lista.toString());
						break;
					}

				} catch (InputMismatchException e) {
					System.out.println("Has introducido un caracter inválido");
					sc.nextLine();

				}
			}

			while (true) {
				System.out.println("Dame una posición");
				try {

					num = sc.nextInt();

					if (num != -1) {
						lista.getNumero(num);
					} else {
						System.out.println("Cerrando programa");
						break;
					}
				} catch (IndexOutOfBoundsException e) {
					System.out.println("En la posición " + num + " se encuentra: " + null);
					sc.nextLine();
				}
			}
			System.out.println("La división es: " + lista.division());

		} finally {
			System.out.println("Programa cerrado");
			sc.close();
		}
	}

}
