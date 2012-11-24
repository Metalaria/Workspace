package Ejercicio2;

public abstract class Figura implements Geometria, Operable {
	private String color;
	public Figura(){}
	public Figura(String color) {
		super();
		this.color = color;
	}
	@Override
	public  abstract double calcularArea();

	@Override
	public abstract double calcularPerimetro();
	//Estos métodos vienen definidos por el interfaz Operable
	public abstract void sumar(Operable op);
	public  abstract void multiplicar(Operable op);
	public abstract void restar(Operable op);
	public String toString() {
		return "Figura +" +
				"El color es" + color ;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}

