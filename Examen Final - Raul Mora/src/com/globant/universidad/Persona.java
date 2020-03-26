package com.globant.universidad;

public class Persona {
	
	protected String nombreCompleto;
	
	
	public Persona(String nombreCompleto) {
		super();
		this.nombreCompleto = nombreCompleto;
	}

	
	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}
	

}
