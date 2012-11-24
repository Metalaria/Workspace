package arraysClases.ejercicio2;

import arrays.LeerTeclado;

public class ListaAlumnos { //clase que es un array de alumnos
	int longitud;
	Alumno [] array;
	
	//constructor
	public ListaAlumnos (){
		System.out.println("Introduce el nº de alumnos");
		this.longitud=LeerTeclado.readInteger();			
		this.array=new Alumno[longitud];
	}
	
	public void inicializarLista (){
		String nombre;
		double nota;
		System.out.println("Creación de los alumnos");
		for (int i=0; i<array.length; i++){
			System.out.println ("Introduce nombre");
			nombre=LeerTeclado.readString();
			System.out.println ("Introduce nota");
			nota=LeerTeclado.readDouble();
			
			array[i]=new Alumno(nombre,nota);//creamos el objeto y lo guardamos en la posicion i del array
		}			
	}
	
	public void estadistica(){//visualiza si cada alumnos está aprobado o suspenso, la media, etc.
		
		int cAprob=0; double media=0; 
		System.out.println ("Listado de los alumnos");
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
	
	public void ordenar (){ //ordena el array para buscar un nombre
		Alumno aux;
		for (int i=0; i<array.length-1;i++)
			for (int j=i+1;j<array.length;j++)
				/*para comparar String se usan el método compareTo() que devuelve 0 si son iguales,
				 *  -1 si es menor o 1 si es mayor */
				if (array[i].getNombre().compareTo(array[j].getNombre())>0)
				{
					aux=array[i];
					array[i]=array[j];
					array[j]=aux;
				}
		//visualizar el array ordenado por nombres

		System.out.println("Listado ordenado por nombre");
		for (int i=0;i<array.length;i++)
			System.out.println(array[i].toString());
	}
	
	public void buscarAlumnoNombre(){ //busca un nombre que se introducirá por teclado
		String nombreAux, resp;
		Alumno alumno;
		do {
			System.out.println("Introduce nombre del alumno a buscar");
			nombreAux = LeerTeclado.readString();
			alumno = buscarNombre(nombreAux); //llama al método buscarNombre pasandole el nombre introducido
			//el metodo anterior retorna un alumno que se guarda en una variable de tipo Alumno
			if (alumno == null) // si es null es que no existe
				
				System.out.println("No existe el alumno en la lista");
			else //si retorna un alumno distinto de null es que existe
				System.out.println("El alumno buscado es: " + alumno.toString());

			System.out.println("¿Deseas buscar otro alumno?");
			resp = LeerTeclado.readString();
		} while (resp.toUpperCase().equals("S"));
	}
	
	public Alumno buscarNombre(String nombreBuscado){ //busca un nombre por búsqueda binaria

		Alumno aux=null;
		boolean encontrado=false;

		int  medio,limInferior,limSuperior;

		limInferior=0; //inicializamos los límites inferior y superior
		limSuperior=array.length-1;

		do 
		{medio=(limInferior+limSuperior)/2;
		/*para comparar String se usan el método compareTo() que devuelve 0 si son iguales,
		 *  -1 si es menor o 1 si es mayor */
		if (array[medio].getNombre().compareTo(nombreBuscado)==0){
			encontrado=true;
			aux=array[medio];
		}
		else
			if (array[medio].getNombre().compareTo(nombreBuscado)>0)
				//la búsqueda se restringe a la mitad izquierda
				limSuperior=medio-1; 
			else //idem mitad derecha
				limInferior=medio+1;
		}
		while (!encontrado && limInferior<=limSuperior);
		return aux;

	}
	
	public void buscarAlumnoNota (){
		String resp;
		do
		 {
			System.out.println("Introduce la nota a buscar");
			double notaAux=LeerTeclado.readDouble();
			 buscarNota(notaAux);
			 			 
			 System.out.println("¿Deseas buscar otra nota?");
			 resp=LeerTeclado.readString();
		 }
		 while (resp.toUpperCase().equals("S"));
	}

	public void buscarNota (double notaAux){
		System.out.println("Los alumnos que tiene mayor o igual nota son:");
		for (int i=0;i<array.length;i++)
			if (array[i].getNota()>=notaAux)
				System.out.println(array[i].toString());
	}
	
	}

	
	
	
	

