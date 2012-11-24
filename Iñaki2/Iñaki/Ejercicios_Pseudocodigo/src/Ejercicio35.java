import Ejercicio1.LeerTeclado;


public class Ejercicio35 {

	
	public static void main(String[] args) {
		
		int a,i,n,c,sumaP;
		boolean primo;
		sumaP=0;
		c=0;
		primo=true;
		n=LeerTeclado.readInteger();
		System.out.println("Introduce un numero");
		for(a=2;c<n;a++){
			primo=true;
			for(i=2;i<=a/2 && primo==true ;i++){
				if(a%i==0){
					primo=false;
				}
			}
			if(primo==true){
				sumaP=sumaP+a;
				c=c+1;
			}
		}
		System.out.println("La suma de los "+n+" primeros numeros primos es: "+sumaP);
	}

}
