package Articulo;

public class Metodos {
	static private int generador = 0;
	private int codigo;
	public String nombre;
	private String color; 
	private double precio;
	
	//CONSTRUCTORES
	public Metodos(){
		
	}
	public Metodos(double precio){
		this.precio=precio;
		this.codigo=generador;
		generador++;
	}
	public Metodos(String nombre, String color){
		this.nombre=nombre;
		this.color=color;
		this.codigo=generador;
		generador++;
	}
	
	//GET
	public int codigo (){
		return this.codigo;
	}
	public String color(){
		return this.color;
	}
	public double precio(){
		return this.precio;
	}
	
	//SET
	public void setCodigo(int codigo){
		this.codigo=codigo;
	}
	public void setColor(String color){
		this.color=color;
	}
	public void setPrecio(double precio){
		this.precio=precio;
	}
	
	public void incrementarPrecio(double precio){
		this.precio=this.precio+precio;
	}
	
	public void rebajarPrecio(double precio){
		this.precio=this.precio*0.9;
	}
	
	public String toString(){
		return "Cod: "+this.codigo+" Nombre: "+this.nombre+" Color: "+this.color+" Precio: "+this.precio;
	}
}