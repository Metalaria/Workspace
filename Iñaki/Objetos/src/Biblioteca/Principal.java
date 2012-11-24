package Biblioteca;

public class Principal {
	public static void main(String[] args) {
				
		Metodos autor1 = new Metodos();
		Metodos autor2 = new Metodos();
		Metodos libro1 = new Metodos();
		Metodos libro2 = new Metodos();
		
		System.out.println("Introduce el nombre del autor: ");
		String nombre = LeerTeclado.readString();
		System.out.println("Nacionalidad: ");
		String nacionalidad = LeerTeclado.readString();
		System.out.println("Fecha de nacimiento: ");
		int nacimiento = LeerTeclado.readInteger();
		autor1.setNombre(nombre);
		autor1.setNacionalidad(nacionalidad);
		autor1.setNacimiento(nacimiento);
		
		//au2
		System.out.println("Introduce el nombre de otro autor: ");
		nombre = LeerTeclado.readString();
		System.out.println("Nacionalidad: ");
		nacionalidad = LeerTeclado.readString();
		System.out.println("Fecha de nacimiento: ");
		nacimiento = LeerTeclado.readInteger();
		autor2.setNombre(nombre);
		autor2.setNacionalidad(nacionalidad);
		autor2.setNacimiento(nacimiento);
		
		//lib1
		System.out.println("Introduce el titulo del libro: ");
		nombre = LeerTeclado.readString();
		System.out.println("Isbn: ");
		nacionalidad = LeerTeclado.readString();
		libro1.setTitulo(nombre);
		libro1.setIsbn(nacionalidad);
		
		//lib2
		System.out.println("Introduce el titulo de otro libro: ");
		nombre = LeerTeclado.readString();
		System.out.println("Isbn: ");
		nacionalidad = LeerTeclado.readString();
		libro2.setTitulo(nombre);
		libro2.setIsbn(nacionalidad);
		
		
		System.out.println("Autor1: "+autor1.toString());
		System.out.println("Autor2: "+autor2.toString());
		System.out.println("Libro1: "+libro1.getTitulo()+" isbn: "+libro1.getIsbn()+" prestado: "+libro1.prestarLibro());
		System.out.println("Libro2: "+libro2.getTitulo()+" isbn: "+libro2.getIsbn()+" prestado: "+libro2.prestarLibro());
	}
}