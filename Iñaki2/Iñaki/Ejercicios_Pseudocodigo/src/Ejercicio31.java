import Ejercicio1.LeerTeclado;


public class Ejercicio31 {
	public static void main(String[] args) {
		/*31. Idem contando las veces que se repite N en la serie*/
		
		System.out.println("Introduce un numero: ");
		int n=LeerTeclado.readInteger();
		int m=1;
		int sw=0;
		int cont=0;
		
		while (m!=0)
		{
			System.out.println("Introduce otro numero (cero para fin): ");
			m=LeerTeclado.readInteger();
			if(n==m)
			{
				sw=1;
				cont++;
			}
		}
		if (sw==1)
			System.out.println("El numero "+n+" se encuentra en la serie y se repite "+cont+" veces");
		else
			System.out.println("El numero "+n+" no se encuentra en la serie");
	}
}