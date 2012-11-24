package arrayParte1;

public class Principal {

	public static void main(String[] args) {
		//creamos el disco
		System.out.println("Creamos el disco");
		System.out.println("Introduce el nombre del disco, del cantante y el nº de canciones");
		String nombre=LeerTeclado.readString();
		String cantante=LeerTeclado.readString();
		int numCanciones=LeerTeclado.readInteger();
		Disco disco=new Disco (nombre, cantante, numCanciones);
		
		int opcion;
		 
		do {
			
			System.out.println("MENU");
			System.out.println("1.- Dar de alta una cancion");
			System.out.println("2.- Buscar una cancion");
			System.out.println("3.- Visualizar los datos del disco");
			System.out.println("4.- Salir");
			do {
				System.out.println("Introduce opcion (1-4)");
				opcion = LeerTeclado.readInteger();
			} while (opcion < 1 || opcion > 4);
		
			switch (opcion){
			case 1: disco.insertar();break;
			case 2: disco.buscar();break;
			case 3: disco.visualizarDisco();break;
			case 4: System.out.println("Fin de programa");break;
			}	
		}
		while (opcion!=4);
	}

}
