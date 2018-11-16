package datos;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio3 {

	// 3. Rellena una tabla de 15 números. Muestra la tabla. Muestra el mayor, 
	// el menor y las posiciones en las que se encuentran.
	
	private static int [] tabla;
	
	public static void main(String[] args) {
	
		tabla = new int [15];
		
		iniciartabla();
		
		System.out.println(Arrays.toString(tabla));
		System.out.println("");
		
		max();
		min();
		
	}

	private static void max() {
		int cont = 0;
		int maximo = 0;
		int posicion = 0;
		
		for (int i = 0; i < tabla.length; i++) {
			if (tabla[i] > cont) {
				maximo = tabla [i];
				cont = tabla [i];
				posicion = i;
			}
		}
		
		System.out.println("El mayor es el "+maximo+" y se encuentra en la posicion "+posicion);
	}

	private static void min() {
		int cont = 21;
		int minimo = 0;
		int posicion = 0;
		
		for (int i = 0; i < tabla.length; i++) {
			if (tabla[i] < cont) {
				minimo = tabla [i];
				cont = tabla [i];
				posicion = i;
			}
		}
		
		System.out.println("El menor es el "+minimo+" y se encuentra en la posicion "+posicion);
	}

	private static void iniciartabla() {
		for (int i = 0; i < tabla.length; i++) {
			tabla[i] = new Random().nextInt(20) + 1;
		}
	}
}
