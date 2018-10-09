package ejercicios;

import java.util.Scanner;

public class Ej2 {
	
private static Scanner sc = new Scanner(System.in);
	
	//Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera: 
	//Si trabaja 40 horas o menos se le paga 16€ por hora 
	//Si trabaja más de 40 horas se le paga 16€ por cada una de las primeras 40 horas y 20€ por cada hora extra.


	public static void main(String[] args) {
	
		System.out.println("Horas trabajadas: ");
		int horas = sc.nextInt();
		
		int salario = 0;
	
		if(horas >=0 && horas <=40)
			salario = horas * 16;
		
		else if (horas > 40) {
			salario = 40 * 16;
			horas = horas-40;
			salario = salario + (horas * 20);
		}
		
		System.out.println("Cobra " + salario + "€");
		
	}
}

