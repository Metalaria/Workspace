package Vehiculos;

public class Camion extends Vehiculo {
	
	protected int limiteCarga;
	protected int carga;
	protected String conductor;

	
	public Camion (String marca, String matricula, int numeroRuedas, double autonomia, int limiteCarga, int carga, String conductor){
		super(marca,matricula,numeroRuedas,autonomia);
		this.limiteCarga=limiteCarga;
		this.carga=carga;
		this.conductor=conductor;
		if(carga>limiteCarga){
			carga=limiteCarga;
		}
	}
	
	public void cambiarConductor(String conductor){
		this.conductor=conductor;
	} 
	
	public void cargar(int sumacarga){
		carga=carga+sumacarga;
		if(carga>limiteCarga){
			carga=limiteCarga;
		}
	}
	
	public void descargar(int restacarga){
		if(restacarga>carga){
			carga=0;
		}
		else{
			carga=carga-restacarga;
		}
	}
	
	public String listar(){
		String salida;
		salida=super.listar();
		salida+="Limite Carga: "+limiteCarga+"    Carga: "+carga+"\n";
		salida+="Conductor: "+conductor+"\n";
		
		return salida;
	}
	
}
