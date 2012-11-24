import Ejercicio1.LeerTeclado;


public class Ejercicio26 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i,x,y,resultado;
		resultado=0;
		
		System.out.println("Introduce x");
		x=LeerTeclado.readInteger();
		System.out.println("Introduce y");
		y=LeerTeclado.readInteger();
		
			for(i=1;i<=y;i++){
				resultado=resultado+x;
			}
			System.out.println(resultado);
	}

}
