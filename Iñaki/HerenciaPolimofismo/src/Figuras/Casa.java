package Figuras;

import Interfaces.Geometria;

public class Casa implements Geometria {
	
	private String direccion;
	private int habitaciones;
	private float perimetro;
	private float superficie;
	
	
	public Casa(String direccion, int habitaciones, float perimetro, float superficie) {
		this.direccion = direccion;
		this.habitaciones = habitaciones;
		this.perimetro = perimetro;
		this.superficie = superficie;
	}

	
	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public int getHabitaciones() {
		return habitaciones;
	}


	public void setHabitaciones(int habitaciones) {
		this.habitaciones = habitaciones;
	}


	public float getPerimetro() {
		return perimetro;
	}


	public void setPerimetro(float perimetro) {
		this.perimetro = perimetro;
	}


	public float getSuperficie() {
		return superficie;
	}


	public void setSuperficie(float superficie) {
		this.superficie = superficie;
	}


	public float calcularArea() {
		return superficie;
	}
	
	public float calcularPerimetro() {
		return perimetro;
	}
	

}
