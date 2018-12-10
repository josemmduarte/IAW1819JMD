package es.cj.dao;

import java.util.ArrayList;
import java.util.List;

import es.cj.bin.Palabra;

public class PalabraDAOlistas implements PalabraDAO2 {
	
	private List<Palabra> diccionario = new ArrayList<>();

	@Override
	public void anadir(Palabra p) {
		if(!diccionario.contains(p))
			diccionario.add(p);
	}

	@Override
	public boolean borrar(Palabra p) {
		return diccionario.remove(p);
	}

	@Override
	public boolean buscar(Palabra p) {
		return diccionario.contains(p);
	}

	@Override
	public String obtenerdefinicion(String palabra) {
		for (Palabra pal : diccionario) {
			if (pal.getPalabra().equalsIgnoreCase(palabra))
				return pal.getDefinicion();
		}
		return "";
	}

	@Override
	public void listar() {
		for (Palabra palabra : diccionario) {
			System.out.println(palabra);
		}
	}
}
