package ejercicio2;

import java.io.*;


public class Pelicula {
	private int codigo;
	private String titulo;
	private boolean prestada;
	private double precio;
	
	public Pelicula(int codigo, String titulo,  double precio) {
		
		this.codigo = codigo;
		this.titulo = titulo;
		this.prestada = false;
		this.precio = precio;
	}
	
	public Pelicula(int codigo, String titulo, boolean prestada, double precio) {
		
		this.codigo = codigo;
		this.titulo = titulo;
		this.prestada = prestada;
		this.precio = precio;
	}



	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public boolean estaPrestada() {
		return prestada;
	}

	public void prestar() {
		this.prestada = true;
	}
	
	public void devolver(){
		this.prestada=false;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public void grabar(DataOutputStream dos) throws IOException{
		dos.writeInt(codigo);
		dos.writeUTF(titulo);
		dos.writeBoolean(prestada);
		dos.writeDouble(precio);
	}
	
	public static Pelicula leer (DataInputStream dis)throws IOException{
		Pelicula pelic;
		int codigo=dis.readInt();
		String titulo=dis.readUTF();
		boolean prestada=dis.readBoolean();
		double precio=dis.readDouble();
		pelic=new Pelicula(codigo, titulo, prestada, precio);
		return pelic;
	}

	@Override
	public String toString() {
		return "Pelicula [codigo=" + codigo + ", titulo=" + titulo
				+ ", prestada=" + prestada + ", precio=" + precio + "]";
	}
	
	
	
	
}
