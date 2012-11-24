package ClaseFile;

public class ExcepcionFicheroNoExiste extends Exception {
	String mensaje;

	public ExcepcionFicheroNoExiste() {
		super();
		this.mensaje = "El fichero no existe";
	}
	
	
	
	
}
