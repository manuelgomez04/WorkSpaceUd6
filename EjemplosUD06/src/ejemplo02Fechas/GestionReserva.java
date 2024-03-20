package ejemplo02Fechas;

import java.time.LocalDate;

public class GestionReserva {

	public void hacerReserva(LocalDate fechaReserva) throws ExceptionFechaReserva {

		if (fechaReserva.isBefore(LocalDate.now())) {
			throw new ExceptionFechaReserva("No puedes reservar para antes de hoy");
		}
		System.out.println("Hecho");

	}

}
