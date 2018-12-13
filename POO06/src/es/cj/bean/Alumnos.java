package es.cj.bean;

import java.io.Serializable;

public class Alumnos implements Serializable{
	
	private String nombre;
	private String apellidos;
	private int edad;
	private float nota_expediente;
	
	public Alumnos() {
		super();
	}

	public Alumnos(String nombre, String apellidos, int edad, float nota_expediente) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.nota_expediente = nota_expediente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public float getNota_expediente() {
		return nota_expediente;
	}

	public void setNota_expediente(float nota_expediente) {
		this.nota_expediente = nota_expediente;
	}

	@Override
	public String toString() {
		return "Alumnos [nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + ", nota_expediente="
				+ nota_expediente + "]";
	}
	
}
