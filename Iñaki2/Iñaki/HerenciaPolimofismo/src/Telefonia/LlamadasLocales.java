package Telefonia;

public class LlamadasLocales extends Llamadas {

	private static final double precioSeg=0.15;
	
	public LlamadasLocales(String numeroOrigen, String numeroDestino, int duracion){
		super(numeroOrigen,numeroDestino,duracion);
		
	}
	public double costeLlamada(){
		double coste;
		coste=precioSeg*duracion;
		return coste;
	}
	public String toString(){
		String salida;
		salida=super.toSrting();
		salida+="Llamada Local\n";
		salida+="Precio por segundo: "+precioSeg+"€\n";
		salida+="Total precio llamada: "+costeLlamada()+"€\n";
		return salida;
	}
}
