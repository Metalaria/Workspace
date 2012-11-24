package Empresa;

import java.util.List;
import java.util.Vector;

import Empleados.Empleado;

public class Empresa {
	
	protected Vector <Empleado> empleados;
	
	public Empresa (){
		empleados = new Vector <Empleado>();
		
	}
	
	public void nuevoEmpleado(){
		System.out.println("Introduce Nombre del Nuevo Empleado;");
		String nombre=LeerTeclado.readString();
		for(i=0;i<((List<Empleado>) empleados).size())
	}

}
