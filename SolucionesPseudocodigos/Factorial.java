
public class Factorial {

	public static void main(String[] args) {
		int n=LeerTeclado.readInteger();
		int factorial=1;
		for (int i=1;i<=n; i++)
			factorial*=i;
		System.out.println("el factorial es "+factorial);

	}

}
