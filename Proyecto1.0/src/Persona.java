

public class Persona {
	private String nombreCompleto;
	private String email;

	public Persona(String nombreCompleto, String email) {
		this.nombreCompleto = nombreCompleto;
		this.email = email;
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String toString() {
		return "Persona [nombreCompleto=" + nombreCompleto + ", email=" + email
				+ "]";
	}
}
