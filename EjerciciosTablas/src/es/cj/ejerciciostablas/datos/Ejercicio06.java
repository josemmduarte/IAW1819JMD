package es.cj.ejerciciostablas.datos;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio06 {
	//6. Crear una tabla de n elementos. Pedir al usuario un valor entre 0 y n-1. 
	//Eliminar el valor de esa posición y desplazar todos los elementos para no dejar el hueco vacío

	private static Scanner sc = new Scanner(System.in);
	static int num;
	
	private static int [] numeros;
	
	public static void main(String[] args) {
	
		int tamanyo;
		
		do {
			System.out.println("Nº de elementos:");
			tamanyo = sc.nextInt();
		} while (tamanyo <=0);
		
		numeros = new int [tamanyo];
		
		iniciar();
		mostrar();
		pedirNum(tamanyo);
		eliminar();
		desplazar();
		mostrar();
		
		sc.close();
	}
	
	private static void desplazar() {
		for (int i = num; i < numeros.length-1; i++) {
			
		}
	}

	private static void eliminar() {
		numeros[num]=0;
	}

	private static void pedirNum(int var) {
		var -= 1;
		System.out.println("Elija un numero entre 0 y "+ var);
		num = sc.nextInt();
	}

	private static void mostrar() {
		System.out.println(Arrays.toString(numeros));
	}

	private static void iniciar() {
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = new Random().nextInt(50) + 1;
		}
	}
}
