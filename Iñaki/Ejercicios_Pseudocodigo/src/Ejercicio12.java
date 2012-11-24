import Ejercicio1.LeerTeclado;


public class Ejercicio12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int suma,n;
		suma=0;
		do {
			System.out.println("Introduce un numero a sumar.Cuando quieras que se realize la suma introduce 0");
			n=LeerTeclado.readInteger();
			suma=suma+n;
		}
		while (n!=0);
		System.out.println("El resultado es: "+suma);
		

	}

}
