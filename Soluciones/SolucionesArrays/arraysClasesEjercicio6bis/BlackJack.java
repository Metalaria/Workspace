package arraysClasesEjercicio6bis;

import arrays.LeerTeclado;


public class BlackJack {

	public static void main(String[] args) {
		double puntJug, puntOrd;
		String continuar, respuesta;
		
		do {
			
		puntJug=0;
		continuar="";
		System.out.println("Comienza el juego, sacando una carta al azar...");
		
		do {
			
			Carta carta=new Carta ();
			System.out.println(carta.toString());
			puntJug+=carta.getValor();
			System.out.println("Llevas acumulados "+puntJug);
			if (puntJug>17)
				System.out.println("¡¡Lo siento, te has pasado!!");
			else {
				do{
					System.out.println("¿Deseas otra carta(s/n)?");
					continuar=LeerTeclado.readString();
				}
				while (!continuar.equalsIgnoreCase("s")&&!continuar.equalsIgnoreCase("n"));
			
			}
		}
		while (puntJug<=17 && continuar.equalsIgnoreCase("s"));
		
		if (puntJug<=17)
			{
			System.out.println("Ahora juega el ordenador");
			puntOrd=(int)(Math.random() * 17)+1;
			System.out.println("Puntuacion del ordenador: "+puntOrd);
			if (puntJug>puntOrd)
				System.out.println("¡¡Enhorabuena, has ganado!!");
			else System.out.println("¡¡Lo siento, el ordenador gana!!");
			
		}
			do{
				System.out.println("¿Deseas jugar de nuevo(s/n)?");
				respuesta=LeerTeclado.readString();
			}
			while (!respuesta.equalsIgnoreCase("s")&&!respuesta.equalsIgnoreCase("n"));
			
			}
		while (respuesta.equalsIgnoreCase("s"));
		
		System.out.println("Fin del programa, adiós...");
	}
	

	}


