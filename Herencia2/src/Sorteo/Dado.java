package Sorteo;

public class Dado extends Sorteo {
	public String lanzar() {
		int n=(int) (Math.random()*7);
		return "El resultado del dado es: "+n;
	}
}
