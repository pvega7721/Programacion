package ejercicios_de_repaso;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("¿Cuántos alumnos hay en clase?");
		int numAlumnos = sc.nextInt();
		
		
		for(int i = 1; i < numAlumnos; i++) {
			System.out.println("¿Cuál es el nombre del alumno " + i + "?");
		String nombreAlumno=sc.nextLine();
		
		sc.next();
		
		System.out.println("¿Cuál es la nota de " + nombreAlumno + " para el examen 1?");
		int examen1 = sc.nextInt();
		
		System.out.println("¿Cuál es la nota de " + nombreAlumno + " para el examen 2?");
		int examen2 = sc.nextInt();
		
		System.out.println("¿Cuál es la nota de " + nombreAlumno + " para el examen 3?");
		int examen3 = sc.nextInt();
		
		float media = (examen1 + examen2 + examen3) /3;
		}
		
	
		
		
		
		
		
		
		
	}

}
