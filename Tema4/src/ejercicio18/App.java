package ejercicio18;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		Alumno alumno = new Alumno();
		//alumno.dni="45382950v";
		//alumno.nombre="Pablo";
		System.out.println("Introduce tu DNI");
		alumno.setDni(sc.nextLine());
		
		System.out.println("Introduce tu edad");
		alumno.setEdad(sc.nextInt());
		
		System.out.println("Introduce tu nombre");
		alumno.setNombre(sc.nextLine());
		
		sc.next();
		
		System.out.println("Introduce tu nota");
		alumno.setNota(sc.nextDouble());
		
		System.out.println("Tu dni es: " + alumno.getDni() + "\nTu edad es: " + alumno.getEdad() + "\nTu nombre es: " + alumno.getNombre() + "\nTu nota es: " + alumno.getNota()) ;
	
	}

}
