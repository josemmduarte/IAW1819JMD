package es.cj.cadenas;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio04 {
	
	// Escriba un método que, dada una cadena de caracteres, de la suma de todos los dígitos que hay en ella. 
	// Por ejemplo, si la cadena es abc12de3f4, dará como resultado 10.

	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String cadena = "a64c2yfg8";
		int suma = 0;
		
		char tabla [] = cadena.toCharArray();
		System.out.println(Arrays.toString(tabla));
		
		for (int i = 0; i < tabla.length; i++) {
			if (tabla[i] >=48 && tabla[i] <=59) {
				String prueba = String.valueOf(tabla[i]);
				suma += Integer.parseInt(prueba);
			}
		}
		System.out.println(suma);
	}	
}
