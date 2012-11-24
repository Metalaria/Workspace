package Sorteo;

public abstract class Sorteo {
	protected int posibilidades;
	
	public abstract String lanzar();
	public void probabilidades (){}
	public int verDatos (){
		return posibilidades;
	}
}
