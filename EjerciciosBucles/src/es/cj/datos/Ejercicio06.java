package es.cj.datos;

import java.util.Scanner;

public class Ejercicio06 {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		// 6. Diseñe una aplicación que muestre las tablas de multiplicar 
		// del 1 al 10. Además, solicite al usuario que tabla quiere mostrar
		
		for (int i=1 ; i<=10 ; i++ ) {
			for (int x=1 ; x<=10 ; x++ ) {
				int resul = i*x;
				System.out.println(i +"x"+ x +"="+ resul);
			}
			System.out.println("");
		}
		
		sc.close();
	}
	
}
