package es.cj.clases;

public class Asignaturas {
	
	//Attributes
	private int identificador;
	private double calificacion;
	
	//Constructor
	public Asignaturas(int identificador) {
		super();
		this.identificador = identificador;
	}

	//GET y SET
	public double getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(double calificacion) {
		this.calificacion = calificacion;
	}

	public int getIdentificador() {
		return identificador;
	}

	//To String
	@Override
	public String toString() {
		return "Asignaturas [identificador=" + identificador + ", calificacion=" + calificacion + "]";
	}
		
}
