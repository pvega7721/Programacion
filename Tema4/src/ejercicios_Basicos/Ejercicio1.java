package ejercicios_Basicos;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String frase = ("   Hola mi nombre es Pablo   ");
		
		String sinEspaciosMayuscula =getMayusculas(frase);
		
		System.out.println(sinEspaciosMayuscula);
	}
	
	public static String getMayusculas(String sinEspacios) {
	
		return sinEspacios.trim().toUpperCase();
	}
}
