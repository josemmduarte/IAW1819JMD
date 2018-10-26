package ejercicios;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class EJ4_26_10_18 {

	//4. Rellena una tabla de 20 números positivos de manera aleatoria. 
	// Pida números al usuario (0 para finalizar el bucle) y muestra cuántas 
	// veces se repite el número en la tabla y cuál es la primera posición en 
	// la que aparece (-1 si no se encuentra en la tabla)

	private static Scanner sc = new Scanner(System.in);
	private static int [] numeros = new int [20];
	static int num=0;

	public static void main(String[] args) {
		
		iniciar();
		pedirnumero();
		if (num!=0) {
		repite(num);
		posicion(num);
		}
		
		sc.close();
	}

	private static void posicion(int var) {
		int exit =0;
		int posicion = 0;
		for (int i = 0; i < numeros.length && exit==0; i++) {
			if(numeros[i]==num) {
				posicion=i;
				exit++;
			}
		}
		System.out.println("El numero "+num+" en la posicion "+posicion);
	}

	private static void repite(int var) {
		int cont=0;
		for (int i = 0; i < numeros.length; i++) {
			if(numeros[i]==num) {
				cont++;
			}
		}
		System.out.println("Aparece "+cont+" veces");
	}

	private static void pedirnumero() {
		System.out.println("Numero: ");
		num = sc.nextInt();
	}

	private static void iniciar() {
		for (int i = 0; i < 20; i++) {
			numeros[i] = new Random().nextInt(50);
		}
		System.out.println(Arrays.toString(numeros));
	}
}
