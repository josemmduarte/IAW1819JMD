package es.cj.datos;

import java.util.Scanner;

public class Ejercicio02 {

	// 2. Pedir 5 numeros mostrar la media de los positivos, media negativos y cantidad de 0
	
private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		double sumaPos = 0, sumaNeg = 0;
		int contPos = 0, contNeg = 0, cont0 = 0;
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Nº:");
			double numero = sc.nextDouble();
			
			if (numero > 0) {
				//sumaPos = sumaPos + numero
				sumaPos += numero;
				contPos++;
			} else if (numero < 0) {
				sumaNeg += numero;
				contNeg++;
			} else
				cont0++;
		}
		
		System.out.println("Media Positivos: " + (sumaPos/contPos));
		System.out.println("Media Negativos: " + (sumaNeg/contNeg));
		System.out.println("Contador ceros: " + cont0);
	
		sc.close();
	}
}