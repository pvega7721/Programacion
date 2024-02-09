package ejercicio19;

import java.util.Scanner;

import ejercicio18.Alumno;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Alumno alumno1 = new Alumno();
		System.out.println("Introduce nombre del alumno: ");
		alumno1.setNombre(sc.nextLine());
		
		System.out.println("Introduce el dni del alumno: ");
		alumno1.setDni(sc.nextLine());
		
		System.out.println("Introduce la edad del alumno: ");
		alumno1.setEdad(sc.nextInt());
		
		System.out.println("Introduce la nota del alumno: ");
		alumno1.setNota(sc.nextDouble());
		
		sc.close();
	}

}
