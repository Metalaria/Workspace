package Empresa;

public abstract class Empleado {
	
	protected String nombre;
	protected int edad;
	protected double sueldo;
	protected String codigoEmpleado;
	
	public Empleado(String nombre, int edad, double sueldo){
		this.nombre=nombre;
		this.edad=edad;
		this.sueldo=sueldo;
		}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public String getCodigoEmpleado() {
		return codigoEmpleado;
	}

	public void setCodigoEmpleado(String codigoEmpleado) {
		this.codigoEmpleado = codigoEmpleado;
	}
	
	

}
