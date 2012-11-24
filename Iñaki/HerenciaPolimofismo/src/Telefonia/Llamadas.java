package Telefonia;

public abstract class Llamadas {

	protected String numeroOrigen;
	protected String numeroDestino;
	protected int duracion;
	
	public Llamadas (String numeroOrigen, String numeroDestino, int duracion){
		this.numeroOrigen=numeroOrigen;
		this.numeroDestino=numeroDestino;
		this.duracion=duracion;
	}
	
	public String toSrting (){
		String salida;
		salida="Numero Origen:"+numeroOrigen+"\n";
		salida+="Numero Destino:"+numeroDestino+"\n";
		salida+="Duracion: "+duracion+" seg\n";
		return salida;
	}
	
	
}
