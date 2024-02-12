package ejercicio34_2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;


public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Set<String> conjunto1 = new HashSet<>();
		
		while(conjunto1.size() <5) {
			System.out.println("Introduce una cadena");
			conjunto1.add(sc.nextLine());
		}
		
		System.out.println(conjunto1);
		
		Set<String> conjuntoMay = new HashSet<>();
		for (String string : conjunto1) {
			String cadenaMay = string.toUpperCase();
			conjuntoMay.add(cadenaMay);
		}
		conjunto1 = conjuntoMay;
		
		
		System.out.println(conjuntoMay);
		if(conjunto1.contains("")) {
			System.out.println("El conjunto está vacío");
		}
		
		Iterator<String> iterator = conjunto1.iterator();
		while (iterator.hasNext()) {
			if (iterator.next().length()<6) {
				iterator.remove();
			}
		}
		System.out.println(conjunto1);
		
		sc.close();
	}

	@Override
	public String toString() {
		return "App [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
