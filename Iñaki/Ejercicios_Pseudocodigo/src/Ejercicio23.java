import Ejercicio1.LeerTeclado;


public class Ejercicio23 {
	public static void main(String[] args) {
		/*23. Algoritmo que calcule todos los divisores de un nº N*/
			
		System.out.println("Introduce un numero: ");
		int n=LeerTeclado.readInteger();
		int i;
		
		for (i=1; i<=n; i++)
		{
			if(n%i==0)
			{
				System.out.println(i);
			}
		}
	}
}