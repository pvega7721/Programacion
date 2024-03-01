package ejRepaso3;

public class Telefono {
	//Protected para que las clases hijas puedan verlos.
	protected Integer numero;
	protected Boolean enLlamada;
	
	
	
	public Telefono(Integer numero) {
		this.numero = numero;
		this.enLlamada = false;
	}

	//Método que devuelve el número de telefono
	public Integer consultarNumero() {
		return this.numero;
	}
	
	public void marcar(Integer numero) {
		System.out.println("LLAMANDO A " + numero);
		if(numero.equals(this.numero)) {
			System.out.println("COMUNICANDO");
		}else {
			System.out.println("EN COMUNICACIÓN");
			this.enLlamada = true;
		}
	}
	public void colgar() {
		if(enLlamada == true) {
			System.out.println("COMUNICACIÓN TERMINADA");
			this.enLlamada=false;
		}
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Boolean getEnLlamada() {
		return enLlamada;
	}

	public void setEnLlamada(Boolean enLlamada) {
		this.enLlamada = enLlamada;
	}
	
}
