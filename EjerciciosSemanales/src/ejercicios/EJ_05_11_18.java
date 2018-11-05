package ejercicios;

import java.util.Arrays;
import java.util.Random;

public class EJ_05_11_18 {

	// Rellena una tabla de 10 números (valores aleatorios del 1 al 6). Reliza una
	// función que devuelva el número que más se repite.
	
	private static int [] tabla;
	private static int [] orden;

	public static void main(String[] args) {
		
		tabla = new int [10];
		orden = new int [tabla.length];
		
		llenarTabla();
		repetido();
		System.out.println(Arrays.toString(tabla));
		System.out.println(Arrays.toString(orden));
		posicion();
	}
	
	private static void posicion() {
		int mayor =0 , posicion = 0;
		for (int i = 0; i < orden.length; i++) {
			if(orden[i] > mayor) {
				mayor = orden[i];
				posicion = i;
			}
		}
		System.out.println("El numero que mas se repite es: "+posicion);
	}

	private static void repetido() {
		for (int i = 0; i < tabla.length; i++) {
			orden[tabla[i]]++;
		}
	}
	
	private static void llenarTabla() {
		for (int i = 0; i < tabla.length; i++) {
			tabla[i] = new Random().nextInt(6) + 1;
		}
	}
}
