package excepciones;

import java.util.Scanner;

public class Explicacion {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		int num = Leer.datoInt();
		
		try {
			int num1 = sc.nextInt();
			System.out.println(num1);
			
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
