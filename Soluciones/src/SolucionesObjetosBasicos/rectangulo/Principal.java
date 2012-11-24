package SolucionesObjetosBasicos.rectangulo;

public class Principal {
	public static void main(String[]args){
		Punto p1=new Punto(2,3);
		Punto p2=new Punto(2,3);
		Punto p3=new Punto(5,5);
		Punto p4=new Punto();
		p1.imprimirP();
		p3.imprimirP();
		p4.imprimirP();
		System.out.println("Distancia de p1 a p2 " + p1.distancia(p2));
		System.out.println("Distancia de p3 a p1 " + p3.distancia(p1));
		System.out.println("Distancia de p1 a p4 " + p1.distancia(p4));
		
		Rectangulo r1=new Rectangulo(p1,p3);
		r1.imprimir();
		System.out.println("Base= "+r1.ancho());
		System.out.println("Altura= "+r1.alto());
		System.out.println("Area= " + r1.area());
		System.out.println("Perimetro= " + r1.perimetro());
		r1.desplazar(4,4);
		r1.imprimir();
		Rectangulo r2=new Rectangulo ();
		r2.imprimir();
		
		Rectangulo r3=new Rectangulo (p3,2,4);
		r3.imprimir();
		
	}
}
