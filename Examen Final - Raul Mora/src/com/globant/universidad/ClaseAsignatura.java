package com.globant.universidad;

import java.util.ArrayList;
import java.util.List;

public class ClaseAsignatura {
	
	String nombreAsignatura;
	String salón;
	Profesor profesor;
	List <Estudiante> estudiante = new ArrayList <Estudiante>();
	
	
	public void initEstudiante() {
	
	estudiante.add(new Estudiante ("Manuela Mora","1",16));	
	estudiante.add(new Estudiante ("Matias Quitian","2",17));
	estudiante.add(new Estudiante ("Victor Corrales","3",17));
	estudiante.add(new Estudiante ("Jean Velasquez","4",16));
	estudiante.add(new Estudiante ("Liliana Calderón","5",18));
	estudiante.add(new Estudiante ("Fabio Puertas","6",17));
	
	}
	
	public ClaseAsignatura(String nombreAsignatura, String salón, Profesor profesor) {
		super();
		this.nombreAsignatura = nombreAsignatura;
		this.salón = salón;
		this.profesor = profesor;
	}

	public String getNombreAsignatura() {
		return nombreAsignatura;
	}

	public void setNombreAsignatura(String nombreAsignatura) {
		this.nombreAsignatura = nombreAsignatura;
	}

	public String getSalón() {
		return salón;
	}

	public void setSalón(String salón) {
		this.salón = salón;
	}

	public List<Estudiante> getEstudiante() {
		return estudiante;
	}

	public void setEstudiante(List<Estudiante> estudiante) {
		this.estudiante = estudiante;
	}

	public Profesor getProfesor() {
		return profesor;
	}

	public void setProfesores(Profesor profesor) {
		this.profesor = profesor;
	}
	
	public void agregarEstudiante(Estudiante e) {
		estudiante.add(e);
		System.out.println("Estudiante agregado!");
	}

	@Override
	public String toString() {
		return "\nClase " + nombreAsignatura + 
				"\nSalón: " + salón + 
				"\nProfesor: " + profesor + 
				"\nEstudiante: " + estudiante;
	}
	
	
}
