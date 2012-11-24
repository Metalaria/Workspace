import Ejercicio1.LeerTeclado;


public class Ejercicio18 {
	public static void main(String[] args) {
		/*18. Algoritmo que calcule el valor mínimo, máximo y medio 
		 * de una serie de números introducidos por teclado 
		 * (la serie termina cuando se introduce un 0).*/
		
		int min=99999;
		int max=-99999;
		int med=0;
		int cont=0;
		
		System.out.println("Introduce un numero (cero para fin): ");
		int n=LeerTeclado.readInteger();
		
		while (n!=0)
		{
			if (n<min)
				min=n;
			if (n>max)
				max=n;
			
			med=med+n;
			cont++;
			System.out.println("Introduce un numero (cero para fin): ");
			n=LeerTeclado.readInteger();
		}
		System.out.println("Maximo: "+max+"Minimo: "+min+"Media: "+med/cont);
	}
}