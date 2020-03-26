package com.globant.universidad;

public class ProfesorPlanta extends Profesor{
	
	int añosExperiencia;

	public ProfesorPlanta(String nombreCompleto, int añosExperiencia) {
		super(nombreCompleto);
		this.añosExperiencia = añosExperiencia;
	}

	public int getAñosExperiencia() {
		return añosExperiencia;
	}

	public void setAñosExperiencia(int añosExperiencia) {
		this.añosExperiencia = añosExperiencia;
	}
	
	public double calcularSalario() {
		return (salario * (añosExperiencia*1.1));
	}
	
	@Override
	public String toString() {
		return "\nNombre: " + nombreCompleto + 
				"\nExperiencia: " + añosExperiencia + " años" + 
				"\nSalario calculado: " + calcularSalario();
	}
		
		
		
}
