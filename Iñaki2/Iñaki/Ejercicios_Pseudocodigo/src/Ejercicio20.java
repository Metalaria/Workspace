import Ejercicio1.LeerTeclado;


public class Ejercicio20 {
	public static void main(String[] args) {
		/*20. Pedir al usuario 10 números enteros y decidir cuántos
		 * son pares y cuántos impares, obtener la suma de los pares
		 * y la media aritmética de los impares.*/

		int cp=0;
		int ci=0;
		int sum=0;
		int med=0;
		int cont=0;
		
		System.out.println("Introduce un numero: ");
		int n=LeerTeclado.readInteger();
		
		while (cont<9)
		{
			if(n%2==0)
			{
				cp++;
				sum=sum+n;
			}
			else
			{
				ci++;
				med=med+n;
			}
			
			cont++;
			System.out.println("Introduce un numero: ");
			n=LeerTeclado.readInteger();
		}
		System.out.println("Pares: "+cp+" Suma Pares: "+sum+" Impares: "+ci+" Media Impares: "+med/2);
	}
}
