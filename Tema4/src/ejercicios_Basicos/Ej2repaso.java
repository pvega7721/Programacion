package ejercicios_Basicos;

public class Ej2repaso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String saludo = getMinusculas("   HOLA Mundo  ");
		System.out.println(saludo);
	}
	public static String getMinusculas (String saludo) {
		return saludo.trim().toLowerCase();
	}
}
