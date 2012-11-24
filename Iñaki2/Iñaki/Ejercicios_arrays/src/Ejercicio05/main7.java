package Ejercicio05;

public class main7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Introduca longitud array 1: ");
		int n=LeerTeclado.readInteger();
		System.out.println("Introduca longitud array 2: ");
		int m=LeerTeclado.readInteger();
		
		// Declarar Array con los tamaños aignados.
		int [] arrayN=new int[n];
		int [] arrayM=new int[m];
		
		//Inicializar Arrays 
		inicializar(arrayN);
		inicializar(arrayM);
		//Ordenar Arrays
		ordenar(arrayN);
		ordenar(arrayM);
		//Comprovar cual es el mayor
		boolean swContenido;
		if(arrayN.length<arrayM.length){
			swContenido=contenido(arrayN,arrayM);	//ver si array 1 esta contenido en array 2
			if(swContenido=true){
				System.out.println("El array 1 está contenido en el 2");
			}
			else{
				System.out.println("El array 1 no está contenido en el 2");
			}
		}
		else{
			swContenido=contenido(arrayM,arrayN);	//ver si array 2 esta contenido en array 1
			if(swContenido=true){
				System.out.println("El array 2 está contenido en el 1");
			}
			else{
				System.out.println("El array 2 no está contenido en el 1");
			}
		}
		
	}
	

	//Introducir datos en array.
	public static void inicializar(int array[]){
		
		for (int i=0; i<array.length;i++){
		System.out.println("Introduce un valor para la posicion "+i+" del array");
		array[i]=LeerTeclado.readInteger();
		}
	}
	//Ordena los array
	public static void ordenar(int array[]){
		int aux;
		for(int i=0;i<array.length;i++){//mostrar array desordenado
				
				System.out.print(array[i]+" ");
			}
		System.out.println("Array desordenado");
		for(int i=0;i<array.length-1;i++){
			for(int j=i+1;j<array.length;j++){
				if(array[i]>array[j]){
					aux=array[i];
					array[i]=array[j];
					array[j]=aux;
				}
			}
		}
		for(int i=0;i<array.length;i++){//mostrar array ordenado
			System.out.print(array[i]+" ");
		}
		System.out.println("Array ordenado");
	}
	//Busqueda si uno esta dentro de el otro.
	public static boolean contenido(int array1[],int array2[]){
		int a=0;
		int b=0;
		do{
			if(array1[a]==array2[b]){
				a=a+1;
				b=b+1;
			}
			else{
				b=b+1;
				a=0;
			}
			
		}while(a<array1.length && b<array2.length);
		if(a==array1.length){
			return true;
		}
		else {
			return false;
		}
	}
}
