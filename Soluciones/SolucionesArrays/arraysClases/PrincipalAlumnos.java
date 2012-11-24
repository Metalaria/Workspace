package arraysClases;

import arrays.LeerTeclado;

public class PrincipalAlumnos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		 final int longitud=30;
		 Alumno[] arrayAlumnos=new Alumno[longitud];
		 int opcion;
		 inicializar(arrayAlumnos);
		 
		do {
			System.out.println("MENU");
			System.out.println("1.- Visualizar la estadística de la clase");
			System.out.println("2.- Ordenar por nombre la lista de la clase");
			System.out.println("3.- Buscar un alumno");
			System.out.println("4.- Buscar una nota");
			System.out.println("5.- Salir");
			do {
				System.out.println("Introduce opcion (1-5)");
				opcion = LeerTeclado.readInteger();
			} while (opcion < 1 || opcion > 5);
		
			switch (opcion){
			case 1: estadisticas(arrayAlumnos);break;
			case 2: ordenar(arrayAlumnos);break;
			case 3: buscarAlumnoNombre(arrayAlumnos);break;
			case 4: buscarAlumnoNota(arrayAlumnos);break;
			case 5: System.out.println("Adiós");break;
			}	
		}
		while (opcion!=5);
	}
			
	static void inicializar(Alumno[] array){
		String nombre;
		double nota;
		System.out.println("Creación de los alumnos");
		for (int i=0; i<array.length; i++){
			System.out.println ("Introduce nombre");
			nombre=LeerTeclado.readString();
			System.out.println ("Introduce nota");
			nota=LeerTeclado.readDouble();
			
			array[i]=new Alumno(nombre,nota);//crea un nuevo objeto alumno y lo guarda en el array
		}			
		}
		
	static void estadisticas (Alumno[] array){
		int cAprob=0; double media=0; 
		System.out.println();
		System.out.println ("Listado de los alumnos");
		System.out.println();
		for (int i=0; i<array.length; i++){
			media+=array[i].getNota();
			if (array[i].getNota()>=5){
				System.out.println("El alumno: "+array[i].getNombre()+" está aprobado con nota: "+array[i].getNota());
				cAprob++;
			}
			else 
				System.out.println("El alumno: "+array[i].getNombre()+" está suspenso con nota: "+array[i].getNota());
		}	
		media/=array.length;
		System.out.println("Total de aprobados: "+cAprob);
		System.out.println("Total de suspensos: "+(array.length-cAprob));
		System.out.println("Nota media: "+media);
	}
	
	static void ordenar (Alumno[] array){
		Alumno aux;
		for (int i=0; i<array.length-1;i++)
		 for (int j=i+1;j<array.length;j++)
			 /*para comparar String se usan el método compareTo() que devuelve 0 si son iguales,
			  -1 si es menor o 1 si es mayor */
			if (array[i].getNombre().compareTo(array[j].getNombre())>0)
				{
				aux=array[i];
				array[i]=array[j];
				array[j]=aux;
				}
		//visualizar el array ordenado por nombre
		
		System.out.println("Listado ordenado por nombre");
		System.out.println();
		for (int i=0;i<array.length;i++)
			System.out.println(array[i].toString());
		
	}
	
	static Alumno buscarNombre(Alumno[] array, String nombreAux){
		
		Alumno aux=null;
		boolean encontrado=false;
		
		int  medio,limInferior,limSuperior;
		
		limInferior=0; //inicializamos los límites inferior y superior
		limSuperior=array.length-1;
		
		do
		{	medio=(limInferior+limSuperior)/2;
			if (array[medio].getNombre().compareTo(nombreAux)==0){
				encontrado=true;
				aux=array[medio];
			}
			else
				if (array[medio].getNombre().compareTo(nombreAux)>0)//la búsqueda se restringe a la mitad izquierda
					limSuperior=medio-1; 
				else //idem mitad derecha
					limInferior=medio+1;
		}
		while (!encontrado && limInferior<=limSuperior);
		return aux;
		
	}
	
	static void buscarNota (Alumno[] array, double notaAux){
		System.out.println("Los alumnos que tiene mayor o igual nota son:");
		for (int i=0;i<array.length;i++)
			if (array[i].getNota()>=notaAux)
				System.out.println(array[i].toString());
				
		
	}
	
	static void buscarAlumnoNombre(Alumno[] array){
		String nombreAux, resp;
		Alumno alumno;
		do {
			System.out.println("Introduce nombre del alumno a buscar");
			nombreAux = LeerTeclado.readString();
			alumno = buscarNombre(array, nombreAux);
			if (alumno == null)
				System.out.println("No existe el alumno en la lista");
			else
				System.out
						.println("El alumno buscado es: " + alumno.toString());

			System.out.println("¿Deseas buscar otro alumno?");
			resp = LeerTeclado.readString();
		} while (resp.toUpperCase().equals("S"));
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
	
