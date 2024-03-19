package ejemplo02Fechas;

import java.time.LocalDate;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String aux, fecha;
		Boolean seguir = false;
		GestionReserva gr = new GestionReserva(LocalDate.now());

		try {

			do {

				System.out.println("Diga fecha");
				fecha = sc.nextLine();

				LocalDate fechaR = LocalDate.parse(fecha);
				gr.hacerReserva(fechaR);
			} while (!seguir);

		} catch (ExceptionFechaReserva e) {
			System.out.println(e.getMessage());
		}
	}

}
