package Figuras;

import java.util.Vector;

import Interfaces.Geometria;

public class TestGeometria {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Vector <Geometria> popurri = new Vector <Geometria>();

		Casa a1 = new Casa("C/ Pez",4,700,300);
		Figura a2 = new Rectangulo("Rojo",5,7);
		Figura a3 = new Circulo("Rojo",5);
		
		popurri.add(a1);
		popurri.add(a2);
		popurri.add(a3);
		
		for(int i=0;i<popurri.size();i++){
			if(popurri.elementAt(i) instanceof Casa){
				System.out.println("Soy una casa");
			}
			else{
				System.out.println("Soy una figura");
			}
			System.out.println("El area es "+popurri.elementAt(i).calcularArea());
			System.out.println("El preimetro es "+popurri.elementAt(i).calcularPerimetro());
		}

	}

}
