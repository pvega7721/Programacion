package ejercicio43;

public class Actor extends Persona {
	
	public Integer getSueldo() {
		Integer sueldo = 100000;
		return sueldo;
	}
	
	@Override
	public Integer getSueldo() {
		return (100000);
	}
}
