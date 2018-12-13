package es.cj.main;

import es.cj.bean.Alumnos;
import es.cj.dao.AlumnosDAO;
import es.cj.dao.AlumnosDAOlistas;

public class Principal {

	public static void main(String[] args) {
		
		AlumnosDAO alumDAO = new AlumnosDAOlistas();
		
		Alumnos a1 = new Alumnos("Yo", "YoYo", 28, 9.5F);
		Alumnos a2 = new Alumnos("Tu", "TuTu", 27, 9.0F);
		
		alumDAO.anadir(a1);
		alumDAO.anadir(a2);
		alumDAO.mostrarTodos();
 
		alumDAO.buscarPorEdad(28);
		System.out.println(alumDAO.buscarPorEdad(28));
		
	}
}
