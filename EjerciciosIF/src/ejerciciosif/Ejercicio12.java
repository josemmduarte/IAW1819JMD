package ejerciciosif;

import java.util.Scanner;

public class Ejercicio12 {
	
private static Scanner sc = new Scanner(System.in);
	
	//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	//12. Pedir dos fechas y mostrar el número de días que hay de diferencia. 
	//Suponiendo todos los meses de 30 días.
	
	public static void main(String[] args) {	
		
        System.out.println ("Fecha 1:");
        System.out.print("Introduzca día: ");
        int dia1=sc.nextInt();
        System.out.print("Introduzca mes: ");
        int mes1=sc.nextInt();
        System.out.print("Introduzca año: ");
        int anyo1=sc.nextInt();
        
        System.out.println ("Fecha 2:");
        System.out.print("Introduzca día: ");
        int dia2=sc.nextInt();
        System.out.print("Introduzca mes: ");
        int mes2=sc.nextInt();
        System.out.print("Introduzca año: ");
        int anyo2=sc.nextInt();
        
        int total_dias = dia2-dia1 + 30*(mes2-mes1)+365*(anyo2-anyo1);
        
        if (total_dias <0)
        	total_dias = total_dias * -1;
        
        System.out.println ("Días de diferencia: " + total_dias);
    }
}
