import Ejercicio1.LeerTeclado;


public class Ejercicio40 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String n,a;
		int c,i;
		c=1;
		System.out.println("Introduce 50 letras y se mostrara cuantas veces se repite la primera.");
		a=LeerTeclado.readString();
		
		for (i=1;i<50;i++){
			n=LeerTeclado.readString();
			if(a.equals(n)){
				c=c+1;
			}
		}
		System.out.println("La letra "+a+" se repite "+c+" veces.");
	}

}
