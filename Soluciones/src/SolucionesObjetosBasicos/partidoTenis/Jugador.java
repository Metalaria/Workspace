package SolucionesObjetosBasicos.partidoTenis;

public class Jugador {
	private String nombre;
	private double punt;
	
	public Jugador(String nombre,double punt){
		this.nombre=nombre;
		this.punt=punt;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPunt() {
		return punt;
	}

	public void setPunt(double punt) {
		this.punt = punt;
	}
	
	public void incremPunt(){
		punt++;
	}

	
	

}
