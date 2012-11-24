package Ejercicio1;

public class Personal implements Calculable {

	protected String nombre;
	protected String codigoPersonal;
	protected double sueldoBase;
	protected Departamento departamento;
	protected static int codigo=0;
	protected int numPersonal;

	public Personal(String nombre, double sueldoBase, Departamento departamento){
		this.nombre=nombre;
		this.sueldoBase=sueldoBase;
		this.departamento=departamento;
	}
	public Personal(String nombre, double sueldoBase, Departamento departamento,int numPersonal){
		this.nombre=nombre;
		this.sueldoBase=sueldoBase;
		this.departamento=departamento;
		this.numPersonal=numPersonal;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigoPersonal() {
		return codigoPersonal;
	}

	public void setCodigoPersonal(String codigoPersonal) {
		this.codigoPersonal = codigoPersonal;
	}

	public double getSueldoBase() {
		return sueldoBase;
	}

	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	
	public int getNumPersonal() {
		return numPersonal;
	}

	public void setNumPersonal(int numPersonal) {
		this.numPersonal = numPersonal;
	}
	
	public String toString(){
		String salida;
		salida="Nombre: "+nombre+"\n";
		salida+="Codigo Personal: "+codigoPersonal+"\n";
		salida+="Departamento: "+departamento+"\n";
		return salida;
	}
	public void aumentar(int cantidad){
		sueldoBase=sueldoBase+cantidad;
	}
	public boolean evaluar(Calculable cal){
		if(sueldo>){
			
		}
	}
}
