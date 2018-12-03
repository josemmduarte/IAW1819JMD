package es.cj.clases;

import java.util.UUID;

// Haz una clase llamada Password que siga las siguientes condiciones:
public class Password {
	
	//ATRIBUTOS /////////////////////////////////////////////////////////////////
		// Que tenga los atributos longitud y contrase�a . Por defecto, la longitud ser� de 8
	private int longitud = 8;
	private String contrasena;
	
	//CONSTRUCTORES ///////////////////////////////////////////////////////////////
		// Un constructor por defecto.
	public Password() {
		this.contrasena = generarPassword();
	}
		// Un constructor con la longitud que nosotros le pasemos. 
		// Generar� una contrase�a aleatoria con esa longitud (Clase java util UUID).
	public Password(int longitud) {
		super();
		this.longitud = longitud;
		this.contrasena = generarPassword();
	}
	
	//METODOS //////////////////////////////////////////////////////////////////
		// esFuerte(): devuelve un booleano si es fuerte o no, para que sea fuerte debe 
		// tener 2 may�sculas, 1 min�scula y 5 n�meros.
	public boolean esFuerte() {
		int mayus=0, minus=0, numeros=0;
		
		for (int i = 0; i < contrasena.length(); i++) {
			char letra = contrasena.charAt(i);
			
			if (Character.isUpperCase(letra))
				mayus++;
			else if (Character.isLowerCase(letra))
				minus++;
			else if (Character.isDigit(letra))
				numeros++;
		}
		return (mayus >=2) && (minus >= 1)&& (numeros >= 5);
	}
	
		// generarPassword(): genera la contrase�a del objeto con la longitud que tenga.
	public String generarPassword() {
		return UUID.randomUUID().toString().substring(0, longitud);
	}

	//GET Y SET /////////////////////////////////////////////////////////////////
	public int getLongitud() {
		return longitud;
	}
	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}
	public String getContrasena() {
		return contrasena;
	}
}
