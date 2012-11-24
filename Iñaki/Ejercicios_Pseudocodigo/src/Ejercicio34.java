import Ejercicio1.LeerTeclado;


public class Ejercicio34 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a,i,n;
		boolean primo;
		primo=true;
		System.out.println("Introduce un numero que no sera superado por los primos.");
		n=LeerTeclado.readInteger();
		
		for(a=2;a<=n;a++){
			primo=true;
			for(i=2;i<=a/2 && primo==true ;i++){
				if(a%i==0){
					primo=false;
				}
			}
			if(primo==true){
				System.out.println(a); 
			}
		}
		
	}
}
