package SolucionesObjetosBasicos.articulo;



public class PrincipalArticulo {

	public static void main(String[] args) {
		
		String nombre, color;
		double precio, increm;
		
		Articulo art1=new Articulo();
		System.out.println("Introduce nombre, color y precio del articulo 1");
		nombre=LeerTeclado.readString();
		color=LeerTeclado.readString();
		precio=LeerTeclado.readDouble();
		
		art1.setNombre(nombre);
		art1.setColor(color);
		art1.setPrecio(precio);
		
		System.out.println("Articulo 1");
		System.out.println(art1.toString());
		
		System.out.println("Introduce nombre, color y precio del articulo 2");
		nombre=LeerTeclado.readString();
		color=LeerTeclado.readString();
		precio=LeerTeclado.readDouble();
		
		Articulo art2=new Articulo(nombre,color);
		art2.setPrecio(precio);
		System.out.println("Articulo 2");
		System.out.println(art2.toString());
		
		System.out.println("Introduce el incremento de precio");
		increm=LeerTeclado.readDouble();
		
		art2.incrementarPrecio(increm);
		art1.rebajarPrecio();
		
		System.out.println("Articulo 1");
		System.out.println(art1.toString());
		
		System.out.println("Articulo 2");
		System.out.println(art2.toString());
		
		
		
		

	}

}
