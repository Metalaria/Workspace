package BlackJack;



public class PrincipalBlackJack {

	public static void main(String[] args) {
		
		final String[] palo={"Corazones", "Picas", "Rombos","Treboles"};
		final String [] nombreCarta={"As","Dos","Tres","Cuatro","Cinco","Seis","Siete","Ocho","Nueve","Diez","J","Q","K"};
		final double [] valorCarta={1,2,3,4,5,6,7,8,9,10,0.5,0.5,0.5};
		
		double puntJug, puntOrd;
		String continuar, respuesta;
		
		do {
			
		
		puntJug=0;
		continuar="";
		do {
			int pal=(int)(Math.random() * 4);		
			int num=(int)(Math.random() * 13);
			Carta carta=new Carta (palo[pal],nombreCarta[num],valorCarta[num]);
			System.out.println(carta.toString());
			puntJug+=carta.getValor();
			System.out.println("Llevas acumulados "+puntJug);
			if (puntJug>17)
				System.out.println("¡¡Lo siento, te has pasado!!");
			else {
			System.out.println("¿Deseas otra carta? (s/n)");
			continuar=LeerTeclado.readString();
			}
		}
		while (puntJug<=21 && continuar.equalsIgnoreCase("s"));
		
		if (puntJug<=21)
			{
			System.out.println("Ahora juega el ordenador");
			puntOrd=(int)(Math.random() * 21)+1;
			System.out.println("Puntuacion del ordenador: "+puntOrd);
			if (puntJug>puntOrd)
				System.out.println("¡¡Enhorabuena, has ganado!!");
			else System.out.println("¡¡Lo siento, el ordenador gana!!");
			
		}
		System.out.println("¿Deseas jugar de nuevo?");
		respuesta=LeerTeclado.readString();
		
		}
		while (respuesta.equalsIgnoreCase("s"));
	}
	
	}
	

	


