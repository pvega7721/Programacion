package tema1;

import java.util.Scanner; 

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Escribe un número");
		
		String a = scanner.nextLine();
		
		System.out.println("Escribe otro número");
		
		Double b = scanner.nextDouble(); 
		
		System.out.println("Escribe otro");
		
		Float c = scanner.nextFloat();
		
		//String a Long
		Long x1 = Long.parseLong(a);
		//Double a String
		String x2 = Double.toString(b);
		//Double a Integer
		Integer x3 = b.intValue();
		//Float a Long
		Long x4 = c.longValue();
		
		System.out.print("Variable 1: " + x1 +"\n Variable 2: " + x2 + "\n Variable 3: " + x3 +"\n Variable 4: " + x4 );
		scanner.close();
		
		
	}

}
