package objetos;

import ejerciciosMetodos.LeerTeclado;

public class PrincipalRectangulo {
	
	public static void main(String[] args) {
		
		Rectangulo r1, r2, r3;
		
		r3=new Rectangulo();
		System.out.println(r3.toString());
		
		/*r1=new Rectangulo();
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
			
		
		
	}*/
		
		Circulo c1=new Circulo();
		System.out.println("radio= "+c1.getRadio());
		c1.setRadio(2);
		System.out.println("radio= "+c1.getRadio());
		c1.incRadio(1);
		System.out.println("radio= "+c1.getRadio());
		Circulo c2=new Circulo(3);
		System.out.println("longitud circulo 2 "+c2.longitud());
		System.out.println("area del circulo 1 "+c1.area());
		Rectangulo r4=new Rectangulo (5,3);
		System.out.println("area del rectangulo 4 "+r4.area());
		if (r4.area()>=c2.area())
			System.out.println("el rectangulo tiene area mayor");
		else System.out.println("el rectangulo tiene area menor");
}
}

