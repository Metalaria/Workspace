package Ejercicio2;

public class Chalet extends Vivienda {
	protected double tamannoChalet=200;
	protected boolean jardinChalet;
	public Chalet(double metrosCuadrados, String calle, int numero, double tamannoChalet, boolean jardinChalet) {
		super(metrosCuadrados, calle, numero);
		this.tamannoChalet = tamannoChalet;
		this.jardinChalet = jardinChalet;
	}
	public Chalet() {
	}
	public double getTamannoChalet() {
		return tamannoChalet;
	}
	public void setTamannoChalet(double tamannoChalet) {
		this.tamannoChalet = tamannoChalet;
	}
	public boolean isJardinChalet() {
		return jardinChalet;
	}
	public void setJardinChalet(boolean jardinChalet) {
		this.jardinChalet = jardinChalet;
	}
	@Override
	public String toString() {
		return "Chalet [tamannoChalet=" + tamannoChalet + ", jardinChalet="
				+ jardinChalet + ", metrosCuadrados=" + metrosCuadrados
				+ ", calle=" + calle + ", numero=" + numero + "]";
	}
}
