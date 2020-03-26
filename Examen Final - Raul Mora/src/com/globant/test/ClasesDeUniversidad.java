package com.globant.test;
import com.globant.universidad.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClasesDeUniversidad {

	public static void main(String[] args) {

		//Docentes: 2 de planta y 2 de cátedra
		List <Profesor> docentes = new ArrayList<Profesor>();
		
		docentes.add(new ProfesorCatedra("Juan Ramirez",12));
		docentes.add(new ProfesorCatedra("Carlos Marin",20));
		docentes.add(new ProfesorPlanta("Raúl Mora Villamizar",32));
		docentes.add(new ProfesorPlanta("Ernesto Rodriguez",21));
				
		//Clases o Asignaturas
		List <ClaseAsignatura> clases = new ArrayList<ClaseAsignatura>();
		
		clases.add(new ClaseAsignatura("Calculo I","Edificio 1 - Salon 1", docentes.get(0)));
		clases.get(0).initEstudiante();
		clases.add(new ClaseAsignatura("Algebra Lineal","Edificio 2 - Salon 1", docentes.get(1)));
		clases.get(1).initEstudiante();
		clases.add(new ClaseAsignatura("Inglés I","Edificio 1 - Salon 2", docentes.get(2)));
		clases.get(2).initEstudiante();
		clases.add(new ClaseAsignatura("Cátedra","Edificio 3 - Salon 1", docentes.get(3)));
		clases.get(3).initEstudiante();
		clases.add(new ClaseAsignatura("Programación","Edificio 2 - Salon 2", docentes.get(0)));
		clases.get(4).initEstudiante();
		
		boolean exit = false;
		int opcion = 0;
		int opcion2 = 0;
		String texto1;
		String texto2;
		int texto3;
		
		do {
			System.out.println("----------------------------------------------------");
			System.out.println("------------------Menú Principal--------------------");
			System.out.println("----------------------------------------------------");
			System.out.println("1. Imprimir lista de Profesores");
			System.out.println("2. Imprimir todas las clases");
			System.out.println("3. Crear un nuevo estudiante y agregarlo a una clase");
			System.out.println("4. Crear una nueva clase");
			System.out.println("5. Mostrar las clases de un estudiante");
			System.out.println("6. Salir");
			System.out.println("----------------------------------------------------");
			
			Scanner scan = new Scanner(System.in);
			opcion = scan.nextInt();
			
			switch(opcion) {
			case 1:
				//Se imprime el listado de docentes
				imprimirDocentes(docentes);
				break;
			case 2: 
				//Se imprime una lista de las clases y luego se selecciona una clase para imprimir su información
				do {
				System.out.println("Seleccione una clase (por índice)\n--------------");
				listarClases(clases);				
				Scanner scan2 = new Scanner(System.in);
				opcion2 = scan2.nextInt();
				if(opcion2 > clases.size()) {
					System.out.println("El valor ingresado no corresponde a ninguna clase de la lista.\nSeleccione un valor correcto.");
				}
				}while(opcion2 > clases.size());
				
				System.out.println(clases.get(opcion2-1).toString());				
								
				break;
			case 3:
				//crear un nuevo estudiante y agregarlo a una clase
				System.out.println("Escriba el nombre del estudiante");
				Scanner scan3 = new Scanner(System.in);
				texto1 = scan3.nextLine();
				System.out.println("Escriba el ID del estudiante");
				Scanner scan4 = new Scanner(System.in);
				texto2 = scan4.nextLine();
				System.out.println("Escriba la edad del estudiante");
				Scanner scan5 = new Scanner(System.in);
				texto3 = scan5.nextInt();
				Estudiante est = new Estudiante (texto1, texto2, texto3);
				
				//aca se agrega el alumno a la clase
				do {
					System.out.println("Seleccione la clase en la que se va a agregar al alumno (por índice)\n--------------");
					listarClases(clases);				
					Scanner scan6 = new Scanner(System.in);
					opcion2 = scan6.nextInt();
					if(opcion2 > clases.size()) {
						System.out.println("El valor ingresado no corresponde a ninguna clase de la lista.\nSeleccione un valor correcto.");
					}
					}while(opcion2 > clases.size());
				
				clases.get(opcion2-1).agregarEstudiante(est);	
				break;
			case 4:
				//Crear una nueva clase
				System.out.println("Escriba el nombre de la clase");
				Scanner scan7 = new Scanner(System.in);
				texto1 = scan7.nextLine();
				System.out.println("Escriba el salón donde se dará la clase");
				Scanner scan8 = new Scanner(System.in);
				texto2 = scan8.nextLine();
				System.out.println("El profesor será agregado de forma aleatoria.");
				clases.add(new ClaseAsignatura (texto1, texto2, docentes.get((int)(Math.random()*docentes.size()))));
				
				break;
			case 5:
				//Mostrar las clases de un estudiante
				System.out.println("Escriba el ID del estudiante a quien desea buscar sus clases:");
				Scanner scan9 = new Scanner(System.in);
				texto1 = scan9.nextLine();
				boolean existeID = false;
				List <Estudiante> e = new ArrayList<Estudiante>();
				
				for(int i=0;i<clases.size();i++) {
					e = clases.get(i).getEstudiante();
					for(int j =0;j<e.size();j++) {
						if(e.get(j).getId().equals(texto1)) {
							System.out.println((i+1) + ".) " + clases.get(i).getNombreAsignatura());
							existeID = true;
						}
					}
				}
				if (!existeID) {
					System.out.println("El ID del estudiante escrito no se encuentra en el sistema.");
				}
				break;
				
			case 6: 
				exit = true;
				break;
			default: 
				System.out.println("Opcion incorrecta");			
			}
			
		}while (exit != true);
		//Fin del programa
System.exit(0);

		
	}

	
	//1 - Imprimir lista de profesores
	public static void imprimirDocentes(List <Profesor> docentes) {
		for(int i = 0; i < docentes.size() ;i++) {
			System.out.println(docentes.get(i).toString());
		}
	}
	//3 - crearEstudiante: Método que crea un estudiante y lo agrega en una clase
	public static void crearEstudiante (String nombreCompleto, String id, int edad, ClaseAsignatura clase) {
		Estudiante e = new Estudiante (nombreCompleto, id, edad);
		clase.agregarEstudiante(e);
		System.out.println("Estudiante creado!");
	}
	//2 - Lista las Clases 
	public static void listarClases(List <ClaseAsignatura> c) {		
		for(int i = 0; i < c.size() ;i++) {
			System.out.println((i+1) + ".) " + c.get(i).getNombreAsignatura());
		}
	}
	
}
