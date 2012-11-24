package Ejercicio05;

public class Empleado {

	private int codigoEmp;
	private String nombreEmp;
	private double sueldo;
	
	public Empleado(int codigoEmp,String nombreEmp,double sueldo){
		this.codigoEmp=codigoEmp;
		this.nombreEmp=nombreEmp;
		this.sueldo=sueldo;
	}
	
	public String  visualizarEmp (){
		String salida="Codigo:"+codigoEmp+"\n";
		salida+="Nombre:"+nombreEmp+"\n";
		salida+="Sueldo:"+sueldo+" €\n";
		salida+="------------------\n";
		
		return salida;
	}
	public double sueldo(){
		return sueldo;
	}
	
}


