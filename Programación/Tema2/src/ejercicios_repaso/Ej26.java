package ejercicios_repaso;

import java.util.Random;
import java.util.Scanner;

public class Ej26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		//Creamos el random que generará tres números aleatorios
		int randomNum = random.nextInt(3);
		Boolean jugar = false;
		//Creamos la variable manoJava con valor null
		String manoJava = null;
		
		//Creamos las tres opciones y se las asignamos a la mano de java
		if (randomNum == 0) {
			manoJava = "piedra";
		}else if (randomNum == 1) {
			manoJava = "papel";
		}else if (randomNum == 2) {
			manoJava = "tijera";
		}
		//Creamos dos variables para almacenar la puntuación de cada uno
		int puntosUser = 0;
		int puntosJava = 0;
		
		
		do {
			//Mostramos al usuario el mensaje
			System.out.println("Piedra, papel, tijera... un, dos, tres... ya!!");
			
			//Guardamos su mano en una variable
			String manoUsuario = scanner.nextLine().trim().toLowerCase();
			
			
			//Creamos los condicionales para que el programa compare su mano con la del usuario y vaya sumando la puntuación. 
			//Piedra vs piedra = empate
			if (manoJava.equalsIgnoreCase("piedra") && manoUsuario.equalsIgnoreCase("piedra")) {
			//piedra vs papel = papel	
			}else if (manoJava.equalsIgnoreCase("piedra") && manoUsuario.equalsIgnoreCase("papel")) {
				puntosUser++;
			//piedra vs tijeras = piedra
			}else if (manoJava.equalsIgnoreCase("piedra") && manoUsuario.equalsIgnoreCase("tijeras")) {
				puntosJava++;
			//papel vs piedra = papel
			}else if (manoJava.equalsIgnoreCase("papel") && manoUsuario.equalsIgnoreCase("piedra")) {
				puntosJava++;
			//papel vs papel = empate
			}else if (manoJava.equalsIgnoreCase("papel") && manoUsuario.equalsIgnoreCase("papel")) {
			
			//papel vs tijera = tijera	
			}else if (manoJava.equalsIgnoreCase("papel") && manoUsuario.equalsIgnoreCase("tijera")) {
				puntosUser++;
			//tijera vs piedra = piedra
			}else if (manoJava.equalsIgnoreCase("tijera") && manoUsuario.equalsIgnoreCase("piedra")) {
				puntosUser++;
			//tijera vs papel = tijera
			}else if (manoJava.equalsIgnoreCase("tijera") && manoUsuario.equalsIgnoreCase("papel")) {
				puntosJava++;
			//tijera vs tijera = empate
			}else if (manoJava.equalsIgnoreCase("tijera") && manoUsuario.equalsIgnoreCase("tijera")) {
			
			//En cualquiero otro caso, imprimimos un mensaje de error
			}else {
				System.out.println("Opción no válida");
			}
			System.out.println("Yo elijo " + manoJava);
			//Mostramos la puntuación al usuario
			if (puntosUser < puntosJava) {
				System.out.println("Has perdido, tu puntuación es de: " + puntosUser + " Y mi puntuación es de: " + puntosJava);
			}else if (puntosUser > puntosJava) {
				System.out.println("Enhorabuena! Has ganado! tu puntuación es de: " + puntosUser + " Y mi puntuación es de: " + puntosJava);
			}else {
				System.out.println("Empate, tu puntuación es de: " + puntosUser + " Y mi puntuación es de: " + puntosJava);
			}
			//Preguntamos al usuario si quiere jugar de nuevo
			System.out.println("¿Quiéres volver a jugar?");
			String respuesta = scanner.nextLine();
			//Si responde "Si", jugar será true
			if (respuesta.equalsIgnoreCase("si")) {
				jugar = true;
				//Si responde "No", jugar será false
			}else if (respuesta.equalsIgnoreCase("no")) {
				jugar = false;
				//En caso que no responda ni "Si" ni "No", mostrará un mensaje de error
			}else {
				System.out.println("Respuesta incorrecta");
			}
			
		}while(jugar != false);
		
		scanner.close();
		
	}

}
