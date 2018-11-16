package datos;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio2 {
	
	// 2. Partimos de 2 tablas de n elementos cada uno (solicitada al usuario). 
	// Rellenarlas de manera aleatoria con números entre 1 y 20. Genere una nueva 
	// tabla con los elementos repetidos en las 2 tablas. Además, genere una nueva 
	// tabla con los elementos de la primera tabla que no se encuentran repetidos 
	// en la segunda tabla.
	
	private static int [] tabla1;
	private static int [] tabla2;
	private static int [] tablarep;
	private static int [] tablaNOrep;

	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		int tamanyo;
		
		do {
			System.out.println("Nº de elementos:");
			tamanyo = sc.nextInt();
		} while (tamanyo <=0);
		
		tabla1 = new int [tamanyo];
		tabla2 = new int [tamanyo];
		
		tablarep = new int [tamanyo];
		tablaNOrep = new int [tamanyo];
		
		iniciartablas();
		System.out.println(Arrays.toString(tabla1));
		System.out.println(Arrays.toString(tabla2));
		System.out.println("");
		repetidos();
				
	}

	private static void repetidos() {
		
		for (int i = 0; i < tabla1.length; i++) {
			int cont =0;
			
			for (int j = 0; j < tabla2.length; j++) {
				if (tabla1[i] == tabla2[j])
					cont = 1;
			}
			if (cont == 1)
				tablarep[i] = tabla1[i];
			else
				tablaNOrep[i] = tabla1[i];
		}
		
		for (int i = 0; i < tablarep.length; i++) {
			if (tablarep[i] > 0)
				System.out.println("El numero "+tablarep[i]+" esta repetido");
		}
		for (int i = 0; i < tablaNOrep.length; i++) {
			if (tablaNOrep[i] > 0)
				System.out.println("El numero "+tablaNOrep[i]+" NO esta repetido");
		}
	}

	private static void iniciartablas() {
		for (int i = 0; i < tabla1.length; i++) {
			tabla1[i] = new Random().nextInt(20) + 1;
			tabla2[i] = new Random().nextInt(20) + 1;
		}
	}
}
