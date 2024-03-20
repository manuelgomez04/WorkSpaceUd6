package ejemplo02Fechas;

import java.time.LocalDate;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String fecha;
		Boolean seguir = false;
		LocalDate fechaR;
		GestionReserva gr = new GestionReserva();
		do {
			try {

				System.out.println("Diga una fecha");
				fecha = sc.nextLine();

				fechaR = LocalDate.parse(fecha);
				gr.hacerReserva(fechaR);
				seguir = true;

			} catch (ExceptionFechaReserva e) {
				System.out.println(e.getMessage());
			} catch (RuntimeException e) {
				System.out.println("Diga una fecha válida");
			} catch (Exception e) {
				System.out.println("Error inesperado");
			}
		} while (!seguir);
	}

}
