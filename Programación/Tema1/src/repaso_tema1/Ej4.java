package repaso_tema1;

import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un número");
		String a = sc.nextLine();
		
		
		System.out.println("Introduce un número decimal");
		Double b = sc.nextDouble();
		
		
		System.out.println("Introduce un número entero");
		Float c = sc.nextFloat();
	
		sc.close();
	
		Long x1 = Long.parseLong(a);
		String x2 = String.valueOf(b);
		int x3 = b.intValue();
		long x4 = c.longValue();
		
		System.out.println(x1+", "+x2+", "+x3+", "+x4);
		
		/* de String a Long- Long.parseLong(variable);
		 * de Double a String- toString(Variable);
		 * de Double a Integer-intValue(variable);
		 * de Float a Long-longValue(variable);
		 * */
	}

}
