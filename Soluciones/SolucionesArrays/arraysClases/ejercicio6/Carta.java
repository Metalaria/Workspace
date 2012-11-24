package arraysClases.ejercicio6;

public class Carta {
	
	private String palo;
	private String nombre;
	private double valor;
	
	
	
	public Carta(String palo, String nombre, double valor) {
		this.palo = palo;
		this.nombre = nombre;
		this.valor = valor;
	}
	
	
	public double getValor() {
		return valor;
	}


	public String toString() {
		return "La carta que has obtenido es " + nombre + " de " +  palo+ " y su  valor es "+ valor;
	}


	
	
	
	
	
	

}
