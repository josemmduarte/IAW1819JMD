package es.cj.cadenas;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio05 {
	// Dada una cadena y un c�digo entero aleatorio. Generar una cadena cifrada donde cada car�cter 
	// se sustituye por el car�cter situado n posiciones despu�s del mismo. Debe empezar por la 
	// letra A si la suma del car�cter con el codigo es mayor que Z.

	public static void main(String[] args) {
	
		String cadena = "abcxyz";
		int codigo = new Random().nextInt(8)+1;
		
		char tabla [] = cadena.toCharArray();
		System.out.println(Arrays.toString(tabla));
		
		for (int i = 0; i < tabla.length; i++) {
			
		}
		
	}

}
