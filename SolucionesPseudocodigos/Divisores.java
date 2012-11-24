
public class Divisores {

	public static void main(String[] args) {
		System.out.print("Introduce dos nº ");
		int n1, n2;
		n1=LeerTeclado.readInteger();
		n2=LeerTeclado.readInteger();
		if (n1%n2==0)
			System.out.println (n2 + " es divisor de "+n1);
		else 
			System.out.println (n2 + " no es divisor de "+n1);

	}

}
