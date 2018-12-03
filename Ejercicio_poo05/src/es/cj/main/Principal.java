package es.cj.main;

import java.util.Random;
import java.util.Scanner;

import es.cj.clases.Password;

// Ahora, crea una clase clase ejecutable:
public class Principal {

	public static Scanner sc = new Scanner(System.in);
	private static Password p [];
			
	// Indica también por teclado la longitud de los Passwords (antes de bucle).
	// Crea otro array de booleanos donde se almacene si el password del array de Password es o no fuerte (usa el bucle anterior).
	// Al final, muestra la contraseña y si es o no fuerte (usa el bucle anterior). Usa este simple formato:

	public static void main(String[] args) {
		
		System.out.println("Nº de Passwords: ");
		int numpass = sc.nextInt();
	
		// Crea un array de Passwords con el tamaño que tu le indiques por teclado.
		 p = new Password[numpass];
		
		// Crea un bucle que cree un objeto para cada posición del array.
		posicion();
		
		mostrarPasswords();
		comprobarFuerte();
		
	}

	private static void posicion() {
		for (int i = 0; i < p.length; i++) {
			p[i] = new Password(new Random().nextInt(15) + 8);
		}
	}
}
