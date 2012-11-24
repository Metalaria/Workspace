package Animales;

public class Mamifero extends Animal {
	
	int numeroCrias;
	int mesesEmbarazo;
	
	public Mamifero(){
		
	}
	public Mamifero(String nombreComun, String nombreEspecifico, double peso, int tamaño, int numeroCrias,int mesesEmbarazo){
		super (nombreComun,nombreEspecifico,peso,tamaño);
		this.numeroCrias=numeroCrias;
		this.mesesEmbarazo=mesesEmbarazo;
	}
	
	
	public String toString() {
		String salida;
		salida=super.toString();	
		salida+="Numero Crias: "+numeroCrias+"\n";
		salida+="Meses Embarazo: "+mesesEmbarazo+"\n";
		return salida;
	}
	
	
	public int getNumeroCrias() {
		return numeroCrias;
	}
	public void setNumeroCrias(int numeroCrias) {
		this.numeroCrias = numeroCrias;
	}
	public int getMesesEmbarazo() {
		return mesesEmbarazo;
	}
	public void setMesesEmbarazo(int mesesEmbarazo) {
		this.mesesEmbarazo = mesesEmbarazo;
	}
	

}
