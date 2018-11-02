package ejercicios;

import java.util.Scanner;

public class Ej3 {
	
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		//3. Escriba un programa que lea un número entero por el teclado y muestre en la 
		//pantalla si es un número abundante. Un número es abundante si la suma de sus 
		//divisores es mayor que él. Ejemplo: 12 es abundante ya que sus divisores son 
		//1, 2, 3, 4 y 6 cuya suma es 16 que es mayor que 12.
		
		System.out.println("Numero: ");
		int num = sc.nextInt();
		
		int sumaNum = abundante(num);
		
		if (sumaNum > num)
			System.out.println("El numero "+num+" es abundante, y la suma total es "+sumaNum);
		else
			System.out.println("El numero "+num+" no es abundante y la suma total es "+sumaNum);
		
		sc.close();
	}

	private static int abundante(int num) {
		
		int sumaNum = 0;
		
		for (int i=1; i < num; i++){
			if (num%i == 0)
				sumaNum += i;
		}
		
		return sumaNum;
	}
}
