package Telefonia;

public class LlamadasProvinciales extends Llamadas {
	
	private int franja;
	private double precioSeg;
	private double hora;
	
	public LlamadasProvinciales(String numeroOrigen, String numeroDestino, int duracion,double hora){
		super(numeroOrigen,numeroDestino,duracion);
		this.hora=hora;
		if(hora<=8){
			franja=1;
		}
		else if(hora<=16 && hora>8){
			franja=2;
			}
		else if (hora<24 && hora>16){
			franja=3;
		}
		else {
			System.out.println("Franja Horaria incorrecta.");
		}
		
		if(franja==1)precioSeg=0.20;
		if(franja==2)precioSeg=0.25;
		if(franja==3)precioSeg=0.30;
	}
	
	public double costeLlamada(){
		double coste;
		coste=precioSeg*duracion;
		return coste;
	}
	
	public String toString(){
		String salida;
		salida=super.toSrting();
		salida+="Llamada Provincial\n";
		salida+="Precio por segundo: "+precioSeg+"€ Franja: "+franja+"\n";
		salida+="Total precio llamada: "+costeLlamada()+"€ \n";
		return salida;
	}

}
