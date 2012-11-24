package Ejercicio06;


public class CartaMejorada {
	String palo[] = {"Corazones", "Picas", "Diamantes", "Treboles"};
	String nombre[] = {"As", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Ocho", "Nueve", "Diez", "Sota", "Caballo", "Rey"};
	double valor[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0.5, 0.5, 0.5};
	int baraja[][] = new int [4][13];
	
	public CartaMejorada()
	{
		for(int i=0; i<baraja.length; i++)
			for (int j=0; j<baraja.length; j++)
				baraja[i][j]=0;
	}
	
	public void repartir()
	{
		double jugador=0f, croupier=0f;
		int fin=21, r=1, cartaj=0, cartac=0, pl=0;
		
		while(r==1 && croupier<fin && jugador<fin)
		{
			cartaj=(int) (Math.random() *13 +1);
			pl=(int) (Math.random() *4 +1);
			
			while (baraja[pl-1][cartaj-1]==1)
			{
				cartaj=(int) (Math.random() *13 +1);
				pl=(int) (Math.random() *4 +1);
			}
			
			jugador+=valor[cartaj-1];
			baraja[pl-1][cartaj-1]=1;
			
			if (croupier<17)
			{
				cartac=(int) (Math.random() *13 +1);
				croupier+=cartac;
			}
			
			ver(jugador, cartaj, pl);
			
			if(croupier<fin && jugador<fin)
			{	
				System.out.println("Pulsa 0 para plantarte o 1 para seguir");
				r=LeerTeclado.readInteger();
			}
			comprobar(croupier,jugador,fin,r);
		}
		System.out.println("Jugador: "+jugador+" Croupier "+croupier);
	}
	
	public void comprobar(double c, double j, int f, int r)
	{
		if (c>f && j>f)
			System.out.println("Perdeis");
		else
		{
			if(j>f || c==f)
				System.out.println("Pierdes");
			if(c>f || j==f)
				System.out.println("Ganas");
		}
		
		if(r==0)
			if(j>c)
				System.out.println("Tu ganas");
			else
				System.out.println("Tu pierdes");
	}
	
	public void ver(double j, int cj, int p)
	{
		System.out.println("Tu carta es el "+nombre[cj-1]+" de "+palo[p-1]);
		System.out.println("Tu puntuación es de "+j);
		
	}
}