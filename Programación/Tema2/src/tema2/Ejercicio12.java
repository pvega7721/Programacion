package tema2;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		      Scanner scanner = new Scanner(System.in);
		      
		      String usuario;
		      
		      int longitud;
		      
		      Boolean contieneEspacios;
		      do {
		      
		    	  //Pedimos usuario
		    	  System.out.println("Escribe un nombre de usuario");
		    	  usuario = scanner.nextLine();
		    	  
		    	  //Quitamos espacios al inicio y al fin
		    	  usuario = usuario.trim();
		      
		    	  //Convertimos a mayúsculas
		    	  usuario = usuario.toUpperCase();
		    	  
		    	  longitud = usuario.length();
		    	  contieneEspacios = usuario.contains(" ");
		    	  if (longitud < 10) {
		    		  System.out.println("La longitud es menor a 10");
		    	  }
		    	  if (contieneEspacios) {
		    		  System.out.println("No puede contener espacios");
		    	  }
		      
		      }
		      
		      while (longitud<10 || contieneEspacios);
		      
		      System.out.println("Correcto. Tu username es" + usuario);
		      
		      scanner.close();
		    }
		}