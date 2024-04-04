package ejercicio;

import java.time.LocalDate;

public class Taller {

	public boolean comprobarGarantia(int aniosGarantia, int anio) throws GarantiaException {

		if (LocalDate.now().getYear() - anio > aniosGarantia) {

			throw new GarantiaException("Garantía ha acabado");
		} else {
			return true;
		}

	}

	public void precioArreglo(double precio) throws PrecioNegativoException {

		if (precio < 0) {
			throw new PrecioNegativoException("El precio no puede ser negativo");
		}

	}

	public void matriculaFormato(String matricula) throws FormatoMatriculaException {

		if (matricula.matches("[0-9]{4}[A-Z]{3}")) {

		} else {
			throw new FormatoMatriculaException("La matrícula está mal puesta");
		}
	}

}
