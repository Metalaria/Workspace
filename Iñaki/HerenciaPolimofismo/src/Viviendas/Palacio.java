package Viviendas;

public class Palacio extends Vivienda {
	
	protected int numeroHabitaciones;

	public Palacio(){
		
	}
	
	public Palacio (double metrosCuadrados,String calle,int numero,int numeroHabitaciones){
		super(metrosCuadrados,calle,numero);
		this.numeroHabitaciones=numeroHabitaciones;
	}

	public int getNumeroHabitaciones() {
		return numeroHabitaciones;
	}

	public void setNumeroHabitaciones(int numeroHabitaciones) {
		this.numeroHabitaciones = numeroHabitaciones;
	}
	
	public String toString() {
		String salida;
		salida=super.toString();	
		salida+="Numero Habitaciones: "+numeroHabitaciones+"\n";
		return salida;
	}
}
