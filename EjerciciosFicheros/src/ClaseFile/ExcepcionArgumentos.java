package ClaseFile;
import java.io.*;
public class ExcepcionArgumentos extends Exception {
	public ExcepcionArgumentos(){
		super();
	}
	public ExcepcionArgumentos(String descripcion){
		super ("No hay argumentos");
	}
}
