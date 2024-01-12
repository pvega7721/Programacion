package ejercicio22;

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
		
		System.out.println("Alumno 1:");
		System.out.println("Tu dni es: " + alumno.getDni() + "\nTu edad es: " + alumno.getEdad() + "\nTu nombre es: " + alumno.getNombre() + "\nTu nota es: " + alumno.getNota()) ;
	
		sc.close();
		
		//Alumno2
		Alumno alumno2 = new Alumno(dni, nota);
		System.out.println("Alumno 2:");
		System.out.println("Tu dni es: " + alumno2.getDni() + "\nTu edad es: " + alumno2.getEdad() + "\nTu nombre es: " + alumno2.getNombre() + "\nTu nota es: " + alumno2.getNota()) ;
		
		alumno.aprobar();
		System.out.println("Nueva nota:" + alumno.getNota());
		
		Alumno alumno3 = new Alumno(dni);
		System.out.println("Alumno3: ");
		System.out.println("Nuevo dni: " + alumno3.getDni());
		
		
	}

}