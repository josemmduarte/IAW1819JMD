package es.cj.clases;
import java.util.Scanner;

public class NIF {
	
	//ATRIBUTOS
	 private int DNI;
	 private char letra;
	 
	//CONSTRUCTORES
	public NIF() {
		super();
	}
	
	public NIF(int DNI) {
		this.DNI = DNI;
		letra = letras();
	}
	 
	//METODOS
	public void leer() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("DNI: ");
            DNI = sc.nextInt();
        } while (String.valueOf(DNI).length()!=8);
        
        letra = letras();
    }
	
	@Override
	public String toString() {
		return DNI + "-" + letra;
	}

	private char letras() {
		char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
		return letras[DNI % 23];
	}
}

