

public class Contacto extends Persona {
	private String nombreEmpresa;
	private String infoAdicional;
	private static final String tipo = "CONTACTO";

	public Contacto(String nombreCompleto, String email, String nombreEmpresa,
			String infoAdicional) {
		super(nombreCompleto, email);
		this.nombreEmpresa = nombreEmpresa;
		this.infoAdicional = infoAdicional;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	public String getInfoAdicional() {
		return infoAdicional;
	}

	public void setInfoAdicional(String infoAdicional) {
		this.infoAdicional = infoAdicional;
	}
	

	public static String getTipo() {
		return tipo;
	}

	public String toString() {
		return "Contacto [nombreEmpresa=" + nombreEmpresa + ", infoAdicional="
				+ infoAdicional + "TIPO:" + tipo + ", toString()="
				+ super.toString() + "]";
	}

}
