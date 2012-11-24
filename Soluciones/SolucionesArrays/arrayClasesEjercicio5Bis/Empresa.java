package arrayClasesEjercicio5Bis;

import arrays.LeerTeclado;

public class Empresa {
	
	private Departamento[] arrayDpto;
	
	public Empresa(){
		arrayDpto=new Departamento[4];
	}
	
	/***********************************ALTA DE DEPARTAMENTO**************************************/
	
	public void altaDpto (){

		System.out.println("Alta de departamento");
		String resp;
		String nbDpto;
		
		do { 
			
			System.out.println("Introduce nombre de departamento");
			nbDpto=LeerTeclado.readString();
			
			if (buscarNbDpto(nbDpto)){ //busca si el departamento ya existe
				System.out.println("El departamento a dar de alta ya existe"); 
				
			}
			else {
				insertarDpto(nbDpto);
			}
			
			System.out.println("¿Deseas dar de alta otro departamento(s/n)");
			resp=LeerTeclado.readString();

		}

		while (resp.toLowerCase().equals("s"));

	}
	
	/***********************************BUSCAR NOMBRE DPTO*********************************************/
	
	public boolean buscarNbDpto(String nbDpto){
		
		boolean encontrado=false;
		for (int i=0; i<arrayDpto.length&&!encontrado ; i++){
			if (arrayDpto[i]!=null && arrayDpto[i].getNombre().compareTo(nbDpto)==0){
				encontrado=true;
				//break; 
				//se podria romper el for con un break si se encuentra en lugar de usar el switch en la condición del for
			}
		}
		return encontrado;
	}

	/***********************************INSERTAR DPTO*********************************************/
	
	public void insertarDpto(String nbDpto){
		
		System.out.println("Introduce el número de empleados del departamento");
		int numEmp=LeerTeclado.readInteger();
		Departamento dpto=new Departamento(nbDpto,numEmp);
		int i=dpto.getCodigoDpto()-1;
		arrayDpto[i]=dpto;//guarda el objeto dpto en el array en la posicion que indica codDpto-1
		System.out.println("Se ha dado de alta el departamento "+dpto.toString());
		
	}
	
	/************************************ASIGNAR EMPLEADO AL DPTO**************************************/

	public void asignarEmpDpto(){
		
		System.out.println("Asignación de un empleado a un departamento");
		
		int codDpto;
		Departamento dpto;
		do {
			System.out.println("Introduce codigo del departamento (1-4)");
			codDpto=LeerTeclado.readInteger();				
		}
		while (codDpto<1||codDpto>4);

		dpto=arrayDpto[codDpto-1];//guardo el departamento que esta en el array en la posicion que indica el codDpto-1

		if (dpto==null)//no existe el dpto en el array de dpto
			System.out.println("No se ha dado de alta el departamento");

		else //existe el dpto
			
		altaEmpDpto(dpto);
		
	}

		
	/************************************ALTA EMP DPTO**************************************/
	
	public void altaEmpDpto(Departamento dpto){
		
		String nombreEmp;
		int codEmp;
		double sueldo;
		Empleado emp;
		String resp;
		
		System.out.println("Se va a dar de alta un empleado en el departamento "+dpto.toString());
		
		do 
		{
			//comprobamos que no está lleno el array de Empleados
			if (dpto.contadorEmpleados()==dpto.getNumeroEmp()){
				System.out.println("No se puede dar más altas de empleados en el departamento porque está lleno");
				break; //rompe el do while porque no hay más altas
			}
			else {
			System.out.println("En el departamento hay "+dpto.contadorEmpleados()+ " empleados");
			
			System.out.println("Alta del empleado");
			
			System.out.println("Introduce nombre del empleado");
			nombreEmp=LeerTeclado.readString();
				
			if (dpto.buscarEmp(nombreEmp)!=null){//==true)//existe el nombre de empleado en el departamento
				System.out.println("El empleado ya existe ");
				System.out.println(dpto.buscarEmp(nombreEmp).toString());
			}
			
			else { //no existe en el dpto miramos si existe en otro dpto del array
				
				if (!buscarEmpDptos(nombreEmp)){//si no existe el empleado en otro dpto
					System.out.println("Introduce sueldo del empleado");
					sueldo=LeerTeclado.readDouble();
					codEmp=dpto.contadorEmpleados()+1;
					emp=new Empleado(codEmp,nombreEmp,sueldo);
					dpto.asignarEmp(emp);//asigna el empleado al dpto
				}
				
			}
							
			}
	
			System.out.println("¿Deseas dar de alta otro empleado en el departamento(s/n)");
			resp=LeerTeclado.readString();
		}

		while (resp.toLowerCase().equals("s"));	
		
		
	}
	
	/***********************************BUSCAR EMPLEADO EN TODOS LOS DEPARTAMENTOS**************************************/
	
