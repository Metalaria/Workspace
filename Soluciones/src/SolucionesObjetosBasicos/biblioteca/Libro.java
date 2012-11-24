package SolucionesObjetosBasicos.biblioteca;

public class Libro {
	
	private String isbn;
	private String titulo;
	private boolean prestado;
	private Autor autor;
	
	public Libro(String isbn, String titulo, Autor autor) {
		this.isbn = isbn;
		this.titulo = titulo;
		this.prestado = false;
		this.autor = autor;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public boolean isPrestado() {
		return prestado;
	}
	public void prestar() {
		if (prestado)
			System.out.println("El libro "+getTitulo()+" ya está prestado, no se puede volver a prestar");
		
		else {
			System.out.println("Se procede a prestar el libro "+getTitulo());
			this.prestado =true;
		}		
	}
	
	public void devolver(){
		if (!prestado)
			System.out.println("El libro "+getTitulo()+" no está prestado, no se puede devolver ");
		
		else {
			System.out.println("Se procede a devolver el libro "+getTitulo());
			this.prestado =false;
		}	
	}
	
	
	public Autor getAutor() {
		return autor;
	}
	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	@Override
	public String toString() {
		return "Libro [isbn=" + isbn + ", titulo=" + titulo + ", prestado="
				+ prestado + ", autor=" + autor.toString() + "]";
	}
	
	
	

}
