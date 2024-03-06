package repasoExamen;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String compañia;
		do {
			System.out.println("Introduce la compañía del avión:");
			compañia = sc.nextLine();
		}while(compañia.isEmpty() || compañia.startsWith(" "));
	}

}
