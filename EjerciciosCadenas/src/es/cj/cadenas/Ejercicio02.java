package es.cj.cadenas;

import java.util.Scanner;

public class Ejercicio02 {
	// Realizar un programa que reciba dos cadenas de caracteres y cuente el número de apariciones de la primera en la segunda
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String cad1 = "hola";	
		String cad2 = "hola adios hola hola adios";
		
		String palabras[] = cad2.split(" ");
		
		int contador = 0;
		for (int i = 0; i < palabras.length; i++) {
			if (palabras[i].equals(cad1))
				contador++;
		}
		
		System.out.println(contador);
	}
}
