package repasoT2;

import java.util.Scanner;

public class Ej15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce una URL:");
		String url = sc.nextLine();
		
		int barra = url.indexOf("//");
		String htp = url.substring(barra);
	
		int w = url.indexOf("www");
		String w3 = url.substring(w);
		
		int com = url.lastIndexOf(".");
		String dominio = url.substring(com);
		
		System.out.println(htp);
		System.out.println(w3);
		System.out.println(dominio);
		
		
	}

}
