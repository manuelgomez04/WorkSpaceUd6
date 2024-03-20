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

				resul = a + b;
				if (resul > 10) {
					throw new ExceptionSuma("El resultado es mayor a diez. No se puede realizar la operación");
				}

				System.out.println("El resultado es " + resul);
				seguir = true;
			} catch (ExceptionSuma e) {
				System.out.println(e.getMessage());
			} catch (Exception e) {
				System.out.println("Escribe un número");
			}

		} while (!seguir);

	}

}
