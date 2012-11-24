package HerenciaVector;
import java.util.Collection;
import java.util.Vector;
import Ejercicio2.LeerTeclado;

public class Empleados {
	protected String nombre;
	protected int edad;
	protected double sueldo;
	protected String codigoEmp;
	
	public Empleados() {
		super();
		System.out.println("Nombre y apellidos");
		this.nombre = LeerTeclado.readString();
		System.out.println("Edad");
		this.edad = LeerTeclado.readInteger();
		System.out.println("Sueldo");
		this.sueldo = LeerTeclado.readDouble();
		this.codigoEmp = rellenarCodigo();
	}
	@Override
	public String toString() {
		return "Empleados [nombre=" + nombre + ", edad=" + edad + ", sueldo="
				+ sueldo + ", codigoEmp=" + codigoEmp + "]";
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
	public String getCodigoEmp() {
		return codigoEmp;
	}
	public void setCodigoEmp(String codigoEmp) {
		this.codigoEmp = codigoEmp;
	}
	
	public boolean esJefe(){
		System.out.println("¿El empleado es un jefe? (s/n)");
		String resp=LeerTeclado.readString();
		if (resp.equalsIgnoreCase("s")){
			return true;
		}else return false;
	}
	public String rellenarCodigo(){
		int n=0;
		int j=0;
		String jefe="J";
		String obrero="O";
		if (esJefe()==true)
			return "El codigo de este jefe es "+jefe+n++;
		else return"El codigo de este obrero es "+obrero+j++;
	}
	public void rellenarVector(Empleados emp){
		Vector <Empleados> vempleados;
			vempleados=new Vector <Empleados>();
		if (emp.esJefe()==false){
				vempleados.add(emp);
		}
		System.out.println(vempleados.toString());
	}
}
