package ejercicio44;

public class Personaje extends Jugador{
	//nombre lo tiene la clase padre
	public Integer codigo;
	public Integer puntosVida;
	
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public Integer getPuntosVida() {
		return puntosVida;
	}
	public void setPuntosVida(Integer puntosVida) {
		this.puntosVida = puntosVida;
	}
	
	@Override
	public String toString() {
		return "Personaje [codigo=" + codigo + ", puntosVida=" + puntosVida + "]";
	}
	
	
}
