package arrays;

public class ArraysContenidos6 {

	public static void main(String[] args) {
		
		System.out.println("Introduce la longitud de los arrays; no tiene por qué coincidir");
		int longitud1=LeerTeclado.readInteger();
		int longitud2=LeerTeclado.readInteger();
		
		int[] array1=new int[longitud1];
		int[] array2=new int[longitud2];
		
		if (array1.length>array2.length)
			System.out.println ("El array 1 es mayor que el 2 y no puede estar contenido en él");
		else {
			System.out.println("Array 1");
			introducir(array1);
			System.out.println("Array 2");
			introducir(array2);
			System.out.println("Ordenando los arrays...");
			ordenar(array1);
			ordenar (array2);
			System.out.println("El array 1 ordenado es ");
			visualizar(array1);
			System.out.println("El array 2 ordenado es ");
			visualizar(array2);
			if (contenido(array1,array2))
				System.out.println("El array 1 está contenido en el array2");
				else
					System.out.println("El array 1 no está contenido en el array2");
			
		}
			
	}

	public static void introducir (int[] array){
		System.out.println("Introduce las componentes");
		for (int i=0; i<array.length; i++)
			array[i]=LeerTeclado.readInteger();
		System.out.println();	
		
	}
	
	public static void visualizar(int[] array){
			for (int i=0; i<array.length; i++)
				System.out.print(array[i]);
			System.out.println();
		}
	
	public static void ordenar (int[] array){
		int aux;
		//ordena el array de menor a mayor
		for (int i=0; i<array.length-1; i++)
			for (int j=i+1; j<array.length; j++)
				if (array[i]>array[j]) // si la componente i es menor que la siguiente las intercambio 
				     {						
						aux=array[i]; //intercambio la componente i con la siguiente
						array[i]=array[j]; //siempre se usa una variables auxiliar para no perder los valores durante el cambio
						array[j]=aux;
					}
	}
	
	public static boolean contenido (int[] arrayA, int[] arrayB){//evalua si el array 1 esta contenido en el 2
		boolean iguales=true;
		
		for (int i=0; i<arrayA.length && iguales ; i++)
			
			if (arrayA[i] != arrayB[i]) 
				iguales=false;
			
		return iguales;
	}
}
