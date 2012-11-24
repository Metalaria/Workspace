package Animales;

public class Ave extends Animal {
	
	int numeroHuevos;
	boolean volar;
	
	public Ave(){
		
	}
	
	public Ave(String nombreComun, String nombreEspecifico, double peso, int tamaño,int numeroHuevos,boolean volar){
		super (nombreComun,nombreEspecifico,peso,tamaño);
		this.numeroHuevos=numeroHuevos;
		this.volar=volar;		
	}

	public String toString() {
		String salida;
		salida=super.toString();	
		salida+="Numero Huevos: "+numeroHuevos+"\n";
		salida+="Volar: "+volar+"\n";
		return salida;
	}

	public int getNumeroHuevos() {
		return numeroHuevos;
	}

	public void setNumeroHuevos(int numeroHuevos) {
		this.numeroHuevos = numeroHuevos;
	}

	public boolean isVolar() {
		return volar;
	}

	public void setVolar(boolean volar) {
		this.volar = volar;
	}
	
	
}
