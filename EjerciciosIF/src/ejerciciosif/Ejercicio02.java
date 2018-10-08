package ejerciciosif;

import java.util.Scanner;

public class Ejercicio02 {

	private static Scanner sc = new Scanner(System.in);
	
	//2. Pedir un número e indicar si es positivo o negativo
	
	public static void main(String[] args) {
		
		System.out.println("Numero:");
		int n1 = sc.nextInt();
		
		if (n1 > 0)
			System.out.println(n1 + " es positivo");
		else
			System.out.println(n1 + " es negativo");
	}
	
}
