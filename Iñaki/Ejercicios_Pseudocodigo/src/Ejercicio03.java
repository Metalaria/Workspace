import Ejercicio1.LeerTeclado;


public class Ejercicio03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int a,b,c;
		double x1,x2,raiz;
		System.out.println("Introduce un numero para a");
		a=LeerTeclado.readInteger();
		System.out.println("Introduce un numero para b");
		b=LeerTeclado.readInteger();
		System.out.println("Introduce un numero para c");
		c=LeerTeclado.readInteger();
		raiz=b*b-4*a*c;
		
		if(raiz<0){
			System.out.println("El resultado no es posible por que tiene raiz negativa");
		}
		else{
		x1=(-b+Math.sqrt(b*b-4*a*c))/(2*a);
		x2=(-b-Math.sqrt(b*b-4*a*c))/(2*a);
		System.out.println("El resultado de x1 es:"+x1);
		System.out.println("El resultado de x2 es:"+x2);
		}
		

		
				
	}

}
