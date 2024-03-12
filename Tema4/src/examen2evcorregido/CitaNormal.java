package examen2evcorregido;

import java.math.BigDecimal;
import java.time.LocalDate;

public class CitaNormal extends Cita {

	public CitaNormal(LocalDate fechaCita, Integer hora, String nombrePaciente, Boolean seguroMedico) {
		super(fechaCita, hora, nombrePaciente, seguroMedico);
	}

	@Override
	public BigDecimal getImporteFactura() {
		if (seguroPrivado) {
			return factura = new BigDecimal(100);
		} else {
			return factura = new BigDecimal(150);
		}
	}

}
