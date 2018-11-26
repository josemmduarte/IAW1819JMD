package es.cj.clases;

public class Circulo {
	
	//
	private double radio;
	private Puntos centro;
	
	//
	private void Circolo() {

	}

	public Circulo(double radio, Puntos centro) {
		super();
		this.radio = radio;
		this.centro = centro;
	}
	
	public Circulo(double radio, double x, double y) {
		this.centro = new Puntos(x, y);
		this.radio = radio;
	}

	//
	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	public Puntos getCentro() {
		return centro;
	}

	public void setCentro(Puntos centro) {
		this.centro = centro;
	}
	
	//
	public double calculardistanciadesde(Puntos p) {
		return this.centro.calculardistanciadesde(p);
	}
	
}
