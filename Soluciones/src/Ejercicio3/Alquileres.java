package Ejercicio3;
public class Alquileres {
	private String nombreAticulo;
	private int precioArticuloDiario;
	private int diasAlquiler;
	public Alquileres() {
		System.out.println("Introduzca el nombre del Artículo");
		this.nombreAticulo = LeerTeclado.readString();
		System.out.println("Introduzca el precio/día del alquiler");
		this.precioArticuloDiario = LeerTeclado.readInteger();
		System.out.println("Introduzca los días de alquiler");
		this.diasAlquiler = LeerTeclado.readInteger();
	}
	

	public String getNombreAticulo() {
		return nombreAticulo;
	}
	public void setNombreAticulo(String nombreAticulo) {
		this.nombreAticulo = nombreAticulo;
	}
	public int getPrecioArticulo() {
		return precioArticuloDiario;
	}
	public void setPrecioArticulo(int precioArticulo) {
		this.precioArticuloDiario = precioArticulo;
	}
	public int getDiasAlquiler() {
		return diasAlquiler;
	}
	public void setDiasAlquiler(int diasAlquiler) {
		this.diasAlquiler = diasAlquiler;
	}
	
	public double importeAlquiler(){
		double total=0;
		total=precioArticuloDiario*1.18;
		return total;
	}
	
	public String toString() {
		return "Alquileres [nombreAticulo=" + nombreAticulo
				+ ", precioArticuloDiario=" + precioArticuloDiario
				+ ", diasAlquiler=" + diasAlquiler + ", importeAlquiler()="
				+ importeAlquiler() + "]";
	}
}
