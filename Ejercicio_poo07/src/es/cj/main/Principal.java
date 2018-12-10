package es.cj.main;

import es.cj.bin.Palabra;
import es.cj.dao.PalabraDAO2;
import es.cj.dao.PalabraDAOlistas;

public class Principal {

	public static void main(String[] args) {
		PalabraDAO2 pDAO = new PalabraDAOlistas();

		Palabra p1 = new Palabra("Hola", "Saludo formal");
		Palabra p2 = new Palabra("Adios", "Despedida formal");
		Palabra p3 = new Palabra("Mesa", "mueble");
		
		pDAO.anadir(p1);
		pDAO.anadir(p2);
		pDAO.anadir(p3);
		
		pDAO.listar();
		
		if (pDAO.borrar(p3))
			System.out.println("Palabra borrada");
		else
			System.out.println("No existe la palabra");
		
		pDAO.listar();
		
		if (pDAO.buscar(p3))
			System.out.println("Palabra encontrada");
		else
			System.out.println("Palabra no encontrada");
		
		System.out.println("Definicion de Hola: "+ pDAO.obtenerdefinicion("hola"));
	}
}
