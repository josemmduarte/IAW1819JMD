package ejerciciosif;

import java.util.Scanner;

public class Ejercicio06 {

private static Scanner sc = new Scanner(System.in);
	
	//6. Pedir tres n�meros y mostrarlos ordenados de mayor a menor
	
	public static void main(String[] args) {
		
		System.out.println("Primer Numero:");
		int num1 = sc.nextInt();
		
		System.out.println("Segundo Numero:");
		int num2 = sc.nextInt();
		
		System.out.println("Tercer Numero:");
		int num3 = sc.nextInt();
		
		if (num1 < num2) {
			if (num2 < num3)
				System.out.println(num1 +" "+ num2 +" "+ num3);
			else
				System.out.println(num1 +" "+ num3 +" "+ num2);
		}
		else if (num2 < num3) {
			if (num3 < num1)
				System.out.println(num2 +" "+ num3 +" "+ num1);
			else
				System.out.println(num2 +" "+ num1 +" "+ num3);
		}
		else if (num3 < num1){
			if (num1 < num2)
				System.out.println(num3 +" "+ num1 +" "+ num2);
			else
				System.out.println(num3 +" "+ num2 +" "+ num1);
		}
		
	}
	
}
