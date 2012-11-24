import Ejercicio1.LeerTeclado;


public class Ejercicio21 {
	public static void main(String[] args) {
		/*21. Aceptar números por teclado hasta que la suma de todos ellos sea superior a 1000*/
		
		int sum=0;
		
		do 
		{
			System.out.println("Introduce un numero");
			int n=LeerTeclado.readInteger();
			sum=sum+n;
		}
		while (sum<1000);
			
		System.out.println("Total: "+sum);
	}
}