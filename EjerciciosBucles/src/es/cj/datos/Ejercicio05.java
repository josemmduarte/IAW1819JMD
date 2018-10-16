package es.cj.datos;

import java.util.Scanner;

public class Ejercicio05 {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		// 5.Pedir un número y calcular su factorial
		
		System.out.println("Nº: ");
		int num = sc.nextInt();
		int factorial = 1;
		
		for (int i=1; i<=num; i++) {
			factorial *= i;
		}
		
		System.out.println("Factorial ");
		
		sc.close();
	}
}
