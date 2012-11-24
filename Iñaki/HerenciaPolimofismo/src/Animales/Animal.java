package Animales;

public class Animal {
	
	String nombreComun;
	String nombreEspecifico;
	double peso;
	int tama�o;
	
	public Animal(){
		
	}
	

	public Animal(String nombreComun, String nombreEspecifico, double peso, int tama�o) {
		this.nombreComun = nombreComun;
		this.nombreEspecifico = nombreEspecifico;
		this.peso = peso;
		this.tama�o = tama�o;
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

	public int getTama�o() {
		return tama�o;
	}

	public void setTama�o(int tama�o) {
		this.tama�o = tama�o;
	}
	
	public String toString() {
		String salida;
		salida="Nombre Comun: "+nombreComun+"\n";
		salida+="Nombre Especifico: "+nombreEspecifico+"\n";
		salida+="Peso: "+peso+" Kg    Tama�o: "+tama�o+"\n";
		return salida;
	}

	public int incrementoTama�o(int porcentaje){
		int aumento;
		aumento=tama�o*porcentaje/100;
		tama�o=tama�o+aumento;
		return tama�o;
	}
}
