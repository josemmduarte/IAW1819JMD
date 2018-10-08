package ejerciciosif;

import java.util.Scanner;

public class Ejercicio08 {
	
private static Scanner sc = new Scanner(System.in);
	
	//8. Pida al usuario día, mes y año y compruebe que la fecha es correcta
	
	public static void main(String[] args) {
	
		System.out.println("Dia:");
		int dia = sc.nextInt();	
		System.out.println("Mes:");
		int mes = sc.nextInt();
		System.out.println("Año:");
		int anyo = sc.nextInt();
		
		if (dia >=1 && dia <=30 && mes >=1 && mes <=12)
			System.out.println("Fecha correcta");
		else
			System.out.println("Fecha Incorrecta");
	}
}