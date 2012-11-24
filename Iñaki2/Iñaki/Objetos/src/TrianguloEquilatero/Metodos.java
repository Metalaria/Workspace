package TrianguloEquilatero;
public class Metodos {
	
	//Declaración de atributos
	private double lado;
	private double altura;
	
	//CONSTRUCTORES
	//Por Defecto
	public Metodos(){
		
	}
	//Por Indicación
	public Metodos(double lado, double altura){
		this.lado=lado;
		this.altura=altura;
	}
	
	//SET
	public void setLado (double lado){
		this.lado=lado;
	}
	public void setAltura (double altura){
		this.altura=altura;
	}
	
	//GET
	public double getLado(){
		return lado;
	}
	public double getAltura (){
		return altura;
	}
	
	public double getArea (){
		return (lado*altura)/2;
	}
	
	public double getPerimetro (){
		return lado*3;
	}
	
	public String toString (){
		return "Lado: "+lado+" Altura: "+altura+" Area: "+this.getArea()+" Perimetro: "+this.getPerimetro();
	}
}