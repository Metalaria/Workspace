package arrays;

public class SumaArrays1 {

	public static void main(String[] args) {
		int[] array1 = new int[10];
		int[] array2 = new int[10];
		
		inicializarVector(array1);
		inicializarVector(array2);
		
		visualizarVector(sumarVector(array1,array2));
		
	}
	public static void inicializarVector(int[] array){ //método que inicializa el array
		System.out.println("Introduce las componentes");
		for(int i=0;i<array.length;i++)
			array[i]=LeerTeclado.readInteger();
	}
	
	public static void visualizarVector(int[] array){ //método que visualiza el array
		System.out.println("Las componentes del array suma son ");
		for(int i=0;i<array.length;i++)
			System.out.println(array[i]);
	}
	
	public static int[] sumarVector (int[] arrayA, int[] arrayB){ //método que recibe dos arrays como 
					//parámetros y genera un array como salida con la suma de ambos
		int [] arrayC = new int[arrayA.length];
		for (int i=0; i<arrayA.length; i++)
			arrayC[i]=arrayA[i]+arrayB[i];
		return arrayC;
		
	}
}
