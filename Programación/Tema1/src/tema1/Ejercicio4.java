package tema1;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		//Le preguntamos la edad al usuario
		System.out.println("Indica tu año de nacimiento:");
		//Esperamos a que responda
		int añoNacimiento = scanner.nextInt();
		//Creamos una variable con el año de nacimiento introducido por el usuario
		int añoActual = 2023;
		//Creamos otra variable con el año actual
		int edad = añoActual - añoNacimiento;
		//Creamos otra con la resta de las dos
		System.out.println("Tienes " + edad + " años");
		
		scanner.close();
	}

}
