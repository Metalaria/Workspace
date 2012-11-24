package Ejercicio05;


public class main5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		System.out.println("Introduca longitud array 1: ");
		int n=LeerTeclado.readInteger();
		System.out.println("Introduca longitud array 2: ");
		int m=LeerTeclado.readInteger();
		
		// Declarar Array con los tamaños aignados.
		int [] arrayN=new int[n];
		int [] arrayM=new int[m];
		
		//Inicializar Arrays 
		inicializar(arrayN,n);
		inicializar(arrayM,m);
		//ver si array 1 esta contenido en array 2
		contenido(arrayN,arrayM);
		
		
	}
	

	//Introducir datos en array.
	public static void inicializar(int array[],int n){
		
		for (int i=0; i<n;i++){
		System.out.println("Introduce un valor para la posicion "+i+" del array");
		array[i]=LeerTeclado.readInteger();
		}
	}
	
	//Busqueda si uno esta dentro de el otro.
	public static void contenido(int arrayN[],int arrayM[]){
		int a=0;
		int b=0;
		do{
			if(arrayN[a]==arrayM[b]){
				a=a+1;
				b=b+1;
			}
			else{
				b=b+1;
				a=0;
			}
			
		}while(a<arrayN.length && b<arrayM.length);
		if(a==arrayN.length){
			System.out.println("El array 1 está contenido en el 2");
		}
		else System.out.println("El array 1 no está contenido en el 2");
	}
}
