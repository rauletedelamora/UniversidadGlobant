package com.globant.universidad;

public class ProfesorPlanta extends Profesor{
	
	int a�osExperiencia;

	public ProfesorPlanta(String nombreCompleto, int a�osExperiencia) {
		super(nombreCompleto);
		this.a�osExperiencia = a�osExperiencia;
	}

	public int getA�osExperiencia() {
		return a�osExperiencia;
	}

	public void setA�osExperiencia(int a�osExperiencia) {
		this.a�osExperiencia = a�osExperiencia;
	}
	
	public double calcularSalario() {
		return (salario * (a�osExperiencia*1.1));
	}
	
	@Override
	public String toString() {
		return "\nNombre: " + nombreCompleto + 
				"\nExperiencia: " + a�osExperiencia + " a�os" + 
				"\nSalario calculado: " + calcularSalario();
	}
		
		
		
}
