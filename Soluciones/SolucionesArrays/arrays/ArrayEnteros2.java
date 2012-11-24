package arrays;

public class ArrayEnteros2 {

	public static void main(String[] args) {
		int[] array1 = new int[5];
				
		inicializarVector(array1);
		visualizar(array1);
		System.out.println("La suma de las componentes es "+sumaComponentes (array1));
		contarPares(array1);
		maximo(array1);
				
	}
	public static void inicializarVector(int[] array){ //método que inicializa el array
		System.out.println("Introduce las componentes");
		for(int i=0;i<array.length;i++)
			array[i]=LeerTeclado.readInteger();
	}
	
	public static void visualizar(int[] array){ //método que visualiza el array
		System.out.println("Las componentes del array mayores de 17 son ");
		for(int i=0;i<array.length;i++)
			if (array[i]>=17) System.out.println(array[i]);
	}

	public static int sumaComponentes (int[] array){
		int suma=0;
		for(int i=0;i<array.length;i++)
			suma+=array[i];
		return suma;
	}
	
	public static void contarPares(int[] array){
		int cont0,contP,contN;
		cont0=contP=contN=0;
		for (int i=0; i<array.length; i+=2){
			if (array[i] > 0)
				contP++;
			else if (array[i] < 0)
				contN++;
			else
				cont0++;
		}
		System.out.println("El total de 0 en las posiciones pares es "+cont0);
		System.out.println("El total de positivos en las posiciones pares es "+contP);
		System.out.println("El total de negativos en las posiciones pares es "+contN);
	}

	
	public static void maximo(int[] array){
		int max=Integer.MIN_VALUE;
		int contMax=0;
		for (int i=0;i<array.length;i++)
			if (array[i]>max){
				max=array[i];
				contMax=1;
			}
			else if (array[i]==max)
				contMax++;
		System.out.println("El máximo del array es "+max+ " y se repite "+contMax+" veces");
	}
}
