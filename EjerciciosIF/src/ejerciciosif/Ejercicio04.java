package ejerciciosif;

import java.util.Scanner;

public class Ejercicio04 {

	private static Scanner sc = new Scanner(System.in);
	
	//4. Pedir dos números e indicar cual es el mayor o si son iguales
	
	public static void main(String[] args) {
		
		System.out.println("Primer Numero:");
		int n1 = sc.nextInt();
		
		System.out.println("Segundo Numero:");
		int n2 = sc.nextInt();
		
		if ( n1 > n2 )
			System.out.println(n1 + " es mayor que " + n2);
		else if ( n2 > n1 )
			System.out.println(n2 + " es mayor que " + n1);
		else
			System.out.println(n1 +" y "+ n2 + " son iguales" );
		
	}
	
}