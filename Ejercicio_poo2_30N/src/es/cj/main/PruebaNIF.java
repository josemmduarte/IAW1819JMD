package es.cj.main;
import es.cj.clases.NIF;

public class PruebaNIF {

	   public static void main(String[] args) {
		   
	        NIF n1 = new NIF();
	        n1.leer();
	        System.out.println(n1);

	        NIF n2 = new NIF(30261959);     
	        System.out.println(n2);
	   }
}
