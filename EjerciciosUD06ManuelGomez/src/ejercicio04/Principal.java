package ejercicio04;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String aux;
		int a, b;
		boolean seguir = false;
		int resul;

		do {

			try {

				System.out.println("Dato a");
				aux = sc.nextLine();
				a = Integer.parseInt(aux);

				System.out.println("Dato b");
				aux = sc.nextLine();
				b = Integer.parseInt(aux);

				if (a + b > 10) {
					throw new ExceptionSuma("El resultado es mayor a diez. No se puede realizar la operación");
				}

				resul = a + b;
				System.out.println("El resultado es " + resul);

			} catch (ExceptionSuma e) {
				System.out.println(e.getMessage());
			}

		} while (!seguir);

	}

}
