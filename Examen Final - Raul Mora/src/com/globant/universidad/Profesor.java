package com.globant.universidad;

public abstract class Profesor extends Persona{
	
	public Profesor(String nombreCompleto) {
		super(nombreCompleto);
		// TODO Auto-generated constructor stub
	}

	int salario=1200000;

	public Profesor(String nombreCompleto, int salario) {
		super(nombreCompleto);
		this.salario = salario;
	}
	
	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}
	
	abstract public double calcularSalario();
}