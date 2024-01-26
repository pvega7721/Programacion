package ejercicio35;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Curso curso = new Curso();
		curso.setIdentificador(1L);
		curso.setDescripcion("DAM/DAW");

		List<Alumno> alumnos = new ArrayList<>();
		//Alumno[] alumnos = new Alumno[3];
		for (int i = 0; i < 3; i++) {
			System.out.println("Dime el dni");
			String dni = scanner.nextLine();
			Alumno alumno = new Alumno(dni);
			System.out.println("Dime el nombre");
			String nombre = scanner.nextLine();
			alumno.setNombre(nombre);
			System.out.println("Dime la edad");
			Integer edad = scanner.nextInt();
			alumno.setEdad(edad);
			System.out.println("Dime la nota");
			Double nota = scanner.nextDouble();
			scanner.nextLine();
			alumno.setNota(nota);
			alumno.setCurso(curso);
			alumnos.add(alumno);
		}
		
		for (Alumno alumno : alumnos) {
			System.out.println(alumno);
		}
		
		if (alumnos.get(0).equals(alumnos.get(1)) 
				|| alumnos.get(0).equals(alumnos.get(2))
				|| alumnos.get(1).equals(alumnos.get(2))) {
			System.err.println("Error: hay al menos 2 alumnos repetidos");
		}
		else {
			System.out.println("Felicidades: todos los alumnos son distintos!!");
		}
		
		scanner.close();
	}
}
