package Ejercicio1;

public class MamiferoTerrestre extends Mamifero {
	protected int numPatas;

	public MamiferoTerrestre(String nombreComun, String nombreSpec, int peso, int tamanno, int numCrias, int mesesEmbar, int numPatas) {
		super(nombreComun, nombreSpec, peso, tamanno, numCrias, mesesEmbar);
		this.numPatas = numPatas;
	}
	public MamiferoTerrestre() {
	}

	public int getNumPatas() {
		return numPatas;
	}

	public void setNumPatas(int numPatas) {
		this.numPatas = numPatas;
	}

	@Override
	public String toString() {
		return "MamiferoTerrestre [numPatas=" + numPatas + ", numCrias="
				+ numCrias + ", mesesEmbar=" + mesesEmbar + ", nombreComun="
				+ nombreComun + ", nombreSpec=" + nombreSpec + ", peso=" + peso
				+ ", tamanno=" + tamanno + "]";
	}
}
