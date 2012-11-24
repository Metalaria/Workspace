package Vehiculos;

public class Coche extends Vehiculo {

	protected String color;
	protected int numeroPasajeros;
	protected boolean descaptable;
	
	public Coche (String marca, String matricula, double autonomia, String color, int numeroPasajeros, boolean descapotable){
		super (marca,matricula,4,autonomia);
		this.color=color;
		this.numeroPasajeros=numeroPasajeros;
		this.descaptable=descapotable;
	}
	
	public void pintar(String color){
		this.color=color;
	}
	
	public String listar(){
		String salida;
		salida=super.listar();
		salida+="Color: "+color+"    Numero Pasajeros: "+numeroPasajeros+"\n";
		salida+="Descapotable: "+descaptable+"\n";
		
		return salida;
	}
}
