package es.cj.ejerciciostablas.datos;

import java.util.Scanner;

public class Ejercicio01 {

	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		// 1. Leer n números enteros, guardarlos en la tabla y mostrar la media de los positivos, 
		// media negativos y el número de ceros
		
		System.out.println("¿Cuantos numeros vas a guardar?");
		int numeros = sc.nextInt();
		
		int positivos = 0, negativos = 0;
		double mpos = 0, mneg =0;
		int ceros = 0;
		
		int tabla [] = new int [numeros];
		
		//
		for (int i = 0; i < numeros; i++) {
			System.out.println(i+1+"º Numero: ");
			tabla [i] = sc.nextInt();
			
			if (tabla[i] > 0) {
				positivos += tabla[i];
				mpos++;
			}
			else if (tabla[i] < 0) {
				negativos += tabla[i];
				mneg++;
			}
			else
				ceros++;
		}
		
		for (int i = 0; i < tabla.length; i++) {
			System.out.print(tabla[i]+" ");
		}
		
		mpos= positivos / mpos;
		mneg= negativos / mneg;
		
		System.out.println();
		System.out.println("Media positivos: "+mpos);
		System.out.println("Media negativos: "+mneg);
		System.out.println("Numero de ceros: "+ceros);
				
		sc.close();
	}
}
