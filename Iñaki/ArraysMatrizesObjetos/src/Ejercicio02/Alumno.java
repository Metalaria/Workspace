package Ejercicio02;

public class Alumno {
	private String nombre;
	private double nota;
	
	
	
	public Alumno(){
		
	}
	public Alumno(String nombre,double nota){
		this.nombre=nombre;
		this.nota=nota;		
	}
	
	public double getNota(){
		return nota;
	}
	public String getNombre(){
		return nombre;
	}

	

	public String getAprobado() {
		if(nota>=5) return "Aprobado";
		else return "Suspenso";
	}
	public String toString(){
		return "Nombre: "+nombre+" Nota: "+nota;
	}
}

