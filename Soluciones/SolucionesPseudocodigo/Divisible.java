
public class Divisible {

	public static void main(String[] args) {
		int a, b;
		System.out.println("introduce a y b");
		a = LeerTeclado.readInteger();
		b = LeerTeclado.readInteger();
		if (b==0)
			System.out.println("No se puede dividir por 0");
		else {
			if (a % b == 0) 
				System.out.println(a + " es divisible por " + b);
			else System.out.println(a + " no es divisible por " + b);
		
		}

	}

}
