package Ejemplo.figuras;

public class Triangulo extends Poligono {

			private double base=0;
			private double altura=0;
			
			
	public Triangulo(String col, double b, double h) {
		super(col, 3);
		this.base=b;
		this.altura=h;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public String toString() {
		return "Soy una figura de color "+super.getColor()+". Además soy un polígono y un triangulo. Mi área es "+area()+" y mi perímetro es "+perimetro();
	}

	public float perimetro() {	
		float p=0;
		p=(float) (getBase()*3);
		return p;
	}

	public float area() {
		float a=0;
		a=(float) ((getBase()*getAltura())/2);
		return a;
	}
}