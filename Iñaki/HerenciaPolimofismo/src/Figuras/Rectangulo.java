package Figuras;

import Interfaces.Geometria;
import objetosOrdenables.Ordenable;



public class Rectangulo extends Poligono implements Ordenable {
			
		private double base=0;
		private double altura=0;
			
		public Rectangulo(String col,  double b, double h) {
			super(col, 4);
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
			return "Soy una figura de color "+super.getColor()+". Además soy un polígono y un restangulo. Mi área es "+calcularArea()+" y mi perímetro es "+calcularPerimetro();
		}

		public float calcularPerimetro() {
			float p=0;
			p=(float) ((getBase()*2)+(getAltura()*2));
			return p;
		}

		public float calcularArea() {
			float a=0;
			a=(float) (getBase()*getAltura());
			return a;
		}

		
		public boolean esMayor(Ordenable o) {
			return (this.calcularArea()>((Rectangulo)o).calcularArea());

		}

		public boolean esMenor(Ordenable o) {
			return (this.calcularArea()<((Rectangulo)o).calcularArea());
		}
		
}