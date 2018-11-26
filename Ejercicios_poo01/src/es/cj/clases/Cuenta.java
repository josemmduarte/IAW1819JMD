package es.cj.clases;

public class Cuenta {
	
	// Attributes
	private String nombre;
	private String ccc;
	private double saldo;
	private double tipodeinteres;
	
	// Constructors
	public Cuenta() {

	}

	public Cuenta(String nombre, String ccc, double saldo, double tipodeinteres) {
		super();
		this.nombre = nombre;
		this.ccc = ccc;
		this.saldo = saldo;
		this.tipodeinteres = tipodeinteres;
	}

	// GET y SET (alt+s+shift)
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCcc() {
		return ccc;
	}

	public void setCcc(String ccc) {
		this.ccc = ccc;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getTipodeinteres() {
		return tipodeinteres;
	}

	public void setTipodeinteres(double tipodeinteres) {
		this.tipodeinteres = tipodeinteres;
	}

	
	/////////////////////////////////////////////////////////////////////
	@Override
	public String toString() {
		return "Cuenta [nombre=" + nombre + ", ccc=" + ccc + ", saldo=" + saldo + ", tipodeinteres=" + tipodeinteres
				+ "]";
	}
}
