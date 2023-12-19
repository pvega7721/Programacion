package tema1;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		//Le pedimos al usuario que ingrese su peso
		System.out.println("Indica tu peso(Kg)");
		//Lo guardamos en una variable
		float peso = scanner.nextFloat();
		//Le pedimos que ingrese su altura
		System.out.println("Indica tu altura(Metros)");
		//La guardamos en una variable
		float altura = scanner.nextFloat();
		//Creamos una variable calculando la altura al cuadrado
		double altura2 = altura * altura;
		//Hacemos el cálculo del IMC
		double imc = peso / altura2;
		System.out.println("Tu IMC es de: " + imc);
		
		scanner.close();
	}

}
