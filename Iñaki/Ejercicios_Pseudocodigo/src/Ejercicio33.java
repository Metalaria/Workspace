import Ejercicio1.LeerTeclado;


public class Ejercicio33 {


	public static void main(String[] args) {
	
		int a,i,n,c;
		boolean primo;
		c=0;
		primo=true;
		System.out.println("Introduce un numero y se mostraran tantos primos como el numero introducido.");
		n=LeerTeclado.readInteger();
		
		for(a=2;c<n;a++){
			primo=true;
			for(i=2;i<=a/2 && primo==true ;i++){
				if(a%i==0){
					primo=false;
				}
			}
			if(primo==true){
				System.out.println(a);
				c=c+1;
			}
		}
	}

}
