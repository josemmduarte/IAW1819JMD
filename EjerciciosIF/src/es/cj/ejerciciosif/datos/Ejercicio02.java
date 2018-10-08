package es.cj.ejerciciosif.datos;

import java.util.Scanner;

public class Ejercicio02 {
	
	private static Scanner sc = new Scanner(System.in);
	
	// Pedir al usuario dia mes y año y comprobra que la fecha es correcta incluido bisiestos
	
	public static void main(String[] args) {

		System.out.println("Dia");
		int dia = sc.nextInt();
		System.out.println("Mes");
		int mes = sc.nextInt();
		System.out.println("Año");
		int anno = sc.nextInt();
		
		boolean fechaCorrecta = false;
		
		if (anno >= 0) {
			boolean esBisiesto = ((anno % 4 == 0 && anno % 100 != 0) || (anno % 400 == 0));
			if (mes >=1 && mes <=12) {
				switch (mes) {
				case 2:
					if (dia >=1 && dia <=29 && esBisiesto)
						fechaCorrecta = true;
					else if (dia >=1 && dia <=28 && !esBisiesto)
						fechaCorrecta = true;
					break;
						
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
					if (dia >=1 && dia <=31)
						fechaCorrecta = true;	
					break;
				case 4:
				case 6:
				case 9:
				case 11:
					if (dia >=1 && dia <=30)
						fechaCorrecta = true;	
					break;
				}
			}
		}
		
		if (fechaCorrecta)
			System.out.println("Fecha correcta: "+dia+"/"+mes+"/"+anno);
		else
			System.out.println("Fecha incorrecta: "+dia+"/"+mes+"/"+anno);
		
		sc.close();
	}
}


