package agenda;

public class Lugar {
	private String nombre;
	private String direccion;
	private String telefono;

	public Lugar(String nombre, String direccion, String telefono) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String toString() {
		return "Lugar [nombre=" + nombre + ", direccion=" + direccion
				+ ", telefono=" + telefono + "]";
	}

	
}
