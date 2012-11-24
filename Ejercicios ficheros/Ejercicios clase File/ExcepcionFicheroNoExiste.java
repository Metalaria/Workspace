package claseFile;


public class ExcepcionFicheroNoExiste extends Exception
{
	public ExcepcionFicheroNoExiste()
	{
	    super();
	}
	public ExcepcionFicheroNoExiste(String descripcion)
	{
	    super(descripcion);
	}
}