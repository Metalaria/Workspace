import Ejercicio1.LeerTeclado;


public class Ejercicio16 {
	public static void main(String[] args) {
		/*16. Visualizar el factorial de un número*/
		
		System.out.println("Introduce un numero: ");
		int f=LeerTeclado.readInteger();
		int fact=1;
		
		while (f>0)
		{
			fact=fact*f;
			f--;
		}
		
		System.out.println(fact);
	}
}