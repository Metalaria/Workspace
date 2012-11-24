package Ejercicio2;

public class Casa implements Geometria {
	/*3)	Crear una clase Casa  con atributos 
	dirección, habitaciones, superficie y perímetro que implemente el interfaz Geometría.*/
	
	private String direccion;
	private int habitaciones;
	double anchura, longitud;
	
	
	public Casa(String direccion, int habitaciones, double anchura,
			double longitud) {
		super();
		this.direccion = direccion;
		this.habitaciones = habitaciones;
		this.anchura = anchura;
		this.longitud = longitud;
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

	public double getAnchura() {
		return anchura;
	}

	public void setAnchura(double anchura) {
		this.anchura = anchura;
	}

	public double getLongitud() {
		return longitud;
	}

	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}

	public double calcularArea() {
		double resultado;
		resultado= anchura * longitud;
		return resultado;
		
	}

	@Override
	public double calcularPerimetro() {
		// TODO Auto-generated method stub
		
		double resultado;
		resultado=(float) ((2*anchura)+(2* longitud));
		return resultado;
	}

	@Override
	public String toString() {
		
		return  "______________Casa _________________"+
		"/nDireccion=" + direccion + "/nhabitaciones="
		+ habitaciones + "/nanchura=" + anchura +
		"/nlongitud="+ longitud + 
		"/nPerimetro= "+ calcularPerimetro()+ 
		"/nArea = "+ calcularArea() ;
	}
	
	

}
