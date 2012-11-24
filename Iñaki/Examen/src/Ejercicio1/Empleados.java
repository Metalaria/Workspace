package Ejercicio1;

public class Empleados extends Personal {
	
	protected double sueldo;
	
	public Empleados(String nombre, double sueldoBase, Departamento departamento){
		super(nombre,sueldoBase,departamento);
		int numPersonal=codigo;
		codigo++;
		setNumPersonal(numPersonal);
		String codigoPersonal;
		if(departamento.getNombre().compareTo("informatica")==0){
			codigoPersonal="EMP"+numPersonal+"INF";
			setCodigoPersonal(codigoPersonal);
		}
		else{
			codigoPersonal="EMP"+numPersonal+"ADM";
			setCodigoPersonal(codigoPersonal);
		}
		
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	public double calcularSueldo(){
		sueldo=sueldoBase;
		return sueldo;
	}
	
	public boolean evaluar(Calculable cal){
		if(sueldo>){
			
		}
	}
	

}
