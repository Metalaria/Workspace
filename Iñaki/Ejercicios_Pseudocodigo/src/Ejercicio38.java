import Ejercicio1.LeerTeclado;


public class Ejercicio38 {
	public static void main(String[] args) {
		/*38. Algoritmo que dado un número diga si es perfecto
		 * (cuando la suma de sus divisores excluido él es igual a dicho número) */
		
		System.out.println("Introduce un numero: ");
		int n=LeerTeclado.readInteger();
		int i,sum=0;
		
		for (i=1; i<n; i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
		}
		
		if (sum==n)
			System.out.println(n+" es un numero perfecto");
		else
			System.out.println(n+" no es un numero perfecto");
	}
}