package ejercicio23;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		Alumno alumno = new Alumno();
		//alumno.dni="45382950v";
		//alumno.nombre="Pablo";
		System.out.println("Introduce tu DNI");
		String dni = sc.nextLine();
		alumno.setDni(dni);
		
		System.out.println("Introduce tu edad");
		Integer edad = sc.nextInt();
		alumno.setEdad(edad);
		
		sc.nextLine();
		
		System.out.println("Introduce tu nombre");
		String nombre = sc.nextLine();
		alumno.setNombre(nombre);
		
		
		System.out.println("Introduce tu nota");
		Double nota = sc.nextDouble();
		alumno.setNota(nota);
		
		sc.nextLine();
		
		System.out.println("Introduce tu curso");
		String curso = sc.nextLine();
		alumno.setCurso(curso);
		//Mostramos los datos del alumno1
		System.out.println("Alumno 1:");
		System.out.println("Tu dni es: " + alumno.getDni() + "\nTu edad es: " + alumno.getEdad() + "\nTu nombre es: " + alumno.getNombre() + "\nTu nota es: " + alumno.getNota() + "\nTu curso es : " + alumno.getCurso()) ;
	
		//Alumno2
		Alumno alumno2 = new Alumno(dni, nota);
		//System.out.println("Alumno 2:");
		//System.out.println("Tu dni es: " + alumno2.getDni() + "\nTu edad es: " + alumno2.getEdad() + "\nTu nombre es: " + alumno2.getNombre() + "\nTu nota es: " + alumno2.getNota()) ;
		
		alumno.aprobar();
		//System.out.println("Nueva nota:" + alumno.getNota());
		
		Alumno alumno3 = new Alumno(dni);
		//System.out.println("Alumno3: ");
		//System.out.println("Nuevo dni: " + alumno3.getDni());
		
		//Profesor1
		Profesor profesor1 = new Profesor();
		//Preguntamos su nombre
		System.out.println("Introduce el nombre del profesor");
		String nombreProfesor = sc.nextLine();
		profesor1.setNombre(nombreProfesor);
		//preguntamos su edad
		System.out.println("Introduce la edad del profesor");
		Integer edadProfesor = sc.nextInt();
		profesor1.setEdad(edadProfesor);
		
		//Mostramos los datos del profesor1
		System.out.println("Profesor1");
		System.out.println("Su nombre es: " + profesor1.getNombre() + "\nSu edad es " + profesor1.getEdad());
		
		
		sc.close();
		
	}

}