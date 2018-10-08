package ejerciciosif;

import java.util.Scanner;

public class Ejercicio10 {
	
private static Scanner sc = new Scanner(System.in);
	
	//10. Pedir el día, mes y año y mostrar la fecha del día siguiente. 
	//Con meses de 28, 30 y 31 días. Sin años bisiestos.
	
	public static void main(String[] args) {
	
		System.out.println("Dia:");
		int dia = sc.nextInt();	
		System.out.println("Mes:");
		int mes = sc.nextInt();
		System.out.println("Año:");
		int anyo = sc.nextInt();
		
		if (mes >= 1 && mes <= 12) {
			switch (mes) {
			case 2:
				if (dia >= 1 && dia <= 28)
					dia = dia + 1; 
				if (dia > 28) {
					dia=1;
					mes = mes+1;
				}
				if (mes >12) {
					mes=1;
					anyo = anyo+1;
				}
				break;
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				if (dia >= 1 && dia <= 31)
					dia = dia + 1; 
				if (dia > 31) {
					dia=1;
					mes = mes+1;
				}
				if (mes >12) {
					mes=1;
					anyo = anyo+1;
				}
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				if (dia >= 1 && dia <= 30)
					dia = dia + 1; 
				if (dia > 30) {
					dia=1;
					mes = mes+1;
				}
				if (mes >12) {
					mes=1;
					anyo = anyo+1;
				}
				break;
			default:
				break;
			}
		
		System.out.println(dia+"-"+mes+"-"+anyo);
			
		}
	}
}