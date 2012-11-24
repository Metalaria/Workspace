package SolucionesObjetosBasicos.biblioteca;



public class Principal {

	public static void main(String[] args) {
		
		String nombre, nacionalidad, isbn, titulo;
		int annoNacim;
		Autor autor;
		
		System.out.println("Introduce los datos del primer autor: nombre, nacionalidad y año de nacimiento");
		nombre=LeerTeclado.readString();
		nacionalidad=LeerTeclado.readString();
		annoNacim=LeerTeclado.readInteger();
		
		Autor autor1=new Autor(nombre, nacionalidad, annoNacim);
		
		System.out.println("Introduce los datos del segundo autor: nombre, nacionalidad y año de nacimiento");
		nombre=LeerTeclado.readString();
		nacionalidad=LeerTeclado.readString();
		annoNacim=LeerTeclado.readInteger();
		
		Autor autor2=new Autor(nombre, nacionalidad, annoNacim);
		
		System.out.println("Introduce los datos del primer libro: isbn, titulo, nombre del autor");
		isbn=LeerTeclado.readString();
		titulo=LeerTeclado.readString();
		do {
			System.out.println("Los autores disponibles son: "+ autor1.getNombre() + " y "+autor2.getNombre());
			nombre=LeerTeclado.readString();
		}
		while (!nombre.equals(autor1.getNombre())&& !nombre.equals(autor2.getNombre()));
		
		if (nombre!=autor1.getNombre())
			autor=autor1;
		else 
			autor=autor2;
		
		Libro libro1=new Libro (isbn, titulo, autor);
		
		System.out.println("Introduce los datos del segundo libro: isbn, titulo, nombre del autor");
		isbn=LeerTeclado.readString();
		titulo=LeerTeclado.readString();
		do {
			System.out.println("Los autores disponibles son: "+ autor1.getNombre() + " y "+autor2.getNombre());
			nombre=LeerTeclado.readString();
		}
		while (!nombre.equals(autor1.getNombre())&& !nombre.equals(autor2.getNombre()));
		
		if (nombre.equals(autor1.getNombre()))
			autor=autor1;
		else 
			autor=autor2;
		
		Libro libro2=new Libro (isbn, titulo, autor);
		
		System.out.println("Datos del primer libro"+libro1.toString());
		System.out.println("Datos del segundo libro"+libro2.toString());
		
		libro1.prestar();
		System.out.println("Datos del primer libro"+libro1.toString());
		libro1.prestar();
		libro1.devolver();
		System.out.println("Datos del primer libro"+libro1.toString());
		libro1.devolver();
		
	
	

	}

}
