package es.cj.main;

import es.cj.clases.Alumno;
import es.cj.clases.Asignaturas;
import es.cj.clases.Profesor;

public class Principal {

	public static void main(String [] args) {
		
		Asignaturas iaw = new Asignaturas(1234);
		Asignaturas sgbd = new Asignaturas(5678);
		Asignaturas aso = new Asignaturas(2244);
		
		Alumno yo = new Alumno (iaw, sgbd, aso);
		
		Profesor.ponernotas(yo);
		
		System.out.println("Media: "+ Profesor.calcularMedia(yo));
	}
	
}
