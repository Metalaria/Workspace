package Ejemplo.figuras;

public class Circulo extends Figura {

			private double radio=0;
	
		public Circulo(String col, double r) {
				super(col);
				this.radio=r;
		}

		public double getRadio() {
			return radio;
		}

		public void setRadio(double radio) {
			this.radio = radio;
		}

		public String toString() {
			return "Soy una figura de color "+super.getColor()+". Además soy un polígono y un circulo. Mi área es "+area()+" y mi perímetro es "+perimetro();
		}

		public float perimetro() {
			float p=0, pi=0;
			pi=(float) Math.PI;
			p=(float) (2*pi*getRadio());
			return p;
		}

		public float area() {
			float p=0, pi=0;
			pi=(float) Math.PI;
			p=(float) (pi*(getRadio()*Math.exp(2)));
			return p;
		}
}