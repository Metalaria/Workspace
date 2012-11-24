import Ejercicio1.LeerTeclado;


public class Ejercicio43 {
	public static void main(String[] args) {
		/*43. Sumar una serie (que acabará con un 0) de números enteros
		 * decidiendo si dicha serie está ordenada o no de mayor a menor.*/
		
		int sum=0;
		int conto=1;
		int cont=0;
		
		System.out.println("Introduce un numero (0 para fin): ");
		int n=LeerTeclado.readInteger();
		int m=0;
		
		while (n!=0)
		{			
			sum=m+n;
			cont++;
			if (n<=m)
				conto=conto+1;
			m=n;
			System.out.println("Introduce un numero (0 para fin): ");
			n=LeerTeclado.readInteger();
		}
		
		System.out.println("Total: "+sum);
		if (cont==conto)
			System.out.println("La serie está ordenada");
		else
			System.out.println("La serie no está ordenada");
	}
}