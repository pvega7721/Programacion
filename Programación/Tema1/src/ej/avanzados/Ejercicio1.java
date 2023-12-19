package ej.avanzados;

import java.util.Scanner;

public class Ejercicio1 {
	public static final double PI = 3.14;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scanner = new Scanner (System.in);
		//Le pedimos al usuario el radio del círculo
		System.out.println("Introduce el radio del círculo:");
		//Lo guardamos en una variable
		double radio = scanner.nextDouble();
		//Hacemos la operación para el área
		double area = PI * (radio * radio);
		//Hacemos la operación para el perímetro
		double perimetro = 2 * PI * radio;
		//Mostramos por pantalla el resultado de las dos operaciónes
		System.out.println("El área del circulo es: " + area + "\n El perímetro del circulo es: " + perimetro);
		
		scanner.close();
		
		//Perímetro:2*pi*r
		//Area:3,14 * (r*r)
		
		/*Realizar un programa que solicite el radio de un círculo y nos indique a continuación cuál es la
		circunferencia y el área de dicho círculo como resultado.
		Utiliza las constantes de Java cuando consideres oportuno.*/
	}

}
