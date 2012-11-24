package Ejercicio1;

public class Departamento implements Calculable {
	private String nombre;
	private double presupuesto;
	
	public Departamento (String nombre, double presupuesto){
		this.nombre=nombre;
		this.presupuesto=presupuesto;
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
	
	public String toString (){
		String salida;
		salida="Nombre departamento: "+nombre+"\n";
		salida+="Presupuesto: "+presupuesto+"€\n";
		return salida;
	}
	
	public void aumentar(int cantidad){
		presupuesto=presupuesto+cantidad;
	}
}
