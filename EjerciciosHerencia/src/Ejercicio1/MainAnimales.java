package Ejercicio1;

public class MainAnimales {
	public static void main(String[] args) {
		Animal rana= new Animal();
		Mamifero ballena = new Mamifero ();
		MamiferoTerrestre perro = new MamiferoTerrestre ();
		Ave  avestruz = new Ave ();
		Ave paloma = new Ave ();
		
		System.out.println("Introduzca el nombre de la rana");
		rana.setNombreComun(LeerTeclado.readString());
		rana.getNombreComun();
		System.out.println("Introduzca ahora el nombre de la especia de la rana");
		rana.setNombreSpec(LeerTeclado.readString());
		rana.getNombreSpec();
		System.out.println("Introduzca ahora el peso de la rana");
		rana.setPeso(LeerTeclado.readInteger());
		rana.getPeso();
		System.out.println("Introduzca ahora el tamaño de la rana");
		rana.setTamanno(LeerTeclado.readInteger());
		rana.getTamanno();
		rana.toString();
	}
}
