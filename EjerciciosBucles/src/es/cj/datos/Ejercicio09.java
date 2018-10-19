package es.cj.datos;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio09 {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		// Leer por teclado una serie de n números. La aplicación debe indicarnos si los 
		// números están ordenados de forma creciente, decreciente o si no están ordenados
		
			int cantidad =0;
			
			do {
				System.out.println("Cantidad de numeros: ");
				cantidad =sc.nextInt();
			} while (cantidad <= 0);
		
			// 1: creciente
			//-1: decreciente
			// 0: desordenado
			int orden = comprobarOrden(cantidad);
			
			switch (orden) {
			case 1:
				System.out.println("creciente");
				break;
			case -1:
				System.out.println("decreciente");
				break;
			default:
				System.out.println("desordenado");
				break;
			}
			
		sc.close();
	}

	private static int comprobarOrden(int cantidad) {
		
		int orden=0;
		
		boolean creciente = false, decreciente = false;
		int numero = 0, auxiliar = 0;
		
		for (int i = 0; i < cantidad; i++) {
			numero =new Random().nextInt(100);
			System.out.print(numero+" ");
			
			if (i == 0) {
				auxiliar = numero;
			}else {
				if ( numero > auxiliar)
					creciente = true;
				else if ( numero < auxiliar)
					decreciente = true;
				auxiliar = numero;
			}
		}
		
		if (creciente && !decreciente)
			orden =1;
		else if (!creciente && decreciente)
			orden =-1;
		
		return orden;
	}
	
}
