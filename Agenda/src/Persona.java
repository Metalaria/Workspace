import java.io.Serializable;

@SuppressWarnings("serial")
public abstract class Persona implements Serializable {
	
	String nombre;
	String mail;
	
	public Persona(String nombre, String mail) {
		this.nombre =nombre;
		this.mail = mail;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String toString() {
		return "Persona [Nombre: " + nombre + ", Mail: " + mail +"]";
	}
}