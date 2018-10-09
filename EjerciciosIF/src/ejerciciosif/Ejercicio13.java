package ejerciciosif;

import java.util.Scanner;

public class Ejercicio13 {
	
private static Scanner sc = new Scanner(System.in);
	
	//13. Construir un programa que calcule el �ndice de masa corporal de una persona 
	//(IMC = peso [kg] / altura2 [m]) e indique el estado en el que se encuentra esa 
	//persona en funci�n del valor de IMC: 
		//Valor de IMC Diagn�stico < 16 Criterio de ingreso en hospital 
		//de 16 a 17 infrapeso 
		//de 17 a 18 bajo peso 
		//de 18 a 25 peso normal (saludable) 
		//de 25 a 30 sobrepeso (obesidad de grado I) 
		//de 30 a 35 sobrepeso cr�nico (obesidad de grado II) 
		//de 35 a 40 obesidad prem�rbida (obesidad de grado III) 
		//>40 obesidad m�rbida (obesidad de grado IV) 
			//Nota 1: se recomienda el empleo de sentencias if�else anidadas. 
			//Nota 2: Los operandos (peso y altura) deben ser introducidos por teclado por el usuario.

	public static void main(String[] args) {
	
		System.out.print("Peso: ");
        float peso=sc.nextFloat();
        
        System.out.print("Altura: ");
        float altura=sc.nextFloat();
        
        float icm = peso / (altura*2);
        	
        if (icm < 16)
        	System.out.println("Criterio de ingreso en hospital");
        else if (icm >= 16 && icm <= 17)
        	System.out.println("infrapeso");
        else if (icm > 17 && icm <= 18)
        	System.out.println("bajo peso");
        else if (icm > 18 && icm <= 25)
        	System.out.println("peso normal (saludable)");
        else if (icm > 25 && icm <= 30)
        	System.out.println("sobrepeso (obesidad de grado I)");
        else if (icm > 30 && icm <= 35)
        	System.out.println("sobrepeso cr�nico (obesidad de grado II)");
        else if (icm > 35 && icm <= 40)
        	System.out.println("obesidad prem�rbida (obesidad de grado III)");
        else if (icm > 40)
        	System.out.println("obesidad m�rbida (obesidad de grado IV)");
	}
}