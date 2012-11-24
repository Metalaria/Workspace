package arrays;

public class BuscarCifra8 {
	public static void main(String[]args){
		int num,cifra;
		
		do{ //valida que tenga 6 cifras 
			System.out.println("Introduce un numero de 6 cifras");
			num=LeerTeclado.readInteger();
		}
		while (numeroCifras(num)!=6); 
		
		int []cifras=descomponerCifras(num); //descompone las cifras en el array
		
		do{
			System.out.println("Introduce una cifra entre 0 y 9");
			cifra=LeerTeclado.readInteger();}
		while (cifra<0 || cifra>9);
		
		if(buscar(cifra, cifras)>0){ //el metodo retorna un entero que se compara con 0
			System.out.print("La cifra " + cifra+ " está en el número " + num);
			System.out.print(" y se repite "+ buscar(cifra,cifras)+ " veces");
		}
		else 
			System.out.println("La cifra " + cifra+ " no está en el número " + num);
		
	}

	public static int numeroCifras (int num){ //metodo que cuenta las cifras del nº
		int c=0;
		while(num>0){
			num=num/10;
			c++;
		}
		return c;
	}
	
	public  static int[]descomponerCifras(int num){ //metodo que guarda las cifras en el array
		int[]cifras=new int[6];
		int i;
		i=cifras.length-1;
		while(num>0){
			cifras[i]=num%10;
			num=num/10;
			i--;
		}
		 
	 return cifras;
			
	}
	
	public static int buscar(int cifra, int [] numCifras){ //metodo que busca una cifra en el array
		int c=0;
		for (int i=0;i<numCifras.length;i++)
			if(cifra==numCifras[i]){
				c++;
			}
		return c;
	}
	
}
