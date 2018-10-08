package ejerciciosif;

import java.util.Scanner;

public class Ejercicio03 {

	private static Scanner sc = new Scanner(System.in);
	
	//3. Pedir dos números y decir si uno es múltiplo del otro
	
	public static void main(String[] args) {
		
		System.out.println("Primer Numero:");
		int n1 = sc.nextInt();
		
		System.out.println("Segundo Numero:");
		int n2 = sc.nextInt();
		
		if ( (n1 % n2) == 0 )
			System.out.println(n1 + " es multiplo de " + n2);
		else if ( (n2 % n1) == 0 )
			System.out.println(n2 + " es multiplo de " + n1);
		else
			System.out.println(n1 +" y "+ n2 + " no son multiplos entre ellos" );
		
	}
	
}