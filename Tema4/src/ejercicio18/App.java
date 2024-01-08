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
		String dni =sc.nextLine();
		alumno.setDni(dni);
		
		System.out.println("Introduce tu edad");
		Integer edad = sc.nextInt();
		alumno.setEdad(edad);
		
		System.out.println("Introduce tu nombre");
		String nombre = sc.nextLine();
		alumno.setNombre(nombre);
	}

}
