package Ejercicio2;

public class Palacio extends Vivienda {
	protected int numHabitaciones;

	public Palacio(double metrosCuadrados, String calle, int numero, int numHabitaciones) {
		super(metrosCuadrados, calle, numero);
		this.numHabitaciones = numHabitaciones;
	}

	public Palacio() {
	}

	public int getNumHabitaciones() {
		return numHabitaciones;
	}

	public void setNumHabitaciones(int numHabitaciones) {
		this.numHabitaciones = numHabitaciones;
	}

	@Override
	public String toString() {
		return "Palacio [numHabitaciones=" + numHabitaciones
				+ ", metrosCuadrados=" + metrosCuadrados + ", calle=" + calle
				+ ", numero=" + numero + "]";
	}
	
}
