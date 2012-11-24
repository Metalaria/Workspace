package Ejercicio05;

public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Departamento[] array=new Departamento[4];
		
		altaDepartamentos(array);//Da de alta los departamentos.
		alta(array);// Da de alta los empleados.
		visualizarDpto(array);//Visualiza departamento.
		visualizarEmp(array);//Visualiza empleado.
		
		//Mayor sueldo por departamento
		for(int i=0;i<array.length;i++){
			System.out.println("El empleado con mayor sueldo del departamento "+i+" es: ");
			System.out.println(array[i].mayorSueldo());
		}
		
		//Mayor sueldo en toda la empresa
		for(int i=0;i<array.length;i++){
			System.out.println("El empleado con mayor sueldo de la empresa es: ");
			array[i].mayorSueldo();
		}
		
		

	}
	public static void altaDepartamentos(Departamento array[]){
		String nombreDpto;
		int numeroEmpleados;
		//Departamento departamento;
		for(int i=0;i<4;i++){
			System.out.println("Introduca los datos del departamento "+i+" :");
			System.out.println("Introduzca Nombre Departamento:");
			nombreDpto=LeerTeclado.readString();
			System.out.println("Introduzca Numero empleados del departamento:");
			numeroEmpleados=LeerTeclado.readInteger();
			
			array[i]=new Departamento(nombreDpto, numeroEmpleados);
		}
	}
	public static void alta(Departamento array[]){
		String nombre;
		double sueldo;
		int respuesta;
		int depar;
		do{
			do{
			System.out.println("Selecione el departamento en el que dara de alta al nuevo empleado.");
			System.out.println("Pulsando de 0 a 3.");
			depar=LeerTeclado.readInteger();
			}
			while(depar<0 || depar>3);
			System.out.println("Introduca los datos del empleado");
			System.out.println("Introduce Nombre:");
			nombre=LeerTeclado.readString();
			System.out.println("Introduce Sueldo:");
			sueldo=LeerTeclado.readDouble();
		
			array[depar].altaEmpleado(nombre, sueldo);
			
			System.out.println("¿Desea introducir otro empleado? Si es que si pulse 1 si es que no pulse 0");
			respuesta=LeerTeclado.readInteger();
		}
		while(respuesta>0);
		
	}
	
	public static void visualizarDpto(Departamento array[]){
		//Visualizar departamento con empleados dentro.
		int depar;
		System.out.println("Introduca un departamento para visualizar. Pulsando de 0 a 3");
		depar=LeerTeclado.readInteger();
		System.out.println(array[depar].visualizarDpto());
	}
	
	public static void visualizarEmp(Departamento array[]){
		//Visualizar empleado pasandole el codigo departamento y codigo empleado.
		int depar;
		System.out.println("Introduce el codigo departamento y codigo empleado a visualizar.");
		System.out.println("Codigo Departamento:");
		depar=LeerTeclado.readInteger();
		System.out.println("Codigo Empleado:");
		int emp=LeerTeclado.readInteger();
		System.out.println(array[depar].buscarEmpDep(emp));
	}
	

}
