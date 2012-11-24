import Ejercicio1.LeerTeclado;


public class Ejercicio14 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int a,n;
		a=3;
		System.out.println("Intruduze un numero que no sera superado.");
		n=LeerTeclado.readInteger();
		System.out.println("Multiplos de 3 hasta "+n);
		while (a<=n){
			
			System.out.println(a);
			a=a+3;
		}
		if (n<3){
			System.out.println("El numero introducido es demasiado pequeño.");
		}
		

	}

}
