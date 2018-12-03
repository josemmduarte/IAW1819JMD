package es.cj.clases;

public class Libro {

	//ATRIBUTOS
	private String titulo;
	private String autor;
	private int ejemplares_disp;
	private int ejemplares_pres;
	
	//CONSTRUCTORES
	public Libro() {
		super();
	}

	public Libro(String titulo, String autor, int ejemplares_disp, int ejemplares_pres) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.ejemplares_disp = ejemplares_disp;
		this.ejemplares_pres = ejemplares_pres;
	}
	
	//GET Y SET
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getEjemplares_disp() {
		return ejemplares_disp;
	}

	public void setEjemplares_disp(int ejemplares_disp) {
		this.ejemplares_disp = ejemplares_disp;
	}

	public int getEjemplares_pres() {
		return ejemplares_pres;
	}

	public void setEjemplares_pres(int ejemplares_pres) {
		this.ejemplares_pres = ejemplares_pres;
	}
	
	//METODOS
	public boolean prestamo() {
        boolean prestado = true;
        if (ejemplares_pres < ejemplares_disp)
        	ejemplares_pres++;
        else 
            prestado = false;
        return prestado;
    }
		
	public boolean devolucion() {
		boolean devuelto = true;
		if (ejemplares_pres == 0 )
			devuelto = false;
		else
			ejemplares_pres--;
		return devuelto;
	}

	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", ejemplares_disp=" + ejemplares_disp
				+ ", ejemplares_pres=" + ejemplares_pres + "]";
	}	
}
 

