package ejerciciosif;

import java.util.Scanner;

public class Ejercicio07 {
	
private static Scanner sc = new Scanner(System.in);
	
	//7. Introduzca una nota de 0 a 10 y mostrarla de la forma: insuficiente, suficiente, bien...
	
	public static void main(String[] args) {
	
		System.out.println("Nota:");
		double nota = sc.nextDouble();
		
		if ( nota >=0 && nota <5 )
			System.out.println("Insuficiente");
		else if ( nota >=5 && nota <6 )
			System.out.println("Suficiente");
		else if ( nota >=6 && nota <8 )
			System.out.println("Bien");
		else if ( nota >=8 && nota <10 )
			System.out.println("Notable");
		else if ( nota ==10 )
			System.out.println("Sobresaliente");
	}
}
