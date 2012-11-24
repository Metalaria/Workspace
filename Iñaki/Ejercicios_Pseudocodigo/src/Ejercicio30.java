import Ejercicio1.LeerTeclado;


public class Ejercicio30 {
	public static void main(String[] args) {
	/*30. Algoritmo que dado un nº N y una serie de números
	 * terminada en 0 indique si el número N se encuentra en la serie*/

		System.out.println("Introduce un numero: ");
		int n=LeerTeclado.readInteger();
		int m=1;
		int sw=0;
		
		while (m!=0)
		{
			System.out.println("Introduce otro numero (cero para fin): ");
			m=LeerTeclado.readInteger();
			if(n==m)
				sw=1;
		}
		if (sw==1)
			System.out.println("El numero "+n+" se encuentra en la serie");
		else
			System.out.println("El numero "+n+" no se encuentra en la serie");
	}
}