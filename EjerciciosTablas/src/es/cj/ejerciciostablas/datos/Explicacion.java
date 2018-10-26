package es.cj.ejerciciostablas.datos;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Explicacion {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
	
		//Declarar tabla
		
		/* int tabla [][] = new int [10][6];
		
		tabla[2][1] = 3;
		
		int tabla2 [] = {1,2,3};
		System.out.println(tabla2.length);
		
		int tabla3 [][] = {{1,2,3},{4,5},{6,7,8,9}};
		for (int i = 0; i < tabla3.length; i++) {
			System.out.println();
			for (int j = 0; j < tabla3[i].length; j++) {
				System.out.print(tabla3[i][j]+" ");
			}
		}
		
		System.out.println();
		
		for (int i = 0; i < tabla2.length; i++) {
			tabla2[i]= tabla2[i] * tabla2[i];
		}
		
		for (int i = 0; i < tabla2.length; i++) {
			System.out.print(tabla2[i]+" ");
		}

		String cadena [] = {"Hola", "que", "tal"};
		for (int i = 0; i < cadena.length; i++) {
			System.out.print(cadena[i]+" ");
		}
		
		System.out.println();
		
		////////////////////////////////////////////////
		
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				tabla[i][j] = new Random().nextInt(10);
			}
		}
		
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				System.out.print(tabla[i][j]+" ");
			}
			System.out.println();
		}
		
		*/
		
		int numeros [] = new int [10];
		for (int i = 0; i < numeros.length; i++) {
			numeros[i]= new Random().nextInt(10);
		}
		
		System.out.println(Arrays.toString(numeros));
		
		Arrays.sort(numeros);
		
		System.out.println(Arrays.toString(numeros));
		
		System.out.println("El 6 se encuentra en la posicion: "+ Arrays.binarySearch(numeros, 6));
		
		Arrays.fill(numeros, 99);
		
		System.out.println(Arrays.toString(numeros));
		
		////////
		
		int auxiliar [] = Arrays.copyOfRange(numeros,0,5);
		System.out.println(Arrays.toString(auxiliar));
		
		///////
		
		buscarPosiciones(numeros, 6);
		
		sc.close();
	}
	/*
	private static String buscarPosiciones(int[] numeros, int valor) {
		String posiciones="";
		
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[1]==valor)
				posiciones +=i+" ";
			
		} 
	}
	*/
}








