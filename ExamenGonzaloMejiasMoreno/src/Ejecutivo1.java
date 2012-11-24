
public class Ejecutivo1 extends Personal {

	protected String nombre;
	protected int numEmpersonal;
	protected String codigoPersonal;
	protected Departamento departamento;
	protected double sueldoBase=1000;
	protected int productividad;
	protected double sueldoEjecutivo;
	
	public Ejecutivo1(String nombre, int numEmpersonal, String codigoPersonal, Departamento departamento, double sueldoBase, int productividad) {
		super ();
		System.out.println("introduce el nombre del empleado");
		this.nombre = LeerTeclado.readString();
		System.out.println("¿Código del empleado?");
		this.numEmpersonal = LeerTeclado.readInteger();
		this.codigoPersonal = "EJE"+numEmpersonal;
		this.departamento = departamento;
		this.sueldoBase = 1000;
		this.productividad= LeerTeclado.readInteger();
		this.sueldoEjecutivo = calcularSueldo(); // El sueldo viene definido por el método calcularSueldo()
	}
	public Ejecutivo1(Object nombre2, int numEmpersonal2,
			Object codigoPersonal2, Object departamento2, int sueldoBase2) {
		// TODO Auto-generated constructor stub
	}
	public Ejecutivo1(Object nombre2, Object object, Object codigoPersonal2,
			Object departamento2, Object object2, Object object3) {
		super ();
		System.out.println("introduce el nombre del empleado");
		this.nombre = LeerTeclado.readString();
		System.out.println("¿Código del empleado?");
		this.numEmpersonal = LeerTeclado.readInteger();
		this.codigoPersonal = "EJE"+numEmpersonal;
		this.departamento = departamento;
		this.sueldoBase = 1000;
		this.productividad= LeerTeclado.readInteger();
		this.sueldoEjecutivo = calcularSueldo(); // El sueldo viene definido por el método calcularSueldo()
		
	}
	
	public Ejecutivo1() {
		super ();
		System.out.println("introduce el nombre del empleado");
		this.nombre = LeerTeclado.readString();
		System.out.println("¿Código del empleado?");
		this.numEmpersonal = LeerTeclado.readInteger();
		this.codigoPersonal = "EJE"+numEmpersonal;
		this.departamento = departamento;
		this.sueldoBase = 1000;
		System.out.println("Introduzca ahora la productividad");
		this.productividad= LeerTeclado.readInteger();
		this.sueldoEjecutivo = calcularSueldo(); // El sueldo viene definido por el método calcularSueldo()
	}
	// Método para calcular el sueldo del ejectivo
	public double calcularSueldo () {
		
		return sueldoBase+productividad;
	}
	
	// Métodos get() y set()
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getNumEmpersonal() {
		return numEmpersonal;
	}
	public void setNumEmpersonal(int numEmpersonal) {
		this.numEmpersonal = numEmpersonal;
	}
	public String getCodigoPersonal() {
		return codigoPersonal;
	}
	public void setCodigoPersonal(String codigoPersonal) {
		this.codigoPersonal = codigoPersonal;
	}
	public Departamento getDepartamento() {
		return departamento;
	}
	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	public double getSueldoBase() {
		return sueldoBase;
	}
	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}
	public double getSueldoEjecutivo() {
		return sueldoEjecutivo;
	}
	public void setSueldoEjecutivo(double sueldoEjecutivo) {
		this.sueldoEjecutivo = sueldoEjecutivo;
	}

	
	public String toString() {
		return "Ejecutivo1 [nombre=" + nombre + ", numEmpersonal="
				+ numEmpersonal + ", codigoPersonal=" + codigoPersonal
				+ ", departamento=" + departamento + ", sueldoBase="
				+ sueldoBase + ", sueldoEjecutivo=" + sueldoEjecutivo + "]";
	}
	@Override
	public void aumentar(int cantidad) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean evaluar(Calculable cal) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
