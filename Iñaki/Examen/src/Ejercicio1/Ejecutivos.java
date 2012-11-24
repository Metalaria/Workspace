package Ejercicio1;

public class Ejecutivos extends Personal {
	
	int productividad;
	double sueldo;
	
	public Ejecutivos(String nombre, double sueldoBase, Departamento departamento,int productividad){
		super(nombre,sueldoBase,departamento);
		int numPersonal=codigo;
		codigo++;
		setNumPersonal(numPersonal);
		String codigoPersonal;
		if(departamento.getNombre().compareTo("informatica")==0){
			codigoPersonal="EJE"+numPersonal+"INF";
			setCodigoPersonal(codigoPersonal);
		}
		else{
			codigoPersonal="EJE"+numPersonal+"ADM";
			setCodigoPersonal(codigoPersonal);
		}
		sueldo=sueldoBase+productividad;
	}
	
	public Ejecutivos (String nombre, double sueldoBase, Departamento departamento,int productividad,int numPersonal){
		super(nombre,sueldoBase,departamento,numPersonal);
		String codigoPersonal;
		if(departamento.getNombre().compareTo("informatica")==0){
			codigoPersonal="EJE"+numPersonal+"INF";
			setCodigoPersonal(codigoPersonal);
		}
		else{
			codigoPersonal="EJE"+numPersonal+"ADM";
			setCodigoPersonal(codigoPersonal);
		}
		sueldo=sueldoBase+productividad;
	}
	
	public double calcularSueldo(){
		sueldo=sueldoBase+productividad;
		return sueldo;
	}
	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

}
