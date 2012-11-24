package Ejercicio1y2Hoja1;

@SuppressWarnings("serial")
public class ExcepcionFicheroNoExiste extends Exception {

	public ExcepcionFicheroNoExiste(){
		super();
	} 
	public ExcepcionFicheroNoExiste (String descripcion){
		super(descripcion);
		
	}
}
