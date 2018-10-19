package es.cj.datos;

import java.util.Scanner;

public class Ejercicio10 {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		// 10. Dados dos números introducidos por teclado, indique si son amigos o no. 
		// Dos números son amigos si la suma de los divisores propios de uno de ellos 
		// es igual al otro (la unidad se considera divisor propio, pero no lo es el 
		// mismo número)
		// 220 y 284
		// 284 = 1 + 2 + 4 + 71 + 142 = 220
		// 220 = 1 + 2 + 4 + 5 + 10 + 11 + 20 + 22 + 44 + 55 + 110 = 284

		System.out.println("Numero 1:");
		int n1 = sc.nextInt();
		System.out.println("Numero 2:");
		int n2 = sc.nextInt();
		
		int sumaN1 = 0;
		int sumaN2 = 0;
		
		for (int i=1; i < n1; i++){
			if (n1%i == 0)
				sumaN1 += i;
		}
		
		for (int i=1; i < n1; i++){
			if (n2%i == 0)
				sumaN2 += i;
		}
		
		if (sumaN1==n2 && sumaN2==n1)
			System.out.println(n1+" y "+n2+" son amigos");
		
		
		sc.close();
	}
}
