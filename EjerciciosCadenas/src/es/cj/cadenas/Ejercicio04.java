package es.cj.cadenas;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio04 {
	
	// Escriba un método que, dada una cadena de caracteres, de la suma de todos los dígitos que hay en ella. 
	// Por ejemplo, si la cadena es abc12de3f4, dará como resultado 10.

	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String cadena = "a64c2yfg8";
		
		char letras [] = cadena.toCharArray();
		System.out.println(Arrays.toString(letras));
		
		for (int i = 0; i < letras.length; i++) {
			if (letras[0] >=0 && letras[0] <=9) {
			}
		}
	}	
}
