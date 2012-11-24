package Ejercicio2;

public abstract class Poligono extends Figura implements Geometria,Operable {
	private int numLados;
	
	public Poligono(String color,int numLados) {
		super(color);
		this.numLados=numLados;
		// TODO Auto-generated constructor stub
	}

	public  abstract double calcularArea();

	
	public abstract double calcularPerimetro();
	
	public abstract void sumar(Operable op);
	public  abstract void multiplicar(Operable op);
	public abstract void restar(Operable op);
	
	public String toString() {
		return "____________Poligono___________ +" +
				"\nSu numero de Lados es " + numLados ;
	}
	
	

	public int getNumLados() {
		return numLados;
	}

	public void setNumLados(int numLados) {
		this.numLados = numLados;
	}

}
