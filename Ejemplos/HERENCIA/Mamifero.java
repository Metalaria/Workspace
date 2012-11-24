public class Mamifero extends Animal {
	protected int numCrias;
	protected int mesesEmbar;
	
	public Mamifero(String nombreComun, String nombreSpec, int peso,int tamanno, int numCrias, int mesesEmbar) {
		super(nombreComun, nombreSpec, peso, tamanno);
		this.numCrias = numCrias;
		this.mesesEmbar = mesesEmbar;
	}

	public int getNumCrias() {
		return numCrias;
	}

	public void setNumCrias(int numCrias) {
		this.numCrias = numCrias;
	}

	public int getMesesEmbar() {
		return mesesEmbar;
	}

	public void setMesesEmbar(int mesesEmbar) {
		this.mesesEmbar = mesesEmbar;
	}
/*
	@Override
	public String toString() {
		return "Mamifero [numCrias=" + numCrias + ", mesesEmbar=" + mesesEmbar
				+ ", nombreComun=" + nombreComun + ", nombreSpec=" + nombreSpec
				+ ", peso=" + peso + ", tamanno=" + tamanno + "]";
	}*/
	
	public String toString (){
		return super.toString()+", numCrias= "+numCrias+", mesesEmbar= "+mesesEmbar;
	}
}
