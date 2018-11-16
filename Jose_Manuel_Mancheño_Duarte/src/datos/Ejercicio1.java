package datos;

import java.util.Scanner;

public class Ejercicio1 {
	
	// 1. Programa que solicita tres n�meros y realiza las siguientes acciones:
	// - Muestra el valor central de los tres valores num�ricos
	// - Muestra si alguno de los valores es m�ltiplo de otro de los valores
	// - Debe mostrar un mensaje diciendo si el valor central est� m�s cerca del menor que del mayor. 
	//   Por ejemplo, si los tres valores fueran 1,15,200 deber�a decir que "El valor central 15 est� 
	//   m�s cerca del valor 1"

	private static int [] numeros;
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		numeros = new int [3];
		
		System.out.println("1� Numero:");
		numeros [0] = sc.nextInt();
		System.out.println("2� Numero:");
		numeros [1] = sc.nextInt();
		System.out.println("3� Numero:");
		numeros [2] = sc.nextInt();
		
		System.out.println("El valor central es el "+numeros[1]);
		multiplo();
		valorcercano();
		
	}

	private static void valorcercano() {
		int dif1 = 0;
		int dif2 = 0;
		
		if (numeros[0] > numeros[1]) {
			dif1 = numeros[0] - numeros[1];
		}
		else
			dif1 = numeros[1] - numeros[0];
		
		if (numeros[2] > numeros[1]) {
			dif2 = numeros[2] - numeros[1];
		}
		else
			dif2 = numeros[1] - numeros[2];
		
		if (dif1 < dif2) {
			System.out.println("El valor central " + numeros[1] + " est� m�s cerca del valor "+ numeros[0]);
		}
		else
			System.out.println("El valor central " + numeros[1] + " est� m�s cerca del valor "+ numeros[2]);
		
	}

	private static void multiplo() {
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros.length; j++) {
				if (numeros[i]%numeros[j]==0 && numeros[i] != numeros[j]) {
					System.out.println("El numero "+ numeros[i] +" es multiplo del numero "+numeros[j]);
				}
			}	
		}
	}
}
