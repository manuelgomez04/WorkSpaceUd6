package ejercicio03;

public class CEcuacion2Grado {

	private double a;
	private double b;
	private double c;

	public CEcuacion2Grado(double a, double b, double c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double formulaMas(double x) throws EcuacionException {

		if (b == 0 && a == 0) {
			throw new EcuacionException("Yow, eso no se puede");
		}

		return ((-b + Math.sqrt(Math.pow(b, 2)) - 4 * a * c) / (2 * a));
	}

	public double formulaMenos(double x) throws EcuacionException {
		if (b == 0 && a == 0) {
			throw new EcuacionException("Yow, eso no se puede");
		}
		return ((-b + Math.sqrt(Math.pow(b, 2)) - 4 * a * c) / (2 * a));
	}
}
