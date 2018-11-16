package datos;

import java.util.Scanner;

public class Ejercicio4 {

	// 4. Realizar un programa que lea una cadena de caracteres. Compruebe 
	// si la cadena está bien formada: para ello debe comenzar por un número, 
	// debe terminar en una letra, debe tener como mínimo 5 caracteres y alguno 
	// de ellos tiene que ser la "z". Realice un método que devuelva un booleano 
	// indicando si la palabra es correcta.
	
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
	
		System.out.println("Cadena: ");
		String cadena = sc.next();
		char letras [] = cadena.toCharArray();
		
		if (Character.isDigit(letras[0]) && Character.isAlphabetic(letras[letras.length-1]) && letras.length >= 5 && cadena.contains("z"))
			System.out.println("Palabra Correcta");
		else
			System.out.println("Palabra Incorrecta");		
	}
}
