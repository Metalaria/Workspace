
public class Ejercicio1 {

	public static void main(String[] args) {
		int n, contAprob=0, contSusp=0;
		double porcAprob, porcSusp;
		boolean swCero=false, swDiez=false;
		
		do {
			System.out.println("Introduce una nota de 0 a 10 o -1 para salir");
			n=LeerTeclado.readInteger();
		}
		while (n<-1 || n>10 );
		
		while (n!=-1){
			if (n==0)
				swCero=true;
			else if (n==10)
				swDiez=true;
			
			if (n>=5)
				contAprob++;
			else contSusp++;
			
			do {
				System.out.println("Introduce una nota de 0 a 10 o -1 para salir");
				n=LeerTeclado.readInteger();
			}
			while (n<-1 || n>10 );	
		}
		
		if (contAprob + contSusp == 0)
			System.out.println("No se ha introducido ninguna nota");
		else {
			porcAprob = ((double) contAprob / (contAprob + contSusp)) * 100;
			porcSusp = 100 - porcAprob;

			System.out.println("Porcentaje de aprobados " + porcAprob);
			System.out.println("Porcentaje de suspensos " + porcSusp);
			if (swCero)
				System.out.println("Ha habido algún cero");
			else
				System.out.println("No ha habido algún cero");

			if (swDiez)
				System.out.println("Ha habido algún diez");
			else
				System.out.println("No ha habido algún diez");

		}
		

	}

}
