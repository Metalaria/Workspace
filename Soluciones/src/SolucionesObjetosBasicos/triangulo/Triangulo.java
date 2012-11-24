package SolucionesObjetosBasicos.triangulo;

public class Triangulo {
	
	private double lado;
	private double altura;
	
	public Triangulo(double lado, double altura) {
		
		this.lado = lado;
		this.altura = altura;
	}

	public double getlado() {
		return lado;
	}

	public void setlado(double lado) {
		this.lado = lado;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double area(){
		return (lado*altura)/2;
	}
	
	public double perimetro(){
		return 3*lado;
	}

	@Override
	public String toString() {
		return "Triangulo [lado=" + lado + ", altura=" + altura + ", area="
				+ area() + ", perimetro=" + perimetro() + "]";
	}

	
	

}
