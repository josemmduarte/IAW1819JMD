package es.cj.dao;

import es.cj.bin.Palabra;

public interface PalabraDAO2 {

	public void anadir(Palabra p);
	public boolean borrar(Palabra p);
	public boolean buscar(Palabra p);
	public String obtenerdefinicion(String palabra);
	public void listar();
	
}
