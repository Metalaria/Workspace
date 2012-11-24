public class Ave extends Animal {
	protected int numHuevos;
	protected boolean volar;
	public Ave(String nombreComun, String nombreSpec, int peso, int tamanno, int numHuevos, boolean volar) {
		super(nombreComun, nombreSpec, peso, tamanno);
		this.numHuevos = numHuevos;
		this.volar = volar;
	}
	public int getNumHuevos() {
		return numHuevos;
	}
	public void setNumHuevos(int numHuevos) {
		this.numHuevos = numHuevos;
	}
	public boolean isVolar() {
		return volar;
	}
	public void setVolar(boolean volar) {
		this.volar = volar;
	}
	@Override
	public String toString() {
		return "Ave [numHuevos=" + numHuevos + ", volar=" + volar
				+ ", nombreComun=" + nombreComun + ", nombreSpec=" + nombreSpec
				+ ", peso=" + peso + ", tamanno=" + tamanno + "]";
	}
	
}
