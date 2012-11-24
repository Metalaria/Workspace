package Examen;
public class Principal {

	public static void main(String[] args) {
		//creamos el banco
		System.out.println("Creamos el banco");
		System.out.println("Introduce el nombre del banco  y el tamaño de cuentas");
		String nombre=LeerTeclado.readString();
		int tamanno=LeerTeclado.readInteger();
		
		Banco banco=new Banco(nombre, tamanno);
		
		int opcion;
		 
		do {
			
			System.out.println("MENU");
			System.out.println("1.- Dar de alta una cuenta");
			System.out.println("2.- Ingreso en una cuenta");
			System.out.println("3.- Cuenta de mayor saldo");
			System.out.println("4.- Salir");
			do {
				System.out.println("Introduce opcion (1-4)");
				opcion = LeerTeclado.readInteger();
			} while (opcion < 1 || opcion > 4);
		
			switch (opcion){
			case 1: banco.insertar();break;
			case 2: banco.ingreso();break;
			case 3: banco.cuentaMayor();break;
			case 4: System.out.println("Fin de programa");break;
			}	
		}
		while (opcion!=4);



	}

}
