import Ejercicio1.LeerTeclado;


public class Ejercicio09 {

	public static void main(String[] args) {
		int a,b,c;
		do {
		System.out.println("Introduzca un numero del 1 al 10");
		a=LeerTeclado.readInteger();
		}
		while (a<1 || a>10);
		
		for (b=1; b<=10; b++){
			c=a*b;
			System.out.println(a+" * "+b+" = "+c);
		}

	}

}
