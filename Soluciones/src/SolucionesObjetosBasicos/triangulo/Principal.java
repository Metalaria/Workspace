package SolucionesObjetosBasicos.triangulo;

public class Principal {

	public static void main(String[] args) {
		System.out.println("introduce lado y altura");
		int b=LeerTeclado.readInteger();
		int a=LeerTeclado.readInteger();
		Triangulo t1=new Triangulo(b,a);
		System.out.println("area= "+t1.area());
		System.out.println("perimetro= "+t1.perimetro());
		System.out.println("datos del triangulo "+t1.toString());

	}

}
