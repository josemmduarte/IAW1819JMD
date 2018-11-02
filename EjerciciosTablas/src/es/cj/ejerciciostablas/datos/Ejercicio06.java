package es.cj.ejerciciostablas.datos;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio06 {
	//6. Crear una tabla de n elementos. Pedir al usuario un valor entre 0 y n-1. 
	//Eliminar el valor de esa posición y desplazar todos los elementos para no dejar el hueco vacío

	private static Scanner sc = new Scanner(System.in);
	static int posicion;
	private static int [] tabla;
	
	public static void main(String[] args) {
	
		int tamanyo;
		
		do {
			System.out.println("Nº de elementos:");
			tamanyo = sc.nextInt();
		} while (tamanyo <=0);
		
		tabla = new int [tamanyo];
		
		iniciar();
		System.out.println(Arrays.toString(tabla));
		pedirNum(tamanyo);
		desplazar();
		System.out.println(Arrays.toString(tabla));
		
		sc.close();
	}
	
	private static void desplazar() {
		for (int i = posicion; i < tabla.length-1; i++) {
			tabla[i]=tabla[i+1];
		}
		tabla[tabla.length-1] = 0;
	}

	private static void pedirNum(int var) {
		var -= 1;
		System.out.println("Elija un numero entre 0 y "+ var);
		posicion = sc.nextInt();
	}

	private static void iniciar() {
		for (int i = 0; i < tabla.length; i++) {
			tabla[i] = new Random().nextInt(50) + 1;
		}
	}
}
