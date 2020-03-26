package com.globant.universidad;

public class ProfesorCatedra extends Profesor{
	
	int horasClase;

	public ProfesorCatedra(String nombreCompleto, int horasClase) {
		super(nombreCompleto);
		this.horasClase = horasClase;
	}

	public int getHorasClase() {
		return horasClase;
	}

	public void setHorasClase(int horasClase) {
		this.horasClase = horasClase;
	}

	public double calcularSalario() {
		return (salario * horasClase);
	}

	@Override
	public String toString() {
		return "\nNombre: " + nombreCompleto + 
				"\nHoras de Clase: " + horasClase + 
				"\nSalario calculado: " + calcularSalario();
	}
		

}
