package objetos;

import ejerciciosMetodos.LeerTeclado;

public class PrincipalRectangulo {
	
	public static void main(String[] args) {
		
		Rectangulo r1, r2;
		
		r1=new Rectangulo();
		System.out.println("Creamos el rectangulo 1...");
		System.out.println("Introduce base");
		int b=LeerTeclado.readInteger();
		System.out.println("Introduce altura");
		int a=LeerTeclado.readInteger();
		
		//rellenamos la base y altura de r1
		
		r1.setBase(b);
		r1.setAltura(a);
		
		System.out.println("Creamos el rectangulo 2...");
		System.out.println("Introduce base");
		b=LeerTeclado.readInteger();
		System.out.println("Introduce altura");
		a=LeerTeclado.readInteger();
		
		r2=new Rectangulo( b, a);
	
		System.out.println(r1.toString());
		System.out.println(r2.toString());
		
		System.out.println("Area del rectangulo 1= "+r1.area());
		System.out.println("Perimetro del rectangulo 1= "+r1.perimetro());
		
		System.out.println("Area del rectangulo 2= "+r2.area());
		System.out.println("Perimetro del rectangulo 2= "+r2.perimetro());
		
		if (r1.area()>=r2.area())
			System.out.println("el rectangulo 1 tiene un área mayor o igual");
		else
			System.out.println("el rectangulo 2 tiene un área mayor ");
		
		if (r1.areaMayor(r2))
			System.out.println("el rectangulo 1 tiene un área mayor o igual");
		else
			System.out.println("el rectangulo 2 tiene un área mayor ");
			
		
		
	}

}
