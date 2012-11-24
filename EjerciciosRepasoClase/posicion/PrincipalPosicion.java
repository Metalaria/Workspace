package posicion;

public class PrincipalPosicion {

	public static void main(String[] args) {

		Posicion p1=new Posicion();
		System.out.println("Punto 1");
		System.out.println("x= "+p1.getX());
		System.out.println("y= "+p1.getY());
		
	
		
		Posicion p2=new Posicion(3,2);
		
		System.out.println("Punto 2");
		System.out.println("x= "+p2.getX());
		System.out.println("y= "+p2.getY());
		
		Posicion p3=new Posicion(p2);

		System.out.println("Punto 3");
		System.out.println("x= "+p3.getX());
		System.out.println("y= "+p3.getY());
		
		p1.setXY(8,9);
		
		System.out.println("Punto 1 despues de modificarse");
		System.out.println(p1.toString());
		
		System.out.println("opuesto del punto 2");
		Posicion opuesto=p2.opuestoXY();
		System.out.println(opuesto.toString());
		
		System.out.println(p2.opuestoXY().toString());

	}

}
