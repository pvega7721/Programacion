package ejercicios_repaso;

import java.util.Random;
import java.util.Scanner;

public class Ej23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);

		int dado= 0;
		System.out.println("¿Cuántas veces quieres tirar el dado?");
		int n = scanner.nextInt();
		for (int i = 1; i <= n; i++) {
			dado = random.nextInt(1, 7);
			System.out.println(dado);	
		}
		
		scanner.close();
	}

}