	public boolean buscarEmpDptos(String nombreEmp){
		boolean encontrado=false;
		Empleado empl;
		Departamento dpto;
		for (int i=0; i<arrayDpto.length; i++)
			if (arrayDpto[i]!=null){
				dpto=arrayDpto[i];
				empl=dpto.buscarEmp(nombreEmp);
				if (empl!=null){
					System.out.println("El empleado "+empl.toString()+ " se encuentra en el departemento "+dpto.getNombre());
					encontrado=true;
					break;
			}			
					
		}
		return encontrado;
	}
	
	/************************************LISTAR DPTO**************************************/
		
	public void listarDpto(){
		
		int codDpto;
		Departamento dpto;
		
		do {
			System.out.println("Introduce codigo del departamento (1-4)");
			codDpto=LeerTeclado.readInteger();				
		}
		while (codDpto<1||codDpto>4);
		
		dpto=arrayDpto[codDpto-1];//guardo el departamento que esta en el array
		
		if (dpto==null)//no existe el dpto en el array de dpto
			System.out.println("No se ha dado de alta el departamento");
		
		else {//existe el dpto
			
			System.out.println(dpto.toString());
			dpto.visualizarEmp(); 
		
		}
	}
		
	/************************************BUSCAR UN EMPLEADO EN UN DPTO**************************************/
	
	public void buscrEmpDpto(){
		
		int codDpto, numeroEmp, codEmp;
		Departamento dpto;
		String resp;
	
		do {
			System.out.println("Introduce codigo del departamento (1-4)");
			codDpto=LeerTeclado.readInteger();				
		}
		while (codDpto<1||codDpto>4);
		
		dpto=arrayDpto[codDpto-1];//guardo el departamento que esta en el array
		
		if (dpto==null)//no existe el dpto en el array de dpto
			System.out.println("No se ha dado de alta el departamento");
		
		else {//existe el dpto
			if (dpto.contadorEmpleados()>0){//si hay empleados en el dpto

				System.out.println("Se va a dar a buscar un empleado en el departamento "+dpto.toString());
				numeroEmp=dpto.getNumeroEmp();
				//guardo el nºde empleados del departamento introducido

				do{
					System.out.println("Búsqueda del empleado");
					do {
						System.out.println("Introduce codigo del empleado (1-"+numeroEmp+")");
						codEmp=LeerTeclado.readInteger();
					}
					while (codEmp<1||codEmp>numeroEmp);

					if (dpto.buscarCodEmp(codEmp)==null)//existe el codigo de empleado
						System.out.println("El empleado no existe ");

					else System.out.println(dpto.buscarCodEmp(codEmp).toString());

					System.out.println("¿Deseas buscar otro empleado en el departamento(s/n)");
					resp=LeerTeclado.readString();
				}

				while (resp.toLowerCase().equals("s"));	
			}

			 
		}
	}
	
	/***********************************EMPLEADO DE MAYOR SUELDO EN EL DPTO**************************/
	
	public void mayorSueldoDpto(){

		int codDpto;
		Departamento dpto;
		String resp;
		do {

			do {
				System.out.println("Introduce codigo del departamento (1-4)");
				codDpto=LeerTeclado.readInteger();				
			}
			while (codDpto<1||codDpto>4);

			dpto=arrayDpto[codDpto-1];//guardo el departamento que esta en el array

			if (dpto==null)//no existe el dpto en el array de dpto
				System.out.println("No se ha dado de alta el departamento");

			else {//existe el dpto

				System.out.println("Se va a dar a buscar el empleado de mayor sueldo en el departamento "+dpto.toString());
				if (dpto.contadorEmpleados()==0)//no hay empleados
					System.out.println("El departamento no tiene empleados");
				else
					System.out.println("El empleado de mayor sueldo es "+dpto.mayorSueldoDpto().toString());

			}
			System.out.println("¿Deseas buscar en otro departamento(s/n)");
			resp=LeerTeclado.readString();
		}

		while (resp.toLowerCase().equals("s"));	
	}

	public void mayorSueldo(){
		
		double max=0;
		Empleado empMaxEmpresa=null, empMaxDpto;		
		Departamento dpto;
		
		for (int i=0;i<arrayDpto.length;i++){
			if (arrayDpto[i]!=null){
				dpto=arrayDpto[i];
				if (dpto.contadorEmpleados()>0){
					empMaxDpto=dpto.mayorSueldoDpto();
					if (max<empMaxDpto.getSueldo()){
						max=empMaxDpto.getSueldo();
						empMaxEmpresa=empMaxDpto;
					}
				}

			}			
		}
		System.out.println("El empleado de mayor sueldo de la empresa es "+empMaxEmpresa.toString());
	}
}
	




			
		
		
	
	
	

