package ejercicio1;
public class MainAnimal {
	public static void main(String[] args) {
		Animal rana= new Animal();
		Mamifero ballena = new Mamifero ();
		MamiferoTerrestre perro = new MamiferoTerrestre ();
		Ave  avestruz = new Ave ();
		Ave paloma = new Ave ();
		
		System.out.println("Introduzca el nombre de la rana");
		rana.setNombreComun(LeerTeclado.readString());
		System.out.println("Introduzca ahora el nombre de la especia de la rana");
		rana.setNombreSpec(LeerTeclado.readString());
		System.out.println("Introduzca ahora el peso de la rana");
		rana.setPeso(LeerTeclado.readInteger());
		System.out.println("Introduzca ahora el tamaño de la rana");
		rana.setTamanno(LeerTeclado.readInteger());
		System.out.println(rana.toString());
		
		System.out.println("Turno de la ballena");
		System.out.println("Nombre: ");
		ballena.setNombreComun(LeerTeclado.readString());
		System.out.println("Nombre de la especie: ");
		ballena.setNombreSpec(LeerTeclado.readString());
		System.out.println("Peso: ");
		ballena.setPeso(LeerTeclado.readInteger());
		System.out.println("Tamaño:");
		ballena.setTamanno(LeerTeclado.readInteger());
		System.out.println("Número de crías: ");
		ballena.setNumCrias(LeerTeclado.readInteger());
		System.out.println("Meses de embarazo: ");
		ballena.setMesesEmbar(LeerTeclado.readInteger());
		System.out.println(ballena.toString());
		
		System.out.println("Turno del avestruz");
		System.out.println("Nombre: ");
		avestruz.setNombreComun(LeerTeclado.readString());
		System.out.println("Nombre de la especie: ");
		avestruz.setNombreSpec(LeerTeclado.readString());
		System.out.println("Peso: ");
		avestruz.setPeso(LeerTeclado.readInteger());
		System.out.println("Tamaño:");
		avestruz.setTamanno(LeerTeclado.readInteger());
		System.out.println("Número de crías: ");
		avestruz.setNumHuevos(LeerTeclado.readInteger());
		System.out.println("Meses de embarazo: ");
		avestruz.isVolar();
		System.out.println(avestruz.toString());
		
		System.out.println("Introduce otro peso para la rana");
		rana.setPeso(LeerTeclado.readInteger());
		System.out.println("Introduce otro peso para la ballena");
		ballena.setPeso(LeerTeclado.readInteger());
		System.out.println("Intrdoduzca otro número de huevos para la paloma");
		paloma.setNumHuevos(LeerTeclado.readInteger());
		System.out.println("Tamaño del perro aumentado un 10%: "+perro.getTamanno()*0.10);
		System.out.println("Cambia los meses de embarazo de la ballena");
		ballena.setMesesEmbar(LeerTeclado.readInteger());
		
		/*
		 * 8)	¿Se puede cambiar los meses de embarazo de la rana? Razona la respuesta.
		 * No, ya que los meses de embarazo no pertenece a la misma clase, la clase donde están
		 * los meses de embarazo es una clase hija, y el padre no hereda los atributos de la hija.
		 */
		System.out.println(rana.toString());
		System.out.println(ballena.toString());
		System.out.println(perro.toString());
		System.out.println(paloma.toString());
	}
}
