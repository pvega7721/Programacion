package ejercicios_prácticos;

import java.util.Random;

public class Ejercicio20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random random = new Random();
		//Creamos el array con las 10 palabras
		String[] array = new String[] {"azulejo","tenedor","saltamontes","carretilla","molinero","sofisticado","terremoto","culinario","teclado","primavera"};
		//Declaramos una variable que coja una palabra
		Integer aleatorio = random.nextInt(0,10);
		//creamos un array que separe la palabra elegida letra a letra
		String[] palabra = array[aleatorio].split("");
		
		for (int i = 0; i < palabra.length; i++) {
			System.out.println(palabra[i]);
		}
		
		
		
		
		
		
	}

}
