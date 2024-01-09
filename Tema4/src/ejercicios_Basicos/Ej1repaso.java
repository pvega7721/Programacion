package ejercicios_Basicos;

public class Ej1repaso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String saludo = getMayusculas("  HOLA mundo  ");
		System.out.println(saludo);
		
	}
	
	public static String getMayusculas (String saludo) {
		return saludo.trim().toUpperCase();
	}

}
