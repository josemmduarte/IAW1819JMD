package es.cj.ejerciciosif.datos;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class Ejercicio01 {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		// Pedir nota de 0 a 10 y mostrala como induficinete, suficinete, bien y
		// sobresaliente

		System.out.println("Nota");
		double nota = sc.nextDouble();

		if (nota >=0 && nota < 5)
			System.out.println("Insuficiente");
		else if (nota > 4 && nota < 7)
			System.out.println("Suficiente");
		else if (nota > 6 && nota < 9)
			System.out.println("Bien");
		else
			System.out.println("Sobresaliente");
	
	
	switch ((int)nota) {
	case 0:
	case 1:
	case 2:
	case 3:
	case 4:
		System.out.println("Insuficiente");
		break;
	case 5:
		System.out.println("Suficiente");
		break;
	case 6:
		System.out.println("Bien");
		break;
	case 7:
	case 8:
		System.out.println("Notable");
		break;
	case 9:
	case 10:
		System.out.println("Sobresaliente");
		break;
	default:
		break;
		}
	
	}

}
