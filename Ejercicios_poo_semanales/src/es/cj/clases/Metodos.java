package es.cj.clases;

public class Metodos {
				
		public static int calcularIMC(Persona p) {
			
			double ideal=0;
			ideal= p.getPeso() / (p.getAltura()*2);
			
			if (ideal < 20) {
				return -1;
				}
			else if (ideal >=20 && ideal <=25) {
				return 0;
				}
			else
				return 1;
			}
		
		public static boolean esMayorDeEdad(Persona p) {
			
			if (p.getEdad()>=18)
				return true;
			else
				return false;
		}
}

//Ahora, crea una clase ejecutable que haga lo siguiente:	
//Crea 3 objetos de la clase anterior utilizando los diferentes atributos. 
// Para cada objeto, deberá comprobar si está en su peso ideal, tiene sobrepeso 
// o por debajo de su peso ideal con un mensaje. Indicar para cada objeto si es 
// mayor de edad. Por último, mostrar la información de cada objeto.
