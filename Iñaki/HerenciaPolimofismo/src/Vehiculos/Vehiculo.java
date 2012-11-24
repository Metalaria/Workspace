package Vehiculos;

public class Vehiculo {

	protected String marca;
	protected String matricula;
	protected int numeroRuedas;
	protected double autonomia;
	
	public Vehiculo (String marca, String matricula, int numeroRuedas, double autonomia){
		this.marca=marca;
		this.matricula=matricula;
		this.numeroRuedas=numeroRuedas;
		this.autonomia=autonomia;
	}
	
	
	public String listar(){
		String salida;
		salida="Marca: "+marca+"\n";
		salida+="Matricula: "+matricula+"\n";
		salida+="Numero Ruedas: "+numeroRuedas+"     Autonomia: "+autonomia+"Km \n";
		
		return salida;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	public int getNumeroRuedas() {
		return numeroRuedas;
	}


	public void setNumeroRuedas(int numeroRuedas) {
		this.numeroRuedas = numeroRuedas;
	}


	public double getAutonomia() {
		return autonomia;
	}


	public void setAutonomia(double autonomia) {
		this.autonomia = autonomia;
	}
	
}
