import Ejercicio1.LeerTeclado;


public class Ejercicio13 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int suma,n,media,contador;
		contador=0;
		media=0;
		suma=0;
		System.out.println("Introduce numeros.Cuando introduzcas 0 se realizara la media");
		n=LeerTeclado.readInteger();
		while (n!=0) {
			
			suma=suma+n;
			contador=contador+1;
			n=LeerTeclado.readInteger();
		}
		media=suma/contador;
		System.out.println("El resultado de la media es: "+media);
		

	}

}
