package Ejemplo.figuras;

public abstract class Figura {
		
		private String color;
		
		
		public Figura(String col)
		{
			this.color=col;
		}

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		public String toString() {
			return "Figura [Color=" + color + "]";
		}
		
		public abstract float perimetro();
		
		public abstract float area();
}