
public class DivisoresNumero {

	
	public static void main(String[] args) {

		int n;
		System.out.println("Introduce un nº");
		n=LeerTeclado.readInteger();
		for (int i=1;i<=n/2; i++)
		{ if (n%i==0)
			System.out.println (i+" es divisor de "+n);
		}
		System.out.println (n+" es divisor de "+n);
	}

}
