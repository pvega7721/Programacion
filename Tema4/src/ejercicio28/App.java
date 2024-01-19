package ejercicio28;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		Alumno alumno = new Alumno();
	
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
	
		
		alumno.aprobar();
		//System.out.println("Nueva nota:" + alumno.getNota());
		
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
		
		//Imprimimos todos los datos del objeto profesor habiendo declarado tostring en la clase profesor.
		System.out.println(profesor1);
		
		
		
		
		Curso cursoAlumnos = new Curso();
		cursoAlumnos.setIdentificador(1);
		cursoAlumnos.setDescripcion("DAM-DAW");
		
		
		Alumno [] array = new Alumno[3];
		for (int i = 0; i < array.length; i++) {
			System.out.println("Introduce el nombre del Alumno");
			String nombreAlumno=sc.nextLine();
			alumno.setNombre(nombreAlumno);
			
			sc.nextLine();
			
			System.out.println("Introduce la Nota del Alumno");
			Double notaAlumno=sc.nextDouble();
			alumno.setNota(notaAlumno);
			
			System.out.println("Introduce la edad del Alumno");
			Integer edadAlumno=sc.nextInt();
			alumno.setEdad(edadAlumno);
			
			System.out.println("Introduce el DNI del Alumno");
			String dniAlumno=sc.nextLine();
			alumno.setDni(dniAlumno);
			
			sc.nextLine();
			alumno.setCurso(curso);
			array[i]= alumno;
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		
		
		
		
		
		
		
		
		sc.close();
		
	}

}