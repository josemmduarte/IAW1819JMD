package ejerciciosif;

import java.util.Scanner;

public class Ejercicio09 {
	
private static Scanner sc = new Scanner(System.in);
	
	//9. Pedir día, mes y año y mostrar la fecha del día siguiente. 
	//Suponer que todos los meses son de 30 días
	
	public static void main(String[] args) {
	
		System.out.println("Dia:");
		int dia = sc.nextInt();	
		System.out.println("Mes:");
		int mes = sc.nextInt();
		System.out.println("Año:");
		int anyo = sc.nextInt();
		
		if (dia >=1 && dia <=30) {
			dia = dia+1;
			if (dia > 30) {
				dia = 1;
				mes = mes +1;
			}
		} else
			System.out.println("Dia incorrecto");
		
		if (mes >=1 && dia <=12) {
			if (mes > 12) {
				mes = 1;
				anyo = anyo+1;
			}
		} else
			System.out.println("Mes incorrecto");
		
		System.out.println(dia+"-"+mes+"-"+anyo);
		
	}
}