package Coordenadas;

import Rectangulo.LeerTeclado;

public class Principal {
	public static void main(String[] args) {
		
		Metodos p1,p2;
		
		p1=new Metodos();
		System.out.println("Introduce primera coordenada X: "); 
		int x=LeerTeclado.readInteger();
		System.out.println("Introduce coordenada Y: ");
		int y=LeerTeclado.readInteger();
		p1.setXY(x,y);
		
		p2=new Metodos(x,y);
		System.out.println("Introduce segunda coordenada X: "); 
		x=LeerTeclado.readInteger();
		System.out.println("Introduce coordenada Y: ");
		y=LeerTeclado.readInteger();
		p2.setXY(x,y);
		
		System.out.println("Punto 1: "+ p1.getXY() + "  Punto 2: " + p2.getXY());
		
		//OPUESTO
		System.out.println("Opuestos");
		System.out.println("Punto 1: "+ p1.opuestoXY() + "  Punto 2: " + p2.opuestoXY());
		
		//INCREMENTO
		System.out.println("Introduce incremento de la 1ª cor. de X: "); 
		x=LeerTeclado.readInteger();
		System.out.println("Introduce incremento Y: ");
		y=LeerTeclado.readInteger();
		p1.setXY(x,y);
		
		System.out.println("Introduce incremento de la 2ª cor. de X: "); 
		x=LeerTeclado.readInteger();
		System.out.println("Introduce incremento Y: ");
		y=LeerTeclado.readInteger();
		p2.setXY(x,y);
		
		System.out.println("Punto 1: "+ p1.getXY() + "  Punto 2: " + p2.getXY());
		
		//RECTA
		p1.recta(p2);
		System.out.println(""+p1.recta(p2));
		
	}
}