package ejercicios_Basicos;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String frase = ("  Hola mi nombre es Pablo");
		String sinEspaciosMinuscula= getMinuscula(frase);
		System.out.println(sinEspaciosMinuscula);
	}

	public static String getMinuscula(String sinEspaciosMinuscula) {
		// TODO Auto-generated method stub
		
		return sinEspaciosMinuscula.trim().toLowerCase();
	}

	
	
}
