

public class FibonacciRecursivo {

	public static void main(String[] args) {
		int n;
		System.out.println("Introduce un nº");
		n = LeerTeclado.readInteger();
		System.out.println("Los "+n+" primeros números de la serie de fibonacci son");
		for (int j=1; j<=n;j++)
			System.out.println(fibonacci(j));
		

	}
	public static int fibonacci(int i){
		if (i == 1)
			return 0;
		else if (i == 2)
			return 1;
		else
			return fibonacci(i - 1) + fibonacci(i - 2);
	}
}
