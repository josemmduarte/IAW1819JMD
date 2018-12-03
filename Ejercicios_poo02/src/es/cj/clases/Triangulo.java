package es.cj.clases;

public class Triangulo {
	
	private Puntos p1;
	private Puntos p2;
	private Puntos p3;
	
	
	// Constructors
	public Triangulo() {
		super();
	}

	public Triangulo(Puntos p1, Puntos p2, Puntos p3) {
		super();
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
	}

	public Triangulo(double x1, double y1, double x2, double y2, double x3, double y3) {
		this.p1 = new Puntos(x1, y1);
		this.p1 = new Puntos(x2, y2);
		this.p1 = new Puntos(x3, y3);
	}

	// GET SET
	public Puntos getP1() {
		return p1;
	}

	public void setP1(Puntos p1) {
		this.p1 = p1;
	}

	public Puntos getP2() {
		return p2;
	}

	public void setP2(Puntos p2) {
		this.p2 = p2;
	}

	public Puntos getP3() {
		return p3;
	}

	public void setP3(Puntos p3) {
		this.p3 = p3;
	}
	
	// Metodos
	public double calculararea() {
		double base = p1.calculardistanciadesde(p2);
		double altura = p2.calculardistanciadesde(p3);
		return (base * altura) / 2;
	}
	
	public double calcularperimetro() {
		return p1.calculardistanciadesde(p2) + p2.calculardistanciadesde(p3) + p3.calculardistanciadesde(p1);
	}
	
}
