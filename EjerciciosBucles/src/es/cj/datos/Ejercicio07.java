package es.cj.datos;

import java.util.Scanner;

public class Ejercicio07 {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		// 7.Pida un n�mero al usuario e indique cu�ntos n�meros primos hay entre 1 y el n�mero
		
		System.out.println("Numero: ");
		int numero = sc.nextInt();
		int cont =0;
		
		for (int i=1; i<=numero; i++) {
			for (int x=1; x<=numero; x++) {
				if (numero%x == 0 ) 
					if (x==2 || x==numero)
						cont++;
			}
		}
		
		System.out.println("Hay "+cont+" numeros primos");
		
		sc.close();
	}
	
}
