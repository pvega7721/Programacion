package examen2T;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Agenda {
	private String medico;
	private List<Cita> listaCitas;

	// borrar
	public List<Cita> getListaCitas() {
		return listaCitas;
	}

	public Agenda(String medico) {
		super();
		this.medico = medico;
		this.listaCitas = new ArrayList<>();
	}

	public void addCita(Cita cita) {
		if (!listaCitas.contains(cita)) {
			listaCitas.add(cita);
		}
	}

	public List<Cita> getCitasDias(LocalDate fecha) {
		List<Cita> citasEseDia = new ArrayList<>();
		for (Cita cita : listaCitas) {
								//.equals  Está mal
			if (cita.getFechaCita() == fecha) {
				citasEseDia.add(cita);
			}
		}
		return citasEseDia;
	}

	public String getImportePendienteFacturar() {
		BigDecimal suma = BigDecimal.ZERO;
		for (Cita cita : listaCitas) {
			if (!cita.facturada) {
				suma = suma.add(cita.getImporteFactura());
			}
		}
		DecimalFormat formato = new DecimalFormat("#,###.00 €");

		return "Total importe: " + formato.format(suma.setScale(2, RoundingMode.HALF_DOWN));
	}

	public Boolean tieneCitaProxima(String nombrePaciente) {
		Boolean tieneCitaProxima = null;
		for (Cita cita : listaCitas) {
							//.equals  Está mal
			if (cita.nombrePaciente == nombrePaciente && cita.fechaCita.isAfter(LocalDate.now())) {
				tieneCitaProxima = true;
			} else
				tieneCitaProxima = false;
		}
		return tieneCitaProxima;
	}

	public void borrarCitaProxima() {
		Iterator<Cita> iterator = listaCitas.iterator();
		while (iterator.hasNext()) {
			Cita cita = iterator.next();
			if (cita.getFacturada() == true) {
				iterator.remove();
			}
		}
	}

	public void facturarCitasPendientes(String nombrePaciente) {
		for (Cita cita : listaCitas) {
								//.equals  Está mal
			if (cita.nombrePaciente == nombrePaciente && cita.fechaCita.isAfter(LocalDate.now())) {
				cita.facturada = true;
			}else {
				cita.facturada = false;
			}
		}
	}

	public String getMedico() {
		return medico;
	}

	public void setMedico(String medico) {
		this.medico = medico;
	}

}
