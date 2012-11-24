package Animales;

public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Animal rana=new Animal("Rana","Ranacius Maximux",0.5,3);
		Mamifero ballena=new Mamifero("Ballena","Ballena Azul",3000,200,2,12);
		MamiferoTerrestre perro=new MamiferoTerrestre("Dingo","Perro Doberman",30,10,14,8,4);
		Ave avestruz=new Ave("Pollo Grande","Avestruz",50,10,3,false);
		Ave paloma=new Ave("Rata Voladora","Paloma",1,4,4,true);
		
		// Visualizar Animales
		System.out.println(rana.toString());
		System.out.println(ballena.toString());
		System.out.println(perro.toString());
		System.out.println(avestruz.toString());
		System.out.println(paloma.toString());
		
		//Modificar datos
		System.out.println("Modifica el peso de la Rana");
		int peso=LeerTeclado.readInteger();
		rana.setPeso(peso);
		System.out.println("Modifica el peso de la Ballena");
		peso=LeerTeclado.readInteger();
		ballena.setPeso(peso);
		System.out.println("Modifica el numero de huevos de la paloma");
		int numeroHuevos=LeerTeclado.readInteger();
		paloma.setNumeroHuevos(numeroHuevos);
		System.out.println("Incremento tamaño perro 10%");
		int porcentaje=10;
		perro.incrementoTamaño(porcentaje);
		System.out.println("Cambio meses embarazo Ballena");
		int mesesEmbarazo=LeerTeclado.readInteger();
		ballena.setMesesEmbarazo(mesesEmbarazo);
		// No se puede cambia los meses de embarazo de la rana por que no tiene ese atributo el objeto rana.
		
		// Visualizar Animales
		System.out.println(rana.toString());
		System.out.println(ballena.toString());
		System.out.println(perro.toString());
		System.out.println(avestruz.toString());
		System.out.println(paloma.toString());
		
		
	}
}
