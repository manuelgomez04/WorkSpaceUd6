package ejercicio;

import java.time.LocalDate;

public class Taller {

	public void comprobarGarantia(Coche c, int anio) {

		if (LocalDate.now().getYear() - anio > c.getAniosGarantia()) {
			throw new GarantiaException("La garantía del coche ha expirado");
		}

		System.out.println("El coche sigue en garantía");
	}

	public void precioArreglo(Coche c) {

		if (c.getPrecio() < 0) {
			throw new PrecioNegativoException("El precio del arreglo no puede ser negativo");
		}
		System.out.println("El precio del arreglo es " + c.getPrecio());
	}

	public void matriculaFormato(Coche c) {

		if (c.getMatricula().matches("(([A-Z]{1,2})(\\d{4})([A-Z]{0,2}))|((E)(\\d{4})([A-Z]{3})")) {
			System.out.println("Matrícula correcta");
		} else {
			throw new FormatoMatriculaException();
		}
	}

}
