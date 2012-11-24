package Ejercicio2;

public class Rectangulo extends Poligono  {
	private double base;
	private double altura;
	float resultado;
	
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

	public Rectangulo(String color, int numLados, double base, double altura) {
		super(color, numLados);
		this.base = base;
		this.altura = altura;
	}
	public double calcularPerimetro() {
		// TODO Auto-generated method stub
		resultado=(float) ((getBase()*2)+(getAltura()*2));
		return resultado;
	}
	
	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		resultado=(float) (getBase()*getAltura());
		return resultado;
	}
	public String toString() {
		return "Soy una figura de color "+super.getColor()+
		"\nAdemás soy un polígono y un rectangulo.+" +
		"\nMi base es "+ base +
		"\nMi altura  es "+altura +
		"\n Mi área es "+calcularArea()+
		"\nMi perímetro es "+calcularPerimetro();
	}

	

	@Override
	public void sumar(Operable op) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void multiplicar(Operable op) {
		// TODO Au
		
	}

	@Override
	public void restar(Operable op) {
		// TODO Auto-generated method stub
		
	}

	

}
