package ejercicios_repaso;

import java.util.Random;
import java.util.Scanner;

public class Ej15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		
		int aleatorio = random.nextInt(0,10);
		int intento = 0;
		int respuesta;
		int nota;
		do {
			System.out.println("Adivina el número: ");
			respuesta = scanner.nextInt();
			intento++;
			nota = 10 - intento;
			
		
		}while(respuesta!=aleatorio);
		
			if (respuesta==aleatorio){
				System.out.println("Tu puntuación es de: " + nota);

			}
		
		
		
	
		scanner.close();
	}
		
	}
