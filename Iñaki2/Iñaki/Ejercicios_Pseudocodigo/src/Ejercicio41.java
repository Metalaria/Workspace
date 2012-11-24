import Ejercicio1.LeerTeclado;


public class Ejercicio41 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int a,b,i,c,suma,sumb;
		suma=0;
		sumb=0;
		System.out.println("Introduce dos numeros para ver si son amigos.");
		a=LeerTeclado.readInteger();
		b=LeerTeclado.readInteger();
		
		for(i=1;i<a;i++){
			
			if(a%i==0)suma=suma+i;
		}
		for(c=1;c<b;c++){
			
			if(b%c==0)sumb=sumb+c;
		}

		if (suma==b && sumb==a){
			System.out.println("Los numeros "+a+" y "+b+" son amigos.");
		}
		else{
			System.out.println("Los numeros "+a+" y "+b+" no son amigos.");
		}
	}

}
