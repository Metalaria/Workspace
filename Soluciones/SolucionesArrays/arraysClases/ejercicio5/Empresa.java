package arraysClases.ejercicio5;

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
		int codDpto, numEmp;
		String nbDpto;
		Departamento dpto;

		do { //también se podría haber hecho con un for (int i=0; i<4; i++)

			do{ //valida que el codigo de departamento sea correcto
				System.out.println("Introduce codigo de departamento (entre 0 y 3)");
				codDpto=LeerTeclado.readInteger();
			}
			while (codDpto<0||codDpto>3);
			

			if (arrayDpto[codDpto]!=null) /*ya esta ocupada la posicion del array 
			que indica el código de dpto  */
				System.out.println("El departamento ya está dado de alta ");
			
			else //no esta ocupada esa posicion del array
			{
				System.out.println("Introduce nombre de departamento");
				nbDpto=LeerTeclado.readString();
				System.out.println("Introduce el número de empleados del departamento");
				numEmp=LeerTeclado.readInteger();
				dpto=new Departamento(codDpto,nbDpto,numEmp);
				arrayDpto[codDpto]=dpto;//guarda el objeto dpto en el array en la posicion que indica codDpto
				System.out.println("Se ha dado de alta el departamento "+dpto.toString());
			}

			System.out.println("¿Deseas dar de alta otro departamento(s/n)");
			resp=LeerTeclado.readString();

		}

		while (resp.toLowerCase().equals("s"));

	}

	/************************************ASIGNAR EMPLEADO AL DPTO**************************************/

	public void asignarEmpDpto(){
		
		System.out.println("Asignación de un empleado a un departamento");
		
		String resp;
		int codDpto,codEmp;
		String nombre;
		double sueldo;
		int numeroEmp;
		Departamento dpto;
		Empleado emp;
		
			do {
				System.out.println("Introduce codigo del departamento (0-3)");
				codDpto=LeerTeclado.readInteger();				
			}
			while (codDpto<0||codDpto>3);
			
			dpto=arrayDpto[codDpto];//guardo el departamento que esta en el array
			
			if (dpto==null)//no existe el dpto en el array de dpto
				System.out.println("No se ha dado de alta el departamento");
			
			else {//existe el dpto
				
				System.out.println("Se va a dar de alta un empleado en el departamento "+dpto.toString());
				numeroEmp=dpto.getNumeroEmp()-1;
				//guardo el nºde empleados del departamento introducido
				
				do{
				System.out.println("Alta del empleado");
				do {
					System.out.println("Introduce codigo del empleado (0-"+numeroEmp+")");
					codEmp=LeerTeclado.readInteger();
				}
				while (codEmp<0||codEmp>numeroEmp);
				
				if (dpto.buscarEmp(codEmp)!=null)//==true)//existe el codigo de empleado
					System.out.println("El empleado ya existe ");
				
				else {
					
					System.out.println("Introduce nombre del empleado");
					nombre=LeerTeclado.readString();
					System.out.println("Introduce sueldo del empleado");
					sueldo=LeerTeclado.readDouble();
					
					emp=new Empleado(codEmp,nombre,sueldo);
					dpto.asignarEmp(emp);//asigna el empleado al dpto
								
				}
				
				System.out.println("¿Deseas dar de alta otro empleado en el departamento(s/n)");
				resp=LeerTeclado.readString();
			}
			
			while (resp.toLowerCase().equals("s"));	
		}

		
		}
	
	/************************************LISTAR DPTO**************************************/
		
	public void listarDpto(){
		
		int codDpto;
		Departamento dpto;
		
		do {
			System.out.println("Introduce codigo del departamento (0-3)");
			codDpto=LeerTeclado.readInteger();				
		}
		while (codDpto<0||codDpto>3);
		
		dpto=arrayDpto[codDpto];//guardo el departamento que esta en el array
		
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
			System.out.println("Introduce codigo del departamento (0-3)");
			codDpto=LeerTeclado.readInteger();				
		}
		while (codDpto<0||codDpto>3);
		
		dpto=arrayDpto[codDpto];//guardo el departamento que esta en el array
		
		if (dpto==null)//no existe el dpto en el array de dpto
			System.out.println("No se ha dado de alta el departamento");
		
		else {//existe el dpto
			
			System.out.println("Se va a dar a buscar un empleado en el departamento "+dpto.toString());
			numeroEmp=dpto.getNumeroEmp()-1;
			//guardo el nºde empleados del departamento introducido
			
			do{
			System.out.println("Búsqueda del empleado");
			do {
				System.out.println("Introduce codigo del empleado (0-"+numeroEmp+")");
				codEmp=LeerTeclado.readInteger();
			}
			while (codEmp<0||codEmp>numeroEmp);
			
			if (dpto.buscarEmp(codEmp)==null)//existe el codigo de empleado
				System.out.println("El empleado no existe ");
			
			else System.out.println(dpto.buscarEmp(codEmp).toString());
				
			System.out.println("¿Deseas buscar otro empleado en el departamento(s/n)");
			resp=LeerTeclado.readString();
		}
		
		while (resp.toLowerCase().equals("s"));	
			 
		}
	}
	
	/***********************************EMPLEADO DE MAYOR SUELDO EN EL DPTO**************************/
	
	public void mayorSueldoDpto(){

		int codDpto;
		Departamento dpto;
		String resp;
		do {

			do {
				System.out.println("Introduce codigo del departamento (0-3)");
				codDpto=LeerTeclado.readInteger();				
			}
			while (codDpto<0||codDpto>3);

			dpto=arrayDpto[codDpto];//guardo el departamento que esta en el array

			if (dpto==null)//no existe el dpto en el array de dpto
				System.out.println("No se ha dado de alta el departamento");

			else {//existe el dpto

				System.out.println("Se va a dar a buscar el empleado de mayor sueldo en el departamento "+dpto.toString());
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
				empMaxDpto=dpto.mayorSueldoDpto();
				if (max<empMaxDpto.getSueldo()){
					max=empMaxDpto.getSueldo();
					empMaxEmpresa=empMaxDpto;
				}
			}			
		}
		System.out.println("El empleado de mayor sueldo de la empresa es "+empMaxEmpresa.toString());
	}
}
	




			
		
		
	
	
	

