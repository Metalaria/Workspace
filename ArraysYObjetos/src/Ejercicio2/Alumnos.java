package Ejercicio2;
public class Alumnos {
	String nombre;
	double nota;
	
	public Alumnos(){
		
	}
	public  void rellenarNombres (int []notas){
		int i=0;
		System.out.println();
		for (i=0; i<notas.length; i++){
			this.nombre=LeerTeclado.readString();
		}
	}
}
