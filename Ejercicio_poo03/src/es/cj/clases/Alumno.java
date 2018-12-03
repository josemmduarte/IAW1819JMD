package es.cj.clases;

public class Alumno {
	
	//Attributes
	private Asignaturas a1;
	private Asignaturas a2;
	private Asignaturas a3;
	
	//Constructor
	public Alumno(Asignaturas a1, Asignaturas a2, Asignaturas a3) {
		super();
		this.a1 = a1;
		this.a2 = a2;
		this.a3 = a3;
	}
	
	public Alumno(int id1, int id2, int id3) {
		// el constructor da valor a a1, a2, y a3
		this.a1 = new Asignaturas(id1);
		this.a2 = new Asignaturas(id2);
		this.a3 = new Asignaturas(id3);
	}

	// GET and SET
	public Asignaturas getA1() {
		return a1;
	}

	public Asignaturas getA2() {
		return a2;
	}

	public Asignaturas getA3() {
		return a3;
	}

	// To String
	@Override
	public String toString() {
		return "Alumno [a1=" + a1 + ", a2=" + a2 + ", a3=" + a3 + "]";
	}
	
}
