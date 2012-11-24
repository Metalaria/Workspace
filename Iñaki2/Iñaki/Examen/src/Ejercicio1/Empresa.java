package Ejercicio1;

import java.util.Vector;

public class Empresa {
	
	private String nombreEmpresa;
	private Vector <Personal> listaPersonal;
	private Vector <Calculable> listaCalculable;
	
	public Empresa(String nombreEmpresa){
		this.nombreEmpresa=nombreEmpresa;
		listaPersonal= new Vector <Personal>();
		listaCalculable= new Vector <Calculable>();
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}
	
	public void insertarListaCalculable(Calculable cal){
		listaCalculable.add(cal);
	}
	public void contratar(Departamento dpto){
		boolean continuar=true;
		System.out.println("Introduce el numero personal");
		int numero=LeerTeclado.readInteger();
		for(int i=0;i<listaPersonal.size();i++){
			if(listaPersonal.elementAt(i).getNumPersonal()==numero){
				continuar=false;
				System.out.println("Ese empleado ya existe");
			}
		}
		if(continuar==true){
			String nombre;
			double sueldoBase;
			int productividad;
			System.out.println("Que desea dar de alta ejecutivo o empleado:  1-Ejecutivo   2-Empleado");
			int opcion=LeerTeclado.readInteger();
			if(opcion==1){
				System.out.println("Introduca nombre ejecutivo.");
				nombre=LeerTeclado.readString();
				System.out.println("Introduca sueldo Base.");
				sueldoBase=LeerTeclado.readDouble();
				System.out.println("Introduca productividad");
				productividad=LeerTeclado.readInteger();
				Ejecutivos eje= new Ejecutivos(nombre, sueldoBase, dpto, productividad);
				listaPersonal.add(eje);
				listaCalculable.add(eje);
			}
			else{
				System.out.println("Introduca nombre empleado.");
				nombre=LeerTeclado.readString();
				System.out.println("Introduca sueldo Base.");
				sueldoBase=LeerTeclado.readDouble();
				Empleados emp=new Empleados(nombre, sueldoBase, dpto);
				listaPersonal.add(emp);
				listaCalculable.add(emp);
			}
		}
	}
	public void ascender(){
		boolean continuar=true;
		System.out.println("Introduce el numero personal");
		int numero=LeerTeclado.readInteger();
		for(int i=0;i<listaPersonal.size();i++){
			if(listaPersonal.elementAt(i).getNumPersonal()==numero){
				if(listaPersonal.elementAt(i) instanceof Empleados){
					System.out.println("Introduca su productividad");
					int productividad=LeerTeclado.readInteger();
					Ejecutivos eje=new Ejecutivos(listaPersonal.elementAt(i).getNombre(), listaPersonal.elementAt(i).getSueldoBase(), listaPersonal.elementAt(i).getDepartamento(), productividad, listaPersonal.elementAt(i).getNumPersonal());
				}
				
			}
		}
	}
	public void incrementar(){
		for(int i=0;i<listaPersonal.size();i++){
			System.out.println(listaCalculable.toString());
		}
	}

}

