/**
 * @author almudena
 * 
 */
public class DivisibleBis {

	public static void main(String[] args) {
		int a, b;
		System.out.println("introduce a y b");
		a = LeerTeclado.readInteger();
		b = LeerTeclado.readInteger();
		//Si a no es divisible por b, pero sí al revés, se intercambian
		
		if (b != 0 && a % b == 0) // es importante poner el orden de las
									// condiciones en el and porque si la
									// division va al principio, daria un error
									// al dividir por 0
									// poner en la condicion (b!=0 & a%b daria
									// error si b=0 porque evalúa ambas
									// condiciones y al dividir por 0 daría
									// error
			System.out.println(a + " es divisible por " + b);
		else if (a != 0 && b % a == 0)
			System.out.println(b + " es divisible por " + a);
		else
			System.out.println("no son divisibles");

	}

}
