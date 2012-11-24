import Ejercicio1.LeerTeclado;


public class Ejercicio37 {
	public static void main(String[] args) {
		/*37. Algoritmo que determine cuántas cifras posee un número
		 * entero positivo introducido por teclado.*/
		
		System.out.println("Introduce una cifra: ");
		int n=LeerTeclado.readInteger();
		int cont=1;
		
		while (n/10!=0)
		{
			n=n/10;
			cont++;
		}
		System.out.println(cont);
	}
}