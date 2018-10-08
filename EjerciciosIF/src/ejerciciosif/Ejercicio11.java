package ejerciciosif;

import java.util.Scanner;

public class Ejercicio11 {
	
private static Scanner sc = new Scanner(System.in);
	
	//11. Pedir una hora de la forma hora, minutos y segundos, 
	//y mostrar la hora en el segundo siguiente.
	
	public static void main(String[] args) {
	
		System.out.println("Hora:");
		int hora = sc.nextInt();	
		System.out.println("Minuto:");
		int min = sc.nextInt();
		System.out.println("Segundo:");
		int seg = sc.nextInt();
		
		if (seg >=0 && seg <=59) {
			seg = seg+1;
			if (seg > 59) {
				seg = 0;
				min = min +1;
			}
		} else
			System.out.println("Segundos incorrectos");
		
		if (min >=0 && min <=60) {
			if (min > 59) {
				min = 0;
				hora = hora+1;
			}
		} else
			System.out.println("Minutos incorrectos");
		
		if (hora >=0 && hora <=23){
			if (hora > 23) {
				hora = 0;
			}
		} else
			System.out.println("Hora incorrectos");
			
		
		System.out.println(hora+":"+min+":"+seg);
			
	}
}