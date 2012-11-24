package ejercicio1;

public class ExcepcionFichero extends Exception {
	public ExcepcionFichero(){
		super();
	}
	
	public ExcepcionFichero(String descripcion){
		super(descripcion);
	}
	
}
