package es.cj.ejerciciostablas.datos;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio02 {

	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		//2. Leer n números ordenados crecientemente. Pedir al usuario un número y 
		// buscarlo en la tabla. Se debe mostrar la posición en la que se encuentra. 
		// Si no está, indicarlo con un mensaje

		System.out.println("¿Cuantos numeros vas a guardar?");
		int numeros = sc.nextInt();
		
		int tabla [] = new int [numeros];
		
		for (int i = 0; i < numeros; i++) {
			tabla[i] = new Random().nextInt(10);
		}
		
		Arrays.sort(tabla);
		System.out.println(Arrays.toString(tabla));
		
		System.out.println("Buscar numero: ");
		int num = sc.nextInt();
		int exit = 0;
		
		for (int i = 0; i < tabla.length && exit == 0; i++) {
			if (num == tabla[i]) {
				System.out.println("El numero "+num+" se encontro en la posicion "+i);
				exit++;
			}
			
		}
		
		if (exit == 0)
			System.out.println("El numero "+num+" no esta");
		
		sc.close();
	}
}