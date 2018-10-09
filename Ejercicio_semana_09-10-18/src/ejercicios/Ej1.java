package ejercicios;

import java.util.Scanner;

public class Ej1 {
	
private static Scanner sc = new Scanner(System.in);
	
	//Se solicita leer un número entero positivo y determinar si es un número de 1,2,3 o 4 cifras.

	public static void main(String[] args) {
	
		System.out.println("Numero: ");
		int num = sc.nextInt();
			if(num >=1) {
				if (num >=1 && num <=9)
					System.out.println("Numero de una cifra");
				else if (num >=10 && num <=99)
					System.out.println("Numero de dos cifras");
				else if (num >=100 && num <=999)
					System.out.println("Numero de tres cifras");
				else if (num >=1000 && num <=9999)
					System.out.println("Numero de cuatro cifras");
				else
					System.out.println("Numero de mas de cuatro cifras");
			}
			else
				System.out.println("Numero negativo");
	}
}

