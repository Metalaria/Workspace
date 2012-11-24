package SolucionesObjetosBasicos.recta;


public class Principal {

	public static void main(String[] args) {
		int x1,y1,x2,y2, inc1, inc2;
		System.out.println("Introduce las coordenadas del punto 1");
		x1=LeerTeclado.readInteger();
		y1=LeerTeclado.readInteger();
		System.out.println("Introduce las coordenadas del punto 1");
		x2=LeerTeclado.readInteger();
		y2=LeerTeclado.readInteger();
		
		
		Posicion p1=new Posicion (x1,y1);
		Posicion p2=new Posicion (x2,y2);
	
		System.out.println("Coordenadas del punto p1 ");
		p1.getXY();
		System.out.println("Coordenadas del punto p2 ");
		p2.getXY();
		
		System.out.println("Coordenadas del opuesto del punto p1 ");
		p1.opuesto().getXY();
		System.out.println("Coordenadas del opuesto del punto p2 ");
		p2.opuesto().getXY();
		
		System.out.println("Introduce los valores para incrementar y decrementar el punto");
		inc1=LeerTeclado.readInteger();
		inc2=LeerTeclado.readInteger();
		
		System.out.println("Coordenadas del punto p1 después del incremento");
		p1.incXY(inc1, inc2).getXY();
		
		System.out.println("Coordenadas del punto p1 después del decremento");
		p1.decXY(inc1, inc2).getXY();
		
		p1.recta(p2);
	
		
		
		

	}

}
