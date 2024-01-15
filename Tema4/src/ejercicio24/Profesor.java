package ejercicio24;

//Creo clase profesor que hereda de persona
public class Profesor extends Persona{
	//generamos el toString en click derecho > generate toString
	@Override
	public String toString() {
		return "Profesor [getNombre()=" + getNombre() + ", getEdad()=" + getEdad() + "]";
	}

}
