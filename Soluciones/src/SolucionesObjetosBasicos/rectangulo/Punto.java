package SolucionesObjetosBasicos.rectangulo;

public class Punto {
	private double x,y;
	
	public Punto(){
		x=0;
		y=0;
	}
	public Punto(double x, double y){
		this.x=x;
		this.y=y;
	}
	public double getX(){
		return x;
	}
	
	public double getY(){
		return y;
	}
	public void setX(double x){
		this.x=x;
	}
	public void setY(double y){
		this.y=y;
	}
	public double distancia(Punto otro){
		 double dist=Math.sqrt(Math.pow(this.x-otro.x,2)+Math.pow(this.y-otro.y,2));
		return dist;
	}
	public void desplazar(double dx, double dy){
		this.x+=dx;
		this.y+=dy;
	}
	public void imprimirP(){
		System.out.println("(" + getX() +", " + getY() + ")");
	}
	
}
