package ejerciciosif;

import java.util.Scanner;

public class Ejercicio12 {
	
private static Scanner sc = new Scanner(System.in);
	
	//12. Pedir dos fechas y mostrar el número de días que hay de diferencia. 
	//Suponiendo todos los meses de 30 días.
	
	public static void main(String[] args) {
	
		System.out.println("Fecha 1: Dia");
		int dia1 = sc.nextInt();	
		System.out.println("Fecha 1: Mes");
		int mes1 = sc.nextInt();
		System.out.println("Fecha 1: Año");
		int anyo1 = sc.nextInt();
		
		System.out.println("Fecha 2: Dia");
		int dia2 = sc.nextInt();	
		System.out.println("Fecha 2: Mes");
		int mes2 = sc.nextInt();
		System.out.println("Fecha 2: Año");
		int anyo2 = sc.nextInt();
		
		int difdia = 0;
		int difmes = 0;
		int difanyo = 0;
		int sumadias = 0;
		
		if (dia1 > dia2)
			difdia = dia1 - dia2;
		else if (dia2 > dia1)
			difdia = dia2 - dia1;
		////////////////////////////////////////
		if (mes1 > mes2) {
			difmes = (mes1 - mes2)*30;
			
		}
		else if (mes2 > mes1) {
			difmes = (mes2 - mes1)*30;
		}
		
		if (difmes != 0)
			sumadias = difmes - difdia;
		////////////////////////////////////////	
		if (anyo1 > anyo2)
			difanyo = (anyo1 - anyo2)*360;
		else if (anyo2 > anyo1)
			difanyo = (anyo2 - anyo1)*360;
		
		if (difanyo != 0)
			sumadias = difanyo - difdia;
		////////////////////////////////////////
		if (sumadias == 0)
			sumadias = difdia;
		
		System.out.println("Entre el "+dia1+"-"+mes1+"-"+anyo1+" y el "+dia2+"-"+mes2+"-"+anyo2+" hay "+sumadias+" dias");
	}
}