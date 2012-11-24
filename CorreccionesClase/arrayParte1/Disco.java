package arrayParte1;

public class Disco {

	private String nombre;
	private String cantante;
	private int numCanciones;
	private Cancion [] arrayCanciones;
	
	public Disco(String nombre, String cantante, int numCanciones){
		this.nombre=nombre;
		this.cantante=cantante;
		this.numCanciones=numCanciones;
		arrayCanciones=new Cancion[numCanciones];
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCantante() {
		return cantante;
	}

	public void setCantante(String cantante) {
		this.cantante = cantante;
	}

	public int getNumCanciones() {
		return numCanciones;
	}

	public Cancion[] getArrayCanciones() {
		return arrayCanciones;
	}
	
	public void insertar(){
		
		System.out.println("Introduce titulo y duración de la cancion");
		String titulo=LeerTeclado.readString();
		double duracion=LeerTeclado.readDouble();
		boolean alta=false;
		
		for (int i=0; i<arrayCanciones.length; i++)
			if (arrayCanciones[i]==null){
				arrayCanciones[i]=new Cancion(titulo, duracion);
				alta=true;
				break;
			}
		if (!alta)
			 System.out.println("No hay sitio para más altas");		
		
	}

	public void buscar(){
		System.out.println("Introduce el titulo de la cancion a buscar");
		String tit=LeerTeclado.readString();
		boolean enc=false;
		Cancion cancion=null;
		for (int i=0; i<arrayCanciones.length; i++)
			if (arrayCanciones[i]!=null && arrayCanciones[i].getTitulo().equals(tit)){
				enc=true;
				cancion=arrayCanciones[i];
				break;
			}
		if (enc)
			System.out.println("La cancion es "+cancion.toString());
		else System.out.println("La cancion solicitada no existe");
		
	}
	

	public String toString() {
		return "Disco [nombre=" + nombre + ", cantante=" + cantante + "]";
	}

	public void visualizarDisco(){
		
		double duracionTotal=0;
		System.out.println(this.toString());
		System.out.println("Canciones del disco");
		for (int i=0; i<arrayCanciones.length; i++)
			if (arrayCanciones[i]!=null){
				System.out.println(arrayCanciones[i].toString());
				duracionTotal+=arrayCanciones[i].getDuracion();
			}
			
			
		System.out.println("Duracion total "+duracionTotal);
			
	}
	
}
