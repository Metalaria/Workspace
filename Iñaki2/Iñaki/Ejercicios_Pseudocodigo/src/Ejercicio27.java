import Ejercicio1.LeerTeclado;


public class Ejercicio27 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int negativo,n;
		
		negativo=0;
		do {
			System.out.println("Introduce un numero, para terminar introduce 0");
			n=LeerTeclado.readInteger();
			if (n<0){
				negativo=1;
			}
		}
		while (n!=0);
		
		
		if(negativo==1){
			System.out.println("Se ha introducido un numero negativo");
		}		
		else {
			System.out.println("No se ha introducido un numero negativo");
		}

	}

}
