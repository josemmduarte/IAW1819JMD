package es.cj.datos;

import java.util.Scanner;

public class Ejercicio03 {
	
private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		// 3. Programa que muestre y calcule el producto de los n primeros números impares
		
		System.out.println("Numero: ");
		int numero = sc.nextInt();
		double prodImp =1;
		
		for (int i = 1 ; i <= numero; i++) {
			
			if (i%2 != 0) {
				prodImp *= i;
			}
		}
		
		System.out.println(prodImp);
	
		sc.close();
	}
}
