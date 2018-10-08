package ejerciciosif;

import java.util.Scanner;

public class Ejercicio05 {

	private static Scanner sc = new Scanner(System.in);
	
	//5. Pedir dos números y mostrarlos ordenados de mayor a menor
	
	public static void main(String[] args) {
	
		System.out.println("Primer Numero:");
		int n1 = sc.nextInt();
		
		System.out.println("Segundo Numero:");
		int n2 = sc.nextInt();
		
		if ( n1 > n2 )
			System.out.println(n1 + " > " + n2);
		else
			System.out.println(n2 + " > " + n1);
		
	}
	
}