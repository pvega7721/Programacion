package ejercicios_prácticos;

import java.util.Random;

public class Aleatorio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		
		int contador1=0;
		int contador2=0;
		int contador3=0;
		int contador4=0;
		int contador5=0;
		int contador6=0;
		
		for (int i = 1; i < 1001; i++) {
			int aleatorio = random.nextInt(1,7);
			switch (aleatorio) {
				case 1: 
					contador1++;
				break;
				case 2:
					contador2++;
				break;
				case 3:
					contador3++;
				break;
				case 4:
					contador4++;
				break;
				case 5:
					contador5++;
				break;
				case 6:
					contador6++;
				break;
			}
			
		}
		System.out.println("El 1 ha salido " + contador1 + " veces");
		System.out.println("El 2 ha salido " + contador2 + " veces");
		System.out.println("El 3 ha salido " + contador3 + " veces");
		System.out.println("El 4 ha salido " + contador4 + " veces");
		System.out.println("El 5 ha salido " + contador5 + " veces");
		System.out.println("El 6 ha salido " + contador6 + " veces");
		System.out.println("Total de los valores obtenidos: " + (contador1+contador2+contador3+contador4+contador5+contador6));
		
	}

}
