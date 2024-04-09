package ejBasico6;

import java.math.BigDecimal;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Persona persona1 = new Persona();
		
		System.out.println("Introduce la altura");
		BigDecimal altura = sc.nextBigDecimal();
		persona1.setAltura(altura);
		sc.nextLine();
		System.out.println("Introduce el género");
		String genero = sc.nextLine();
		persona1.setGenero(genero);
		
		System.out.println(persona1);
		
		sc.close();
	}

}
