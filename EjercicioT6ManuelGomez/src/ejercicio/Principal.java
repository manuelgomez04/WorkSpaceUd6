package ejercicio;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String aux, nombreDueno, matricula;
		int aniosGarantia, anioCompra;
		double precoiArreglo;
		boolean seguir = false;
		Coche c;
		Taller t = new Taller();

		do {

			try {
				System.out.println("Diga matrícula del coche");
				matricula = sc.nextLine();

				System.out.println("Diga nombre del dueño del coche");
				nombreDueno = sc.nextLine();

				System.out.println("Diga precio del arreglo");
				aux = sc.nextLine();
				precoiArreglo = Double.parseDouble(aux);

				System.out.println("Diga cuantos años de garantía tiene el coche");
				aux = sc.nextLine();
				aniosGarantia = Integer.parseInt(aux);

				c = new Coche(matricula, nombreDueno, precoiArreglo, aniosGarantia);

				System.out.println("Para comprobar si el coche tiene garantía, diga el año en que lo compró");
				aux = sc.nextLine();
				anioCompra = Integer.parseInt(aux);

				t.comprobarGarantia(c, anioCompra);

				System.out.println();
				t.precioArreglo(c);

				System.out.println();
				t.matriculaFormato(c);

				seguir = true;
			} catch (GarantiaException e) {
				System.out.println(e.getMessage());

			} catch (PrecioNegativoException e) {
				System.err.println(e.getMessage());
			} catch (FormatoMatriculaException e) {
				System.err.println(e.getMessage());
			} catch (RuntimeException e) {
				System.err.println("Inserte dato válido");
			} catch (Exception e) {
				System.err.println("Error inesperado");
			}

		} while (!seguir);
	}

}
