package es.cj.datos;

import java.util.Scanner;

public class Ejercicio07 {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		// 7.Pida un número al usuario e indique cuántos números primos hay entre 1 y el número
		
		System.out.println("Numero: ");
		int numero = 0;
		int cont = 0;
		
		do {
			System.out.println("Nº: ");
			numero = sc.nextInt();
		}while (numero < 1);
		
		int contadordeprimos = 0;
		for (int i =2; i < numero; i++) {
			if (esprimo(i))
				contadordeprimos++;
		}
		
		System.out.println("Primos entre 1 y " + numero + ": "+contadordeprimos);
		
		sc.close();
	}

	private static boolean esprimo(int num) {
		boolean primo = true;
		
		for (int j = 2; j < num && primo; j++) {
			if (num%j == 0)
				primo = false;
		}
		
		return false;
	}
}
