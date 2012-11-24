package Biblioteca;

public class Metodos {
	
	private String isbn;
	private String titulo;
	private boolean prestado;
	
	private String nombre; //Clase Autor  /*libro1.getAutor().getCodAutor();*/
	private String nacionalidad;
	private int nacimiento;
	private int defuncion;
	
	
	public Metodos(){
	}
		
	
	//Autor
	public Metodos (String nombre, String nacionalidad, int nacimiento){
		this.nombre=nombre;
		this.nacionalidad=nacionalidad;
		this.nacimiento=nacimiento;
	}
	
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	
	public void setNacionalidad(String nacionalidad){
		this.nacionalidad = nacionalidad;
	}
	
	public void setNacimiento(int nacimiento){
	this.nacimiento = nacimiento;
	}
	
	public String getNombre() {
		return "nombre: "+this.nombre;
	}
	
	public String getNacionalidad(){
		return "nacionalidad: "+this.nacionalidad;
	}
	
	public String getNacimiento(){
		return "fecha nacimiento: "+this.nacimiento;
	}
	
	public String gerDefuncion(){
		return "fecha defuncion: "+this.defuncion;
	}
	
	public void fallecer(int defuncion){
		this.defuncion=defuncion;
	}
	
	public String toString(){
		return "Nombre: "+this.nombre+" Nacionalidad: "+this.nacionalidad+" Fecha de nac.: "+this.nacimiento+" Defuncion: "+this.defuncion;
	}
	
	
	
	//Libro
	
	public Metodos(boolean prestado){
		this.prestado=false;
	}
	
	public String getIsbn(){
		return this.isbn;
	}
	
	public String getTitulo(){
		return this.titulo;
	}
	
	public boolean getPrestado(){
		return this.prestado;
	}
	
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}
	
	public String prestarLibro(){
		if (this.prestado=false){
			return "Está disponible";
		}
		else{
			return "No está disponible";
		}
	}
	
	public void devolverLibro(){
		if (this.prestado=false){
			System.out.println("Está disponible");
		}
		else{
			this.prestado=false;
			System.out.println("Devuelto y disponible ahora");
		}
	}
}
