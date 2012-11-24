package Articulo;

public class Principal {
	public static void main(String[] args) {
		
		Metodos a1 = new Metodos();
		double precio = 9; 
		a1.setPrecio(precio);
		a1.setColor("negro");
		a1.nombre="sofa";
		a1.setCodigo(1);
		
		Metodos a2;
		System.out.println("Introduce el nombre del artículo: ");
		String nombre=LeerTeclado.readString();
		System.out.println("Color: ");
		String color=LeerTeclado.readString();
		a2 = new Metodos(nombre, color);
		precio = 3;
		a2.setPrecio(precio);
		
		Metodos a3 = new Metodos(precio);
		System.out.println("Precio del tercer artículo: ");
		precio = LeerTeclado.readDouble();
		a3.setPrecio(precio);
		a3.setColor("rojo");
		a3.nombre="mesa";
		
		System.out.println(""+ a1.toString() + "\n" + a2.toString() + "\n" + a3.toString());
		
		System.out.println("Incremento del segundo articulo: ");
		precio = LeerTeclado.readDouble();
		a2.incrementarPrecio(precio);
		
		a1.rebajarPrecio(0);
		
		System.out.println(""+ a1.toString() + "\n" + a2.toString() + "\n" + a3.toString());
	}
}