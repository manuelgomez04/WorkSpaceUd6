package ejemplo02Fechas;

public class ExceptionFechaReserva extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ExceptionFechaReserva() {
		super();
	}

	public ExceptionFechaReserva(String s) {
		super(s);
	}
}
