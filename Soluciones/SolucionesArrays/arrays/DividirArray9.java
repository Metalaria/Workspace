package arrays;

public class DividirArray9 {

	public static void main(String[] args) {

		final int longitud=20;
		final int rango=100;
		int[] arrayNum=new int[longitud];
		int[] arrayPares=new int[longitud];
		int[] arrayImpares=new int[longitud];
		
		
		inicializarVector(arrayNum, rango);
		System.out.println("Las componentes del vector original son:");
		visualizar(arrayNum);
		
		//creamos los vectores 
		dividirArray(arrayNum, arrayPares, arrayImpares);
		
		System.out.println("Las componentes del vector de los pares son: ");
		visualizar(arrayPares);
		System.out.println("Las componentes del vector de los impares son: ");
		visualizar(arrayImpares);
	}
	
	
	public static void inicializarVector(int[] array, int rango){ //método que inicializa el array
			//generan aleatoriamente las componentes entre un rango que se le pasa como parámetro
		System.out.println("Genera aleatoriamente las componentes");
		
		for(int i=0;i<array.length;i++)
			array[i]=(int)(Math.random()*rango+1);
		
	}
	
	public static void visualizar(int[] array){ //método que visualiza el array
		for(int i=0;i<array.length;i++)
			 System.out.print(array[i]+" ");
		
		System.out.println();
	}
	
	public static void dividirArray (int[] arrayGrande, int[] array1, int[] array2){
		
		int j=0, k=0;
		for (int i=0; i<arrayGrande.length; i++)
			if (arrayGrande[i]%2==0){
				array1[j]=arrayGrande[i];
				j++;
			}
			else {
				array2[k]=arrayGrande[i];
				k++;
			}
	}
}
