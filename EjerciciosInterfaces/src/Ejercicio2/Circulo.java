package Ejercicio2;

public class Circulo extends Figura {
	private float radio;
	float resultado;
	float pi;

	public Circulo(String color, float radio) {
		super(color);
		this.radio = radio;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(float radio) {
		this.radio = radio;
	}

	@Override
	public double  calcularPerimetro(){
		// TODO Auto-generated method stubpublic float perimetro() {
		
		pi=(float) Math.PI;
		resultado=(float) (2*pi*getRadio());
		return resultado;
		
	}

	public double calcularArea() {
		// TODO Auto-generated method stub
		
		pi=(float) Math.PI;
		resultado=(float) (pi*(getRadio()*Math.exp(2)));//A=Pi*r
		return resultado;
		
	}
	public String toString() {
		return "Soy una figura de color "+super.getColor()+
		" \nAdemás soy una figura y un circulo." +
		"\nMi radio es "+radio+
		"\n Mi área es "+ calcularArea()+
		" \nMi perímetro es "+calcularPerimetro();
	}

	@Override
	public void sumar(Operable op) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void multiplicar(Operable op) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void restar(Operable op) {
		// TODO Auto-generated method stub
		
	}

	


	}


