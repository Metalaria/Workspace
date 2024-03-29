import java.io.Serializable;

@SuppressWarnings("serial")
public class Lugar implements Serializable {
	private String nombre;
	private String direccion;
	private String telefono;
	
	public Lugar(String nombre, String direccion, String telefono) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
	}
	
	public Lugar (){
		
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
		return "Lugar [Nombre: " + nombre + ", Direccion: " + direccion
				+ ", Telefono: " + telefono + "]";
	}	
}