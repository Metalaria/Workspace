package claseFile;

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