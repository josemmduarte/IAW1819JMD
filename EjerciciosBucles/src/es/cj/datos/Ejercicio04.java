package es.cj.datos;

import java.util.Scanner;

public class Ejercicio04 {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		// 4. Escribir un programa que lea un número desde el teclado y realice la suma
		// de los 100 números siguientes, mostrando el resultado en pantalla.

		System.out.println("Nº: ");
		int num = sc.nextInt();
		int suma = 0;

		for (int i = num + 100; i != num; i--) {
			suma += i;
		}

		System.out.println("La suma de los siguientes 100 numeros de " + num + " es " + suma);

		sc.close();
	}

}
