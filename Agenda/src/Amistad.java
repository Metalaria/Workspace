import java.io.Serializable;

@SuppressWarnings("serial")
public class Amistad extends Persona implements Serializable{

	String direccion;
	String tlfn;
	
	public Amistad(String nombre, String direccion, String calle, String tlfn) {
		super(nombre, direccion);
		this.direccion = direccion;
		this.tlfn = tlfn;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTlfn() {
		return tlfn;
	}

	public void setTlfn(String tlfn) {
		this.tlfn = tlfn;
	}

	public String toString() {
		return "es de tipo Amistad [Direccion: " + direccion + ", Telefono: " + tlfn
				+ ", Nombre: " + nombre + ", Mail: " + mail + "]";
	}
}