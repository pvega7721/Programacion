package ejercicio57;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String palabra = "";
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Dime una palabra");
			palabra = sc.nextLine();
			if (!palabra.equalsIgnoreCase("fin")) {
				String inicial = palabra.substring(0, 1);
				inicial = inicial.toUpperCase();
				Map<String, List<String>> mapa = new HashMap<>();
				List<String> nombres = new ArrayList<>();
				if (!mapa.containsKey(palabra)) {
					nombres.add(palabra);
					mapa.put(inicial, nombres);	
				}else {
					mapa.get(inicial).add(palabra);
					mapa.put(inicial, nombres);
				}
			}
		} while (palabra.equalsIgnoreCase("fin"));

		sc.close();
	}

}
