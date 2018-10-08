package ejerciciosif;

import java.util.Scanner;

public class Ejercicio01 {

	private static Scanner sc = new Scanner(System.in);
	
	//1. Pedir dos números y decir si son iguales o no
	
	public static void main(String[] args) {
	
		System.out.println("Primer Numero:");
		int n1 = sc.nextInt();
		
		System.out.println("Segundo Numero:");
		int n2 = sc.nextInt();
		
		if (n1 == n2) 
			System.out.println(n1 + " y " + n2 + " son iguales");
		else 
			System.out.println(n1 + " y " + n2 + " no son iguales");
	}
	
}
