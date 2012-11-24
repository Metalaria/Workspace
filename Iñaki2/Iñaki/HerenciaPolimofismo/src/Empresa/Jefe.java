package Empresa;

import java.util.Vector;

public class Jefe extends Empleado {
	
	protected int codigo;
	protected static int contador=1;
	protected Vector <Obrero> bajoMando;
	
	public Jefe(String nombre, int edad, double sueldo){
		super(nombre,edad,sueldo);
		codigo=contador;
		contador++;
		bajoMando = new Vector <Obrero>();
		codigoEmpleado="J"+codigo;
	}

}
