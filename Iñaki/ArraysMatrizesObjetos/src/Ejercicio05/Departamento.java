package Ejercicio05;

public class Departamento {
	
	private int codigoDpto;
	private static int contador=0;
	private String nombreDpto;
	private int numeroEmpleados;
	private Empleado arrayEmpleados[];
	private  int contadorEmp=0;
	
	Empleado empleado;
	
	public Departamento(String nombreDpto,int numeroEmpleados){
		
		codigoDpto=contador;
		this.nombreDpto=nombreDpto;
		this.numeroEmpleados=numeroEmpleados;
		arrayEmpleados=new Empleado [numeroEmpleados];
		contador++;
	}
	
	public void altaEmpleado(String nombre, double sueldo){
		
		if(contadorEmp<arrayEmpleados.length){
			arrayEmpleados[contadorEmp]=new Empleado(contadorEmp,nombre, sueldo);
			contadorEmp++;
		}
		else{
			System.out.println("En este departamento no se pueden introducir mas empleados.");
		}
		
		
	}

	public String  visualizarDpto (){
		String salida="Departamento de: "+nombreDpto+"\n";
		salida+="Numero de empleados "+numeroEmpleados+"\n";
		salida+="Empleados:\n";
		salida+="-------------------------------\n";
		for(int i=0;i<arrayEmpleados.length;i++){
			if(arrayEmpleados[i]!=null){
				salida=salida+arrayEmpleados[i].visualizarEmp();
			}
			else break;
		}
		
		
		return salida;
	}

	public String  buscarEmpDep (int i){
		String salida;
		salida=""+arrayEmpleados[i].visualizarEmp();
		return salida;
	}
	
	public String mayorSueldo (){
		String salida="";
		double sueldo=0;
		for(int i=0;i<arrayEmpleados.length;i++){
			if(arrayEmpleados[i]!=null){
				if(sueldo<arrayEmpleados[i].sueldo()){
					sueldo=arrayEmpleados[i].sueldo();
					salida=arrayEmpleados[i].visualizarEmp();
				}
			}
		}
		
		return salida;
	}
	
}
