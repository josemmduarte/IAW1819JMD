package es.cj.cadenas;

public class Ejercicio01 {

	public static void main(String[] args) {
		String palabra = "ccIUdAdjncnArdInc";
		
		// Mayusculas
		System.out.println(palabra.toUpperCase());
		
		// Minusculas
		System.out.println(palabra.toLowerCase());
		
		// Mostrar los 2 primeros y los dos ultimos
		if (palabra.length() >= 2)
			System.out.println(palabra.substring(0, 2));
		
		// Mostar los dos ultimos
		if (palabra.length() >= 2)
			System.out.println(palabra.substring(palabra.length()-2));
		
		// Numero de veces que se repite el ultimo caracter
		String ultimo = palabra.substring(palabra.length()-1);
		int contador = 0;
		
		for (int i = 0; i < palabra.length(); i++) {
			if (palabra.substring(i, i+1).equalsIgnoreCase(ultimo))
				contador ++;
		}
		System.out.println(contador);
		
		// remplazar todas ls veces del primer caracter por el caracter en mayusculas
		String primero = palabra.substring(0, 1);
		palabra = palabra.replaceAll(primero, primero.toUpperCase());
		System.out.println(palabra);
		
		// Añadir por el principio y por erl final la cadena ****
		StringBuffer sb = new StringBuffer(palabra);	
		sb.insert(0, "****");
		sb.append("****");	
		System.out.println(sb.toString());
		
	}
	
}
