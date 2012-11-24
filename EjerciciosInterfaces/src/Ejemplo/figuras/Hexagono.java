package Ejemplo.figuras;

public class Hexagono extends Poligono{
		
		private double lado=0;
		private double apotema=0;
		
		public Hexagono(String col,  double l, double ap)
		{
			super(col, 6);
			this.lado=l;
			this.apotema=ap;
		}

		public double getLado() {
			return lado;
		}

		public void setLado(double lado) {
			this.lado = lado;
		}

		public double getApotema() {
			return apotema;
		}

		public void setApotema(double apotema) {
			this.apotema = apotema;
		}

		public String toString() {
			return "Hexagono [ "+super.toString()+" lado=" + lado + ", apotema=" + apotema + "]";
		}

		public float perimetro() {
			float p=0;
			p=(float) (getLado()*6);
			return p;
		}

		public float area() {
			float a=0;
			a=(float) ((perimetro()*getApotema())/2);
			return a;
		}		
}