package Empresa;

public class Obrero extends Empleado {

	protected Jefe superior;
	
	public Obrero(String nombre, int edad, double sueldo,Jefe superior){
		super(nombre,edad,sueldo);
		this.superior=superior;
	}
	
}
