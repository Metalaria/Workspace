package arrays;

public class Notas3 {

	public static void main(String[] args) {

		int[] numeros=new int[10];
		int n,i,j;
		
		do{
			System.out.println("introduce un número entre 0 y 10");
			n=LeerTeclado.readInteger();
		}
		while (n<0);
		
		while (n>0 && n<11){
			numeros[n-1]++;
			do{
				System.out.println("introduce un entre 0 y 10");
				n=LeerTeclado.readInteger();
			}
			while (n<0);
		}
		
		for(i=0;i<numeros.length; i++){
			j=i+1;
			System.out.println("El número "+j+" se repite "+numeros[i]+" veces");
		}

	}

}
