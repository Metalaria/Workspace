
public class FactorialBis {

	public static void main(String[] args) {
		int n=LeerTeclado.readInteger();
		int factorial=1;
		
		for (int i=n;i>=1; i--)
			factorial*=i;
		System.out.println("el factorial es "+factorial);


	}

}
