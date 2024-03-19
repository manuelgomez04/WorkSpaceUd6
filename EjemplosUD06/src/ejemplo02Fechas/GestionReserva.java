package ejemplo02Fechas;

import java.time.LocalDate;

public class GestionReserva {

	private LocalDate fecha;

	public GestionReserva(LocalDate fecha) {
		super();
		this.fecha = fecha;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFechaHoy(LocalDate fecha) {
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return "GestionReserva [fechaHoy=" + fecha + "]";
	}

	public void hacerReserva(LocalDate fechaReserva) throws ExceptionFechaReserva {

		if (fechaReserva.isBefore(LocalDate.now())) {
			throw new ExceptionFechaReserva("No puedes reservar para antes de hoy");
		}
		System.out.println("Hecho");

	}

}
