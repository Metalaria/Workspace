package arrayParte1;

public class Cancion {
	
	private int codigo;
	private String titulo;
	private double duracion;
	private static int contador=0;
	
	public Cancion (String titulo, double duracion){
		contador++;
		codigo=contador;
		this.titulo=titulo;
		this.duracion=duracion;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public double getDuracion() {
		return duracion;
	}

	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}

	public static int getContador() {
		return contador;
	}

	public String toString() {
		return "Cancion [codigo=" + codigo + ", titulo=" + titulo
				+ ", duracion=" + duracion + "]";
	}
	
	
	

}
