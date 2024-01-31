package ejercicio41;

public class Partido {
	//Atributos
	private Equipo equipoLocal;
	private Equipo equipoVisitante;
	private Resultado resultado;
	
	//constructor por defecto
	public Partido() {
		
	}
	
	//Métodos get y set
		public Equipo getEquipoLocal() {
			return equipoLocal;
		}
		public void setEquipoLocal(Equipo equipoLocal) {
			this.equipoLocal = equipoLocal;
		}
		public Equipo getEquipoVisitante() {
			return equipoVisitante;
		}
		public void setEquipoVisitante(Equipo equipoVisitante) {
			this.equipoVisitante = equipoVisitante;
		}
		public Resultado getResultado() {
			return resultado;
		}
		public void setResultado(Resultado resultado) {
			this.resultado = resultado;
		}
		//Método toString que devuelva el resultado
		@Override
		public String toString() {
			return equipoLocal + " vs " + equipoVisitante + " = " + resultado;
		}
		
	//Método que devuleve el equipo que ha ganado
	public Equipo getEquipoGanador() {
		if(this.resultado.isVictoriaLocal() == true) {
			return equipoLocal;
		}
		else if(this.resultado.isVictoriaVisitante() == true) {
			return equipoVisitante;
		}
		else
			return null;
	}
	
	
	
	
	
	
}
