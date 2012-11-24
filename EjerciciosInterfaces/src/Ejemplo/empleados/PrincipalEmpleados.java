package Ejemplo.empleados;

import java.util.List;
import java.util.Vector;

public class PrincipalEmpleados {
	public static void main(String[] args) {
		
		Vector <Empleado> emp = new Vector <Empleado>();
		
		Empleado f1 = new Fijo ("Paco", "90348763-G", 628847102, 860);
		Empleado f3 = new Fijo ("Pepe", "123456-Ñ", 679863644, 860);
		Empleado f2 = new Fijo ("Maria", "28902824-H", 603411914, 790);
		Empleado h1 = new PorHoras ("Jose", "93809830-L", 698329821, 10, 25);
		Empleado h2 = new PorHoras ("Sonia", "38938032-S", 669832824, 13, 30);
		
		emp.add(f1);
		emp.add(f2);
		emp.add(h1);
		emp.add(h2);
		
		visualizar(emp);
		verSalario(emp);
	}
	
	//Metodos
	
	public static void visualizar (Vector<Empleado> emp){
		for(int i=0; i<((List<Empleado>) emp).size(); i++)
			System.out.println(emp.elementAt(i).toString());
	}
	
	public static void verSalario (Vector<Empleado> emp) {
		
		for(int i=0; i<((List<Empleado>) emp).size(); i++)
		{
			if(emp.elementAt(i) instanceof Fijo)
				((Fijo) emp.elementAt(i)).calcularSalario();
			if(emp.elementAt(i) instanceof PorHoras)
				((PorHoras) emp.elementAt(i)).calcularSalario();
		}
	}
}