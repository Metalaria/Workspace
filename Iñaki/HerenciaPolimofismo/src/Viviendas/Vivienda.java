package Viviendas;

public class Vivienda {
	
	protected double metrosCuadrados;
	protected String calle;
	protected int numero;
	
	public Vivienda(){
		
	}
	
	public Vivienda(double metrosCuadrados,String calle,int numero){
		this.metrosCuadrados=metrosCuadrados;
		this.calle=calle;
		this.numero=numero;
	}

	public double getMetrosCuadrados() {
		return metrosCuadrados;
	}

	public void setMetrosCuadrados(double metrosCuadrados) {
		this.metrosCuadrados = metrosCuadrados;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String toString() {
		String salida;
		salida="Calle: "+calle+" Numero: "+numero+"\n";
		salida+="Metros Cuadrados: "+metrosCuadrados+"\n";
		return salida;
	}
	
}
