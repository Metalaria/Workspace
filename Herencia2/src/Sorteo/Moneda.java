package Sorteo;

public class Moneda extends Sorteo {

	public String lanzar(int n) {
		n=(int) (Math.random()*2);
		if (n==1)
			return "cara";
		else return "cruz";
	}
	public String lanzar(){
		return null;}
}
