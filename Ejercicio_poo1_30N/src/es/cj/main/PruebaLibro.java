package es.cj.main;

import es.cj.clases.Libro;

public class PruebaLibro {
	
	public static void main(String[] args) {
		
	
		Libro libro = new Libro("Guía del autoestopista galáctico", "Douglas Adams", 2, 1);
		
		 System.out.println("Libro 1:");
	        System.out.println("Titulo: " + libro.getTitulo());
	        System.out.println("Autor: " + libro.getAutor());
	        System.out.println("Ejemplares: " + libro.getEjemplares_disp());
	        System.out.println("Prestados: " + libro.getEjemplares_pres());
	        System.out.println();
	     
	    // 1º prestamo
	        if (libro.prestamo()) {
	            System.out.println("Se ha prestado " + libro.getTitulo());
	            System.out.println();
	        } else {
	            System.out.println("No se pudo prestar " + libro.getTitulo());
	            System.out.println();
	        }
	        
	        System.out.println("Ejemplares: " + libro.getEjemplares_disp());
	        System.out.println("Prestados: " + libro.getEjemplares_pres());
	        System.out.println();
	    
	     // 2º prestamo
	        if (libro.prestamo()) {
	            System.out.println("Se ha prestado " + libro.getTitulo());
	            System.out.println();
	        } else {
	            System.out.println("No se pudo prestar " + libro.getTitulo());
	            System.out.println();
	        }
	        
	        System.out.println("Ejemplares: " + libro.getEjemplares_disp());
	        System.out.println("Prestados: " + libro.getEjemplares_pres());
	        System.out.println();
	        
	    // devolucion
	        if (libro.devolucion()) {
	            System.out.println("Se ha devuelto " + libro.getTitulo());
	            System.out.println();
	        } else {
	            System.out.println("No hay ejemplares disponibles de " + libro.getTitulo());
	            System.out.println();
	        }

	        System.out.println("Ejemplares: " + libro.getEjemplares_disp());
	        System.out.println("Prestados: " + libro.getEjemplares_pres());
	        System.out.println();
	}
}


