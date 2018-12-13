package es.cj.dao;

import java.util.ArrayList;
import java.util.List;

import es.cj.bean.Alumnos;

public class AlumnosDAOlistas implements AlumnosDAO{

	private List<Alumnos> alumnos = new ArrayList<>(); 
	
	@Override
	public void anadir(Alumnos a) {
		alumnos.add(a);
	}

	@Override
	public Alumnos buscarPorNota(float nota) {
		for (int i = 0; i < alumnos.size(); i++) {
			if (alumnos.get(i).getNota_expediente() == nota)
				return alumnos.get(i);
		}
		return null;
	}

	@Override
	public Alumnos buscarPorEdad(int edad) {
		for (Alumnos alum : alumnos) {
			if (alum.getEdad() == edad)
				return alum;
		}
		return null;
	}

	@Override
	public void borrar(String nombre, String apellidos) {
		
	}
	
}
