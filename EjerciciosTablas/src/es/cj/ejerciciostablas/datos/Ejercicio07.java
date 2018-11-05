package es.cj.ejerciciostablas.datos;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio07 {
	
	// Se pretende desarrollar una aplicación que nos ayude a gestionar las notas de un centro educativo. 
	// Cada clase está compuesta por 10 alumnos. Se pide leer las notas del primer, segundo y tercer 
	// trimestre almacenándolas en una tabla. Debemos mostrar la nota media final de cada alumno y de cada 
	// clase en cada trimestre. Por último, desarrolle un método que se le pase un número de alumno y 
	// devuelve la media final de ese alumno


	private static Scanner sc = new Scanner(System.in);
	
	// Notas
	private static int [][] tabla;
	// Media Trimestre
	private static double [] mediasT;
	// Media Alumno
	private static double [] mediasA;
	
	public static void main(String[] args) {
		
		int alumnos = 0;
		do {
			System.out.println("Nº Alumno: ");
			alumnos = sc.nextInt();
		}while (alumnos <=0);
		
		int trimestres = 0;
		do {
			System.out.println("Nº Trimestres: ");
			trimestres = sc.nextInt();
		}while (trimestres <=0);
		
		// Notas
		tabla = new int [alumnos][trimestres];
		// Media Trimestre
		mediasT = new double [trimestres];
		// Media Alumno
		mediasA = new double [alumnos];
		
		iniciar();
		mostrarNotas();
		medias();
		mostrarMedias();
		
		sc.close();
	}

	private static void mostrarMedias() {
		System.out.println("--MEDIAS--");
		System.out.println(Arrays.toString(mediasA));
		System.out.println(Arrays.toString(mediasT));
	}

	private static void mostrarNotas() {
		System.out.println("--NOTAS--");
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				System.out.print(tabla[i][j] + " ");
			}
			System.out.println();
		}
	}

	private static void medias() {
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				mediasT[j] += tabla[i][j];
				mediasA[i] += tabla[i][j];
			}
			mediasA[i]/=mediasT.length;
		}
		calcularMediasTrimestre();
	}

	private static void calcularMediasTrimestre() {
		for (int i = 0; i < mediasT.length; i++) {
			mediasT[i] /= mediasA.length;
		}	
	}

	private static void iniciar() {
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				tabla[i][j] = new Random().nextInt(10)+1;
			}
		}
	}
	
}
