package ejercicio37_38;

public class PilaCadenas extends Estructura{

	public PilaCadenas() {
		super();
	}
	@Override
	public String sacarCadena() {
		if(datos.isEmpty()) {
			return null;
		}
		return datos.remove(datos.size()-1);
	}
	
	
}
