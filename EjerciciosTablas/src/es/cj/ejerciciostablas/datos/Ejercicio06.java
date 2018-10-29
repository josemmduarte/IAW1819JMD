package es.cj.ejerciciostablas.datos;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio06 {
	//6. Crear una tabla de n elementos. Pedir al usuario un valor entre 0 y n-1. 
	//Eliminar el valor de esa posición y desplazar todos los elementos para no dejar el hueco vacío

	private static Scanner sc = new Scanner(System.in);
	static int num;
	private static int [] numeros, numeros2;
	
	public static void main(String[] args) {
	
		int tamanyo;
		
		do {
			System.out.println("Nº de elementos:");
			tamanyo = sc.nextInt();
		} while (tamanyo <=0);
		
		numeros = new int [tamanyo];
		numeros2 = new int [tamanyo-1];
		
		iniciar();
		System.out.println(Arrays.toString(numeros));
		pedirNum(tamanyo);
		desplazar();
		System.out.println(Arrays.toString(numeros2));
		
		sc.close();
	}
	
	private static void desplazar() {
		for (int i = 0; i < num; i++) {
			numeros2[i]=numeros[i];
		}
		for (int j = num; j < numeros.length-1; j++) {
			numeros2[j]=numeros[j+1];
		}
	}

	private static void pedirNum(int var) {
		var -= 1;
		System.out.println("Elija un numero entre 0 y "+ var);
		num = sc.nextInt();
	}

	private static void iniciar() {
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = new Random().nextInt(50) + 1;
		}
	}
}
