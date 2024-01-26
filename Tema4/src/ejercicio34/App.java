package ejercicio34;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class App {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		List<String> listaCadenas = new ArrayList<>();
		String Cadena;
		
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Introduce una cadena");
			Cadena= sc.nextLine();
			listaCadenas.add(Cadena);
		}
		
		System.out.println(listaCadenas);
		
		for (int i = 0; i < listaCadenas.size(); i++) {
			
			String cad = listaCadenas.get(i);
			String cadMay = cad.toUpperCase();
			
			listaCadenas.set(i,cadMay);
		}
		System.out.println(listaCadenas);
		
		if (listaCadenas.contains("")) {
			System.out.println("Hay alguna cadena vacía en la lista");
		}
		
		Iterator<String> it = listaCadenas.iterator();
		while (it.hasNext()) {
			if(it.next().length()<6) {
				it.remove();
			}
		}
		System.out.println(listaCadenas);
	}

}
