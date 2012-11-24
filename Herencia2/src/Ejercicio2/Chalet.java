package Ejercicio2;

public class Chalet extends Vivienda {
	protected double tamanno=200;
	protected boolean jardinChalet;
	public Chalet(double metrosCuadrados, String calle, int numero, double tamannoChalet, boolean jardinChalet) {
		super(metrosCuadrados, calle, numero);
		this.tamanno = 200;
		this.jardinChalet = jardinChalet;
	}
	public Chalet() {
	}
	public double getTamannoChalet() {
		return tamanno;
	}
	public void setTamannoChalet(double tamannoChalet) {
		this.tamanno = tamannoChalet;
	}
	public boolean isJardinChalet() {
		return jardinChalet;
	}
	public void setJardinChalet(boolean jardinChalet) {
		this.jardinChalet = jardinChalet;
	}
	@Override
	public String toString() {
		return "Chalet [tamannoChalet=" + tamanno + ", jardinChalet="
				+ jardinChalet + ", metrosCuadrados=" + metrosCuadrados
				+ ", calle=" + calle + ", numero=" + numero + "]";
	}
}
