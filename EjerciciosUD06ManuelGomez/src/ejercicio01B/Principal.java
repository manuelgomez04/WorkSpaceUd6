package ejercicio01B;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String aux;
		int opcion, num, den;
		boolean repetir = false;
		Operaciones o = new Operaciones();

		do {
			try {

				System.out.println("Diga numerador");
				aux = sc.nextLine();
				num = Integer.parseInt(aux);

				System.out.println("Diga numerador");
				aux = sc.nextLine();
				den = Integer.parseInt(aux);

				System.out.println(o.dividir(num, den));
//			System.out.println(o.raizCuadrada(-2));
				repetir = true;
			} catch (ArithmeticException e) {
				System.out.println("El denominador no puede ser 0");
			} catch (Exception e) {
				System.out.println("Error inesperado");
			}
		} while (!repetir);
	}
}
