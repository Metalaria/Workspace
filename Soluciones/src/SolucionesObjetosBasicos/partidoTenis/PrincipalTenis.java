package SolucionesObjetosBasicos.partidoTenis;

public class PrincipalTenis {

	public static void main(String[] args) {
		String nb1,nb2;
		double p1,p2;
		System.out.println("Introduce el nombre y puntuacion del jugador 1");
		nb1=LeerTeclado.readString();
		p1=LeerTeclado.readDouble();
		System.out.println("Introduce el nombre y puntuacion del jugador 2");
		nb2=LeerTeclado.readString();
		p2=LeerTeclado.readDouble();
		Jugador j1=new Jugador(nb1,p1);
		Jugador j2=new Jugador(nb2,p2);
		Partido partido=new Partido(j1,j2);
		partido.jugar();
		
		
		
		
		

	}

}
