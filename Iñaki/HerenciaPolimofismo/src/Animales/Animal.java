package Animales;

public class Animal {
	
	String nombreComun;
	String nombreEspecifico;
	double peso;
	int tamaño;
	
	public Animal(){
		
	}
	

	public Animal(String nombreComun, String nombreEspecifico, double peso, int tamaño) {
		this.nombreComun = nombreComun;
		this.nombreEspecifico = nombreEspecifico;
		this.peso = peso;
		this.tamaño = tamaño;
	}


	public String getNombreComun() {
		return nombreComun;
	}

	public void setNombreComun(String nombreComun) {
		this.nombreComun = nombreComun;
	}

	public String getNombreEspecifico() {
		return nombreEspecifico;
	}

	public void setNombreEspecifico(String nombreEspecifico) {
		this.nombreEspecifico = nombreEspecifico;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public int getTamaño() {
		return tamaño;
	}

	public void setTamaño(int tamaño) {
		this.tamaño = tamaño;
	}
	
	public String toString() {
		String salida;
		salida="Nombre Comun: "+nombreComun+"\n";
		salida+="Nombre Especifico: "+nombreEspecifico+"\n";
		salida+="Peso: "+peso+" Kg    Tamaño: "+tamaño+"\n";
		return salida;
	}

	public int incrementoTamaño(int porcentaje){
		int aumento;
		aumento=tamaño*porcentaje/100;
		tamaño=tamaño+aumento;
		return tamaño;
	}
}
