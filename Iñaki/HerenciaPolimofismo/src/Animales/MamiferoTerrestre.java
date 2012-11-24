package Animales;

public class MamiferoTerrestre extends Mamifero {
	
	int numeroPatas;
	
	public MamiferoTerrestre(String nombreComun, String nombreEspecifico, double peso, int tamaño, int numeroCrias,int mesesEmbarazo,int numeroPatas){
		super (nombreComun,nombreEspecifico,peso,tamaño,numeroCrias,mesesEmbarazo);
		this.numeroPatas=numeroPatas;
		
	}
	public String toString() {
		String salida;
		salida=super.toString();	
		salida+="Numero Patas: "+numeroPatas+"\n";
		return salida;
	}
	public int getNumeroPatas() {
		return numeroPatas;
	}
	public void setNumeroPatas(int numeroPatas) {
		this.numeroPatas = numeroPatas;
	}
	
	

}
