package arraysClases.ejercicio2;

import arrays.LeerTeclado;

public class PrincipalAlumnos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		 ListaAlumnos listaAlumnos=new ListaAlumnos();
		 
		 listaAlumnos.inicializarLista(); //creamos el array
		 
		 int opcion;
		 
		do {
			System.out.println("MENU");
			System.out.println("1.- Visualizar la estadística de la clase");
			System.out.println("2.- Ordenar por  nombre la lista de la clase ");
			System.out.println("3.- Buscar un alumno");
			System.out.println("4.- Buscar una nota");
			System.out.println("5.- Salir");
			do {
				System.out.println("Introduce opcion (1-5)");
				opcion = LeerTeclado.readInteger();
			} while (opcion < 1 || opcion > 5);
		
			switch (opcion){
			case 1: listaAlumnos.estadistica();break;
			case 2: listaAlumnos.ordenar();break;
			case 3: listaAlumnos.buscarAlumnoNombre();break;
			case 4: listaAlumnos.buscarAlumnoNota();break;
			case 5: System.out.println("Adiós");break;
			}	
		}
		while (opcion!=5);
	}
		
	static void buscarNota (Alumno[] array, double notaAux){
		System.out.println("Los alumnos que tiene mayor o igual nota son:");
		for (int i=0;i<array.length;i++)
			if (array[i].getNota()>=notaAux)
				System.out.println(array[i].toString());
	}
	
	static void buscarAlumnoNota (Alumno[] array){
		String resp;
		do
		 {
			System.out.println("Introduce la nota a buscar");
			double notaAux=LeerTeclado.readDouble();
			 buscarNota(array, notaAux);
			 			 
			 System.out.println("¿Deseas buscar otra nota?");
			 resp=LeerTeclado.readString();
		 }
		 while (resp.toUpperCase().equals("S"));
	}

	}
	
