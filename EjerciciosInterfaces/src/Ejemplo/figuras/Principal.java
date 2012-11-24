package Ejemplo.figuras;

import java.util.List;
import java.util.Vector;


public class Principal {
	public static void main(String[] args) {

			Figura c1 = new Circulo ("Blanco", 5);
			Figura t1 = new Triangulo ("Rojo",  7, 5);
			Figura r1 = new Rectangulo ("Azul",  9, 2);
			Figura h1 = new Hexagono ("Amarillo",  1, 8);
			
			Vector <Figura> fig = new Vector <Figura>();
			
			fig.add(c1);
			fig.add(t1);
			fig.add(r1);
			fig.add(h1);
			
			for(int i=0; i<((List<Figura>) fig).size(); i++)
				System.out.println(fig.elementAt(i).toString());
			
			int nc=0, nt=0, nr=0, nh=0;
			for (int i=0; i<((List<Figura>) fig).size(); i++)
			{
				if(fig.elementAt(i) instanceof Circulo)
					nc++;
				if(fig.elementAt(i) instanceof Triangulo)
					nt++;
				if(fig.elementAt(i) instanceof Rectangulo)
					nr++;
				if(fig.elementAt(i) instanceof Hexagono)
					nh++;
			}
			
			System.out.println("Hay "+nc+ " circulos, "+nt+" triangulos, "+nr+" rectangulos, "+nh+" hexagonos");
	}
}