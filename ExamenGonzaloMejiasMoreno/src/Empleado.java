
public class Empleado extends Personal {

	protected String nombre;
	protected int numEmpersonal;
	protected String codigoPersonal;
	protected Departamento departamento;
	protected double sueldoBase;
	
	public Empleado(String nombre, int numEmpersonal, String codigoPersonal,
			Departamento departamento, double sueldoBase) {
		super();
		System.out.println("Itronduzca el nombre del empleado");
		this.nombre = LeerTeclado.readString();
		System.out.println("introduzca el código de personal del empleado");
		this.numEmpersonal = LeerTeclado.readInteger();
		this.codigoPersonal = "EMP"+numEmpersonal;
		this.departamento = departamento;
		this.sueldoBase =calcularSueldo();
	}

	public Empleado() {
		super();
		System.out.println("Itronduzca el nombre del empleado");
		this.nombre = LeerTeclado.readString();
		System.out.println("introduzca el código de personal del empleado");
		this.numEmpersonal = LeerTeclado.readInteger();
		this.codigoPersonal = "EMP"+numEmpersonal;
		this.departamento = departamento;
		this.sueldoBase =calcularSueldo();
	}

	public double calcularSueldo() {
		sueldoBase=1000;
		return sueldoBase;
	}

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

	
	public String toString() {
		return "Empleado [nombre=" + nombre + ", numEmpersonal="
				+ numEmpersonal + ", codigoPersonal=" + codigoPersonal
				+ ", departamento=" + departamento + ", sueldoBase="
				+ sueldoBase + "]";
	}

	
	public void aumentar(int cantidad) {
		System.out.println("Introduzca el aumento del sueldo base");
		double aumento=LeerTeclado.readDouble();
		double sueldoNuevo=sueldoBase+aumento;
	}

	@Override
	public boolean evaluar(Calculable cal) {
		System.out.println("Introduce la cantidad a aumentar");
		int cantidad=LeerTeclado.readInteger();
		double sueldoNuevo=sueldoBase+cantidad;
		if (sueldoNuevo>sueldoBase)
		return true;
		else return false;
	}

	
}
