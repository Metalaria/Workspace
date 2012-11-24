import Ejercicio1.LeerTeclado;


public class Ejercicio32 {


	public static void main(String[] args) {
		int a,i;
		boolean primo;
		primo=true;
		a=LeerTeclado.readInteger();
		for(i=2;i<=a/2 && primo==true ;i++){
			if(a%i==0){
				primo=false;
			}
		}
		if(primo==true){
			System.out.println("El numero "+a+" es primo"); 
		}
		else{
			System.out.println("El numero "+a+" no es primo");
		}
	}

}
