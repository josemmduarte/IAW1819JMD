package es.cj.main;

import es.cj.clases.Circulo;
import es.cj.clases.Puntos;

public class Principal {
	
	public static void main(String[] args) {
		Puntos p1 = new Puntos(2, 3);
		Puntos p2 = new Puntos(4, 5);
		
		double distancia = p1.calculardistanciadesde(p2);
		
		System.out.println("Distancia: "+ distancia);
		
		Circulo c = new Circulo(10, 30, 40);
		System.out.println("Area: "+ c.calculararea());
		System.out.println("Perimetro: " + c.calcularperimetro());
		System.out.println("Distancia: " + c.calculardistanciadesde(p1));
	}

}
