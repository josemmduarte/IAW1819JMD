package es.cj.cadenas;

public class Explicacion {

	public static void main(String[] args) {
	
		String cadena1 = "hola";
		String cadena2 = "HOLA";
		
		// Comparacion
		if (cadena1.equals(cadena2))
			System.out.println("Iguales");
		else
			System.out.println("Distintas");
		
		// Comparacion ignorando mayus
		if (cadena1.equalsIgnoreCase(cadena2))
			System.out.println("Iguales");
		else
			System.out.println("Distintas");
		
		// Concatenar
		System.out.println(cadena1.concat(cadena2));
		
		cadena1 = cadena1.concat(cadena2);
		System.out.println(cadena1);
		
		// contine
		if (cadena1.contains("la"))
			System.out.println("Contiene");
		
		// Posicion de letra
		System.out.println(cadena1.indexOf("a"));
		System.out.println(cadena1.lastIndexOf("a"));
		
		// Cadena vacia
		if (cadena1.equals("") || cadena1.length()==0 || cadena1.isEmpty()) {
			System.out.println("Cadena vacia");
		}
		
		// Remplazar
		cadena1 = cadena1.replace("h", "p");
		// cadena1 = cadena1.replaceAll ("h", "p");
		System.out.println(cadena1);
		
		//
		System.out.println(cadena1.substring(0, 2));
	}
}
