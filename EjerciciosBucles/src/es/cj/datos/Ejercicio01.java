package es.cj.datos;

import java.util.Scanner;

public class Ejercicio01 {

	// 2. Pedir 5 numeros mostrar la media de los positivos, media negativos y cantidad de 0
	
private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Numero: ");
		int numero = sc.nextInt();
		
		for (int i = numero; i >= 0; i--) {
			System.out.println(i);
		}
	
		sc.close();
	}
}
