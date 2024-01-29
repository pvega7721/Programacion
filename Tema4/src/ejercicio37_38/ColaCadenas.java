package ejercicio37_38;

public class ColaCadenas extends Estructura{
	
	//la lista se crea en el constructor
	public ColaCadenas() {
		super();
	}
	
	public String sacarCadena() {
		if(datos.isEmpty()) {
		return null;
		}
		return datos.remove(0);
	}
	
	
}
