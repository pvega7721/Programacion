package examen2T;

import java.math.BigDecimal;
import java.time.LocalDate;

public class CitaRevision extends Cita {
	private Integer nRevisiones;

	public CitaRevision(LocalDate fechaCita, Integer hora, String nombrePaciente, Boolean seguroMedico,
			Integer nRevisiones) {
		super(fechaCita, hora, nombrePaciente, seguroMedico);
		this.nRevisiones = nRevisiones;
	}

	@Override
	public BigDecimal getImporteFactura() {
		BigDecimal sumaRevisiones = new BigDecimal(nRevisiones * 10);
		BigDecimal precioBase = new BigDecimal(50);

		return factura = precioBase.add(sumaRevisiones);

	}

}
