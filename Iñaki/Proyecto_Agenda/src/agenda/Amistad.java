package agenda;

public class Amistad extends Persona {
	private String direccion;
	private String telefono;
	private static final String tipo = "AMISTAD";

	public Amistad(String nombreCompleto, String email, String direccion,
			String telefono) {
		super(nombreCompleto, email);
		this.direccion = direccion;
		this.telefono = telefono;
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
	

	public static String getTipo() {
		return tipo;
	}

	public String toString() {
		return "Amistad [direccion=" + direccion + ", telefono=" + telefono
				+ "tipo: " + tipo + ", toString()=" + super.toString() + "]";
	}
}
