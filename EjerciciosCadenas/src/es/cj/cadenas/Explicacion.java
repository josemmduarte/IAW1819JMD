package es.cj.cadenas;

import java.util.Arrays;

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
		
		// convertir cadena en array
		char letras [] = cadena1.toCharArray();
		System.out.println(Arrays.toString(letras));
		
		// quitar espacio
		String usuario =" javiyo ";
		usuario = usuario.trim();
		System.out.println(usuario);
		
		// cadena modificable
		StringBuffer sb = new StringBuffer(cadena1);
		
			// añadir al final
		sb.append("adios");
		System.out.println(sb.toString());
			// añadir en posicion
		sb.insert(0, "Inicio");
		System.out.println(sb.toString());
			// borrar caracter
		sb.deleteCharAt(7);
			// remplazar
		sb.replace(0, 3, "avion");
		System.out.println(sb.toString());
			// del reves
		sb.reverse();
		
		// dividir
		String frase = "Hola que tal estas 10;45;66";
		String palabras [] = frase.split(" ");
		
		for (int i = 0; i < palabras.length; i++) {
			System.out.println(palabras[i]);
		}
		
		String [] numeros = palabras[4].split(";");
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
		
		
	}
}
