package examen.modelo;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Objects;

public class Pelicula {
	private String titulo;
	private Integer duracion;
	private LocalDate fechaInicioRodaje;
	private LocalDate fechaEstreno;
	private BigDecimal presupustoInicial;
	private BigDecimal recaudacion;
	private List<Actor> reparto;
	
	public Pelicula(String titulo) {
		super();
		this.titulo = titulo;
	}
	
	public Pelicula() {
		// TODO Auto-generated constructor stub
	}

	public BigDecimal getBeneficios() {
		// si la recaudación es menor que el presupuesto, devolverá cero
		if (recaudacion.compareTo(presupustoInicial) == -1) {
			return BigDecimal.ZERO;
		} else {
			BigDecimal beneficio = recaudacion.subtract(presupustoInicial);
			return beneficio;
		}
	}

	public Integer getTiempoRodaje() {
		//Hay que tener en cuenta también los meses
		if (fechaInicioRodaje == null || fechaEstreno == null) {
			return 0;
		} else {
			Period periodo = fechaInicioRodaje.until(fechaEstreno);
			return periodo.getMonths();
		}
	}

	public BigDecimal getRecaudacion() {
		return recaudacion;
	}

	public void setRecaudacion(BigDecimal recaudacion) {
		this.recaudacion = recaudacion;
	}


	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Integer getDuracion() {
		return duracion;
	}

	public void setDuracion(Integer duracion) {
		this.duracion = duracion;
	}

	public LocalDate getFechaInicioRodaje() {
		return fechaInicioRodaje;
	}

	public void setFechaInicioRodaje(LocalDate fechaInicioRodaje) {
		this.fechaInicioRodaje = fechaInicioRodaje;
	}

	public LocalDate getfechaEstreno() {
		return fechaEstreno;
	}

	public void setFechaEstreno(LocalDate fechaEstreno) {
		this.fechaEstreno = fechaEstreno;
	}

	public BigDecimal getPresupustoInicial() {
		return presupustoInicial;
	}

	public void setPresupustoInicial(BigDecimal presupustoInicial) {
		this.presupustoInicial = presupustoInicial;
	}

	public List<Actor> getReparto() {
		return reparto;
	}

	public void setReparto(List<Actor> reparto) {
		this.reparto = reparto;
	}

	@Override
	public int hashCode() {
		return Objects.hash(titulo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pelicula other = (Pelicula) obj;
		return Objects.equals(titulo, other.titulo);
	}

	@Override
	public String toString() {
		DecimalFormat formato = new DecimalFormat("#,##0.00 €");
		return titulo + " (" + duracion + " min.) // Recaudación: " + formato.format(recaudacion) + " ("
				+ formato.format(presupustoInicial) + "\n";
	}

}
