import Ejercicio1.LeerTeclado;


public class Ejercicio17 {
	public static void main(String[] args) {
		/*17. Algoritmo que calcule la suma de todos los números comprendidos entre dos dados */
		
		System.out.println("Introduce dos numeros: ");
		
		int n1=LeerTeclado.readInteger();
		int n2=LeerTeclado.readInteger();
		int suma=0;
		
		if (n1>n2)
		{
			while (n2<=n1)
			{
				System.out.println(n2);
				suma=suma+n2;
				n2++;
			}
		}
		else
		{
			while (n1<=n2)
			{
				suma=suma+n1;
				n1=n1+1;
			}
		}
		
		
		
		
		System.out.println("Suma total: "+suma);
	}
}