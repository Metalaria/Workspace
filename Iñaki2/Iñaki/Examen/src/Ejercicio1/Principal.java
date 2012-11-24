package Ejercicio1;


public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Declaracion de objetos
		Empresa coritel=new Empresa("Coritel");
		Departamento informatica= new Departamento("informatica", 30000);
		Departamento administracion= new Departamento("administracion", 10000);
		
		//Insertar en vectores
		coritel.insertarListaCalculable(informatica);
		coritel.insertarListaCalculable(administracion);
		
		//menu
		boolean continuar=true;
		do{
			System.out.println("Introduca opcion del Menu:");
			System.out.println("1: Contratar Personal");
			System.out.println("2: Ascender Empleado");
			System.out.println("3: Incrementar Recursos");
			System.out.println("4: Fin");
			int menu=LeerTeclado.readInteger();
			
			switch(menu){
			case 1:contratar(coritel,informatica,administracion);
			break;
			case 2:coritel.ascender();
			break;
			case 3:coritel.incrementar();
			break;
			case 4:continuar=false;
			default: System.out.println("Opcion invalida de menu");
			}
		}while(continuar==true);
		

	}
	public static void contratar(Empresa coritel,Departamento informatica,Departamento administracion){
		System.out.println("En que departamendo desea dar el alta: 1-Informatica  2-Administracion");
		int opcion=LeerTeclado.readInteger();
		if(opcion==1){
			coritel.contratar(informatica);
		}
		else coritel.contratar(administracion);
		
	}

}
