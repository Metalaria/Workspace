package ficheros;


/**
 * Ejercicio_UT2_8
 *
 * Definicion de la clase ExcepcionArgumentos
 *   
 * @author (Alvaro) 
 * @version (1.0)
 */
public class ExcepcionArgumentos extends Exception
{
	public ExcepcionArgumentos()
	{
	    super();
	}
	
	public ExcepcionArgumentos(String descripcion)
	{
	    super(descripcion);
	}
}