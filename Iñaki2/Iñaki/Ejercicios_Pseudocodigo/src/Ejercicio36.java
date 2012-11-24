import Ejercicio1.LeerTeclado;


public class Ejercicio36 {
	public static void main(String[] args) {
		/*36. Algoritmo que lee tres números,
		 * los visualiza en orden creciente e indica si fueron introducidos en ese orden.*/
		
		System.out.println("Introduce el primer numero: ");
		int a=LeerTeclado.readInteger();
		System.out.println("Introduce el segundo numero: ");
		int b=LeerTeclado.readInteger();
		System.out.println("Introduce el tercero numero: ");
		int c=LeerTeclado.readInteger();
		
		if (a<b)
		{
			if (a<c)
			{
				if (b<c)
					System.out.println(a+", "+b+", "+c+". En su orden");
				else 
					System.out.println(a+", "+c+", "+b+". No es su orden");
			}
			else
			{
				if (c<b)
					System.out.println(c+", "+a+", "+b+". No es su orden");
				else
					System.out.println(a+", "+c+", "+b+". No es su orden");
			}
		}
		else
		{
			if (b<c)
			{
				if (a<c)
					System.out.println(b+", "+a+", "+c+". No es su orden");
				else
					System.out.println(b+", "+c+", "+a+". No es su orden");
			}
			else
			{
				if (c<a)
					System.out.println(c+", "+b+", "+a+". No es su orden");
				else
					System.out.println(b+", "+a+", "+c+". No es su orden");
			}
		}
	}
}