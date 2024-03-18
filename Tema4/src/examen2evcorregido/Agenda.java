package examen2evcorregido;

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
	//btudo: este metodo no puedes tenerlo segun el enunciado.
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
			//btudo: las fechas no se comparan con ==, con equals, con compareTo...
			if (cita.getFechaCita().equals(fecha)) {
				citasEseDia.add(cita);
			}
		}
		return citasEseDia;
	}

	//btudo: este metodo debe devolver un BigDecimal
	public BigDecimal getImportePendienteFacturar() {
		BigDecimal suma = BigDecimal.ZERO;
		for (Cita cita : listaCitas) {
			if (!cita.facturada) {
				suma = suma.add(cita.getImporteFactura());
			}
		}
		//btudo: �para que este formato aqui??? 
		return suma.setScale(2, RoundingMode.HALF_DOWN);
	}

	public Boolean tieneCitaProxima(String nombrePaciente) {
		Boolean tieneCitaProxima = null;
		for (Cita cita : listaCitas) {
			//btudo: los string no se comparan con == 
			if (cita.nombrePaciente.equals(nombrePaciente) && cita.fechaCita.isAfter(LocalDate.now())) {
				tieneCitaProxima = true;
				break;
			} else
				tieneCitaProxima = false;
		}
		
		//btudo : ojo!! este for lo recorre hasta el final, no te va a funcionar bien
		// hay que salir del bucle en cuanto lo encuentre.
		//break?
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
			//btudo: los string no se comparan con == 
			//si la cit de la fecha es anterior a hoy: is Before
			if (cita.nombrePaciente.equals(nombrePaciente) && cita.fechaCita.isBefore(LocalDate.now())) {
				cita.facturada = true;
			}
			//btudo: si no lo cumple, no hay que ponerlo a false. Se deja igual. Cuidado.
		}
	}

	public String getMedico() {
		return medico;
	}

	public void setMedico(String medico) {
		this.medico = medico;
	}

}
