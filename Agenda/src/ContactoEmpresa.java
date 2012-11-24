@SuppressWarnings("serial")
public class ContactoEmpresa extends Persona {

	String nombre;
	String info;
	
	public ContactoEmpresa(String nombre, String direccion, String nombreEmpresa, String informacion) {
		super(nombre, direccion);
		
		this.nombre = nombre;
		this.info = informacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public String toString() {
		return "Contacto de Empresa [Nombre de la empresa: " + nombre + ", Informacion adicional: " + info
				+ ", Mail: " + mail + "]";
	}
}