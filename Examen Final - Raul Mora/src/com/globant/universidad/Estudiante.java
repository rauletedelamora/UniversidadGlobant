package com.globant.universidad;

public class Estudiante extends Persona{
	
	String id;
	int edad;
	
	public Estudiante(String nombreCompleto) {
		super(nombreCompleto);
		// TODO Auto-generated constructor stub
	}

	public Estudiante(String nombreCompleto, String id, int edad) {
		super(nombreCompleto);
		this.id = id;
		this.edad = edad;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "\nEstudiante "+ nombreCompleto +
				"\nID: " + id + 
				"\nEdad: " + edad + " años";
	}
		
	
}
