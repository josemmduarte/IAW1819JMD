package es.cj.dao;

import es.cj.bean.Alumnos;

public interface AlumnosDAO {
	
	public void anadir(Alumnos a);
	public Alumnos buscarPorNota(float nota);
	public Alumnos buscarPorEdad(int edad);
	public void borrar(String nombre, String apellidos);
	
}
