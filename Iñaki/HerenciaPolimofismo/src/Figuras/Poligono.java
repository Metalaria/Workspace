package Figuras;

public abstract class Poligono extends Figura{
	
		private int numLados=0;
		
		
		public Poligono(String col, int nl)
		{
			super(col);
			this.numLados=nl;
		}

		public int getNumLados() {
			return numLados;
		}


		public void setNumLados(int numLados) {
			this.numLados = numLados;
		}	
		
		public String toString (){
			return super.toString()+" numero de lados: "+numLados;
		}
}