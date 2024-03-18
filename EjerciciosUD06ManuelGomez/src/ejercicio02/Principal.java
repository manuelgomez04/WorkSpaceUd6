package ejercicio02;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double temperaturaCel, temperaturaFar, conversor = 32;
		String aux;
		boolean repetir = false;

		do {

			try {

				System.out.println("Diga la temperatura en grados celsius ");
				aux = sc.nextLine();
				temperaturaCel = Integer.parseInt(aux);

				if (temperaturaCel <= -273) {
					throw new TemperaturaException("No puedes hacer esto esmayao");
				}
				temperaturaFar = temperaturaCel * 9 / 5 + 32;
				System.out.printf("La temperatura en Far es %.2f", temperaturaFar);
				System.out.println();
				repetir = true;

			} catch (TemperaturaException e) {
				System.out.println(e.getMessage());
			}
		} while (!repetir);

	}

}
