public class Departamento implements Calculable {
	protected String nombre;
	protected double presupuesto;
	public Departamento(String nombre, double presupuesto) {
		super();
		System.out.println("Introuduce el nombre del departamento");
		this.nombre = LeerTeclado.readString();
		System.out.println("Introduce el presupuesto del departamento");
		this.presupuesto = LeerTeclado.readDouble();
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPresupuesto() {
		return presupuesto;
	}
	public void setPresupuesto(double presupuesto) {
		this.presupuesto = presupuesto;
	}
	
	@Override
	public String toString() {
		return "Departamento [nombre=" + nombre + ", presupuesto="
				+ presupuesto + "]";
	}
	
	public void aumentar(int cantidad) {
		System.out.println("Introduzca el aumento del presupuesto");
		double aumento=LeerTeclado.readDouble();
		double presupuestoNuevo=presupuesto+aumento;
	}
	
	public boolean evaluar(Calculable cal) {
		System.out.println("Introduce la cantidad a aumentar");
		int cantidad=LeerTeclado.readInteger();
		double sueldoNuevo=presupuesto+cantidad;
		if (sueldoNuevo>presupuesto)
		return true;
		else return false;
	}
	
}
