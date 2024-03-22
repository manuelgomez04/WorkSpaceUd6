package ejercicio;

public class Coche {

	private String matricula;
	private String nombreDueno;
	private double precio;
	private int aniosGarantia;

	public Coche(String matricula, String nombreDueno, double precio, int aniosGarantia) {
		super();
		this.matricula = matricula;
		this.nombreDueno = nombreDueno;
		this.precio = precio;
		this.aniosGarantia = aniosGarantia;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNombreDueno() {
		return nombreDueno;
	}

	public void setNombreDueno(String nombreDueno) {
		this.nombreDueno = nombreDueno;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getAniosGarantia() {
		return aniosGarantia;
	}

	public void setAniosGarantia(int aniosGarantia) {
		this.aniosGarantia = aniosGarantia;
	}

	@Override
	public String toString() {
		return "Coche [matricula=" + matricula + ", nombreDueno=" + nombreDueno + ", precio=" + precio
				+ ", aniosGarantia=" + aniosGarantia + "]";
	}

}
