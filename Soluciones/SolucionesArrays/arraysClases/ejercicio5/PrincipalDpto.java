package arraysClases.ejercicio5;

import arrays.LeerTeclado;

public class PrincipalDpto {

	
	public static void main(String[] args) {
		
		Empresa empresa=new Empresa();
		
		int opcion;
		 
		do {
			
			System.out.println("MENU");
			System.out.println("1.- Dar de alta departamentos");
			System.out.println("2.- Asignar un empleado a un departamento ");
			System.out.println("3.- Listar datos de un departamento");
			System.out.println("4.- Buscar un empleado en un departamento");
			System.out.println("5.- Buscar el empleado de mayor sueldo en el departamento");
			System.out.println("6.- Buscar el empleado de mayor sueldo en la empresa");
			System.out.println("7.- Salir");
			do {
				System.out.println("Introduce opcion (1-7)");
				opcion = LeerTeclado.readInteger();
			} while (opcion < 1 || opcion > 7);
		
			switch (opcion){
			case 1: empresa.altaDpto() ;break;
			case 2: empresa.asignarEmpDpto();break;
			case 3: empresa.listarDpto();break;
			case 4: empresa.buscrEmpDpto();break;
			case 5: empresa.mayorSueldoDpto();break;
			case 6: empresa.mayorSueldo();break;
			case 7: System.out.println("Fin de programa");break;
			}	
		}
		while (opcion!=7);
		

	}

}
