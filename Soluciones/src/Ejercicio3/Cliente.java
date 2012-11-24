package Ejercicio3;

import java.util.Arrays;

public class Cliente {
	private String dniCliente;
	private String nombre;
	private int antiguoCliente;
	private Alquileres arrayAlquileres [];
	private boolean lleno;
	public Cliente() {
		System.out.println("Introduzca el DNI del cliente");
		this.dniCliente =LeerTeclado.readString();
		System.out.println("Introduzca el nombre del cliente");
		this.nombre = LeerTeclado.readString();
		System.out.println("¿Antiguo cliente? (0 para no y 1 para sí)");
		this.antiguoCliente = LeerTeclado.readInteger();
		arrayAlquileres = new Alquileres [10];
		this.lleno = false;
	}
	
	public String getDniCliente() {
		return dniCliente;
	}
	public void setDniCliente(String dniCliente) {
		this.dniCliente = dniCliente;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void alquilar(){
		Alquileres al=new Alquileres();
		int i;
		for (i=0; i<9; i++){
			arrayAlquileres[i]=al;
		}
		if (i>9){
			lleno=true;
		}
	}
	public double factura(){
		Alquileres al=new Alquileres();
		double suma=0;
		double pagar[]=new double[10];
		for (int i=0; i<pagar.length; i++){
			pagar[i]=al.importeAlquiler();
			suma=suma+pagar[i];
		}
		if (antiguoCliente==1)
			suma=suma*0.9;
		return suma;
	}
	public void rebajarPrecio(){
		Alquileres al=new Alquileres();
		double precio=al.getPrecioArticulo();
		double precioRebajado=precio-5;
		System.out.println("El precio con la rebaja es de: "+precioRebajado+"€");
	}
	
	public boolean compLleno(){
		if (lleno==false)
		return false;
		else return true;
	}
	
	public String toString() {
		return "Cliente [dniCliente=" + dniCliente + ", nombre=" + nombre
				+ ", antiguoCliente=" + antiguoCliente + ", arrayAlquileres="
				+ Arrays.toString(arrayAlquileres) + ", lleno=" + lleno
				+ ", factura()=" + factura() + "]";
	}
}
