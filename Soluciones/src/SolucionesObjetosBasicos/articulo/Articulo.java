package SolucionesObjetosBasicos.articulo;

public class Articulo {
	private static int codigo;
	public String nombre;
	private String color;
	private double precio;
	
	public Articulo (){
		codigo++;
	}

	public Articulo(String nombre, String color, double precio) {
		codigo++;
		this.nombre = nombre;
		this.color = color;
		this.precio = precio;
	}

	public Articulo(String nombre, String color) {
		codigo++;
		this.nombre = nombre;
		this.color = color;
	}

	public static int getCodigo() {
		return codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public void incrementarPrecio (double increm){
		this.precio+=increm;
	}
	
	public void rebajarPrecio(){
		precio-=precio*0.10;
	}

	public String toString() {
		return "Articulo [codigo="+codigo+ ", nombre=" + nombre + ", color=" + color + ", precio="
				+ precio + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
}
