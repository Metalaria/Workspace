package SolucionesObjetosBasicos.biblioteca;

public class Autor {
	
	private String nombre;
	private String nacionalidad;
	private int annoNacim;
	private int annoDefunc;
	
	public Autor(String nombre, String nacionalidad, int annoNacim) {
		this.nombre = nombre;
		this.nacionalidad = nacionalidad;
		this.annoNacim = annoNacim;	
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public int getAnnoNacim() {
		return annoNacim;
	}

	public void setAnnoNacim(int annoNacim) {
		this.annoNacim = annoNacim;
	}

	public int getAnnoDefunc() {
		return annoDefunc;
	}
	
	public void fallecer (int annoDefunc){
		this.annoDefunc=annoDefunc;
	}

	@Override
	public String toString() {
		return "Autores [nombre=" + nombre + ", nacionalidad=" + nacionalidad
				+ ", annoNacim=" + annoNacim + ", annoDefunc=" + annoDefunc
				+ "]";
	}

	
	
	

}
