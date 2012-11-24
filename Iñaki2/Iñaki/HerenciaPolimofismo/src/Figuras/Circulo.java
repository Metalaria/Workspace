package Figuras;

import Interfaces.Geometria;

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
			return "Soy una figura de color "+super.getColor()+". Adem�s soy un pol�gono y un circulo. Mi �rea es "+calcularArea()+" y mi per�metro es "+calcularPerimetro();
		}

		public float calcularPerimetro() {
			float p=0, pi=0;
			pi=(float) Math.PI;
			p=(float) (2*pi*getRadio());
			return p;
		}

		public float calcularArea() {
			float p=0, pi=0;
			pi=(float) Math.PI;
			p=(float) (pi*(getRadio()*Math.exp(2)));
			return p;
		}
}