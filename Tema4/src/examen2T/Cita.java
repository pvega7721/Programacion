package examen2T;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public abstract class Cita {
	protected LocalDate fechaCita;
	protected Integer hora;
	protected String nombrePaciente;
	protected Boolean seguroPrivado;
	protected Boolean facturada;
	protected BigDecimal factura;

	public Cita(String nombrePaciente) {
		super();
		this.nombrePaciente = nombrePaciente;
		this.seguroPrivado = false;
		this.facturada = false;
	}

	public Cita(LocalDate fechaCita, Integer hora, String nombrePaciente, Boolean seguroMedico) {
		super();
		this.fechaCita = fechaCita;
		this.hora = hora;
		this.nombrePaciente = nombrePaciente;
		this.seguroPrivado = seguroMedico;
		this.facturada = false;
	}

	public LocalDate getFechaCita() {
		return fechaCita;
	}

	public void setFechaCita(LocalDate fechaCita) {
		this.fechaCita = fechaCita;
	}

	public Integer getHora() {
		return hora;
	}

	public void setHora(Integer hora) {
		this.hora = hora;
	}

	public String getNombrePaciente() {
		return nombrePaciente;
	}

	public void setNombrePaciente(String nombrePaciente) {
		this.nombrePaciente = nombrePaciente;
	}

	public Boolean getSeguroMedico() {
		return seguroPrivado;
	}

	public void setSeguroMedico(Boolean seguroMedico) {
		this.seguroPrivado = seguroMedico;
	}

	public Boolean getFacturada() {
		return facturada;
	}

	public void setFacturada(Boolean facturada) {
		this.facturada = facturada;
	}

	public abstract BigDecimal getImporteFactura();

	public String getDiasHastaCita() {
		Period periodo = LocalDate.now().until(fechaCita);
		if (LocalDate.now().isAfter(fechaCita)) {
			return "-1";
		} else {
			Integer diasDiferencia = periodo.getDays();
			return "Quedan " + diasDiferencia + " días para la cita";
		}
	}

	@Override
	public int hashCode() {
		return Objects.hash(fechaCita, hora);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cita other = (Cita) obj;
		return Objects.equals(fechaCita, other.fechaCita) && Objects.equals(hora, other.hora);
	}

	@Override
	public String toString() {
		if (seguroPrivado) {
			DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			return "[" + nombrePaciente + " - " + fechaCita.format(formato) + " - " + hora + " horas" + " - CON SEGURO"
					+ "]";
		} else {
			DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			return "[" + nombrePaciente + " - " + fechaCita.format(formato) + " - " + hora + " horas" + " - SIN SEGURO"
					+ "]";

		}
	}

}
