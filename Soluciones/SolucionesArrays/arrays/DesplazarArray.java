package arrays;

public class DesplazarArray {

	public static void main(String[] args) {
		final int longitud=10;
		final int rango=50;
		int[] arrayNum=new int[longitud];
		
		inicializarVector(arrayNum, rango);
		System.out.println("Las componentes del vector original son:");
		visualizar(arrayNum);
		desplazar(arrayNum);
		System.out.println("Las componentes del vector final son:");
		visualizar(arrayNum);
		
	}	
	
	public static void inicializarVector(int[] array, int rango){ //método que inicializa el array
			//generan aleatoriamente las componentes entre un rango que se le pasa como parámetro
		System.out.println("Genera aleatoriamente las componentes");
		for(int i=0;i<array.length;i++)
			array[i]=(int)(Math.random()*rango+1);
	}
	
	public static void visualizar(int[] array){ //método que visualiza el array
		for(int i=0;i<array.length;i++)
			 System.out.println(array[i]);
	}
	

	public static void desplazar (int[] array){
		int aux1,aux2,aux3;
		aux1=array[0];aux3=array[array.length-1];
		for (int i=0; i<array.length-1;i++){
			aux2=array[i+1];
			array[i+1]=aux1;
			aux1=aux2;
		}
		array[0]=aux3;
	}
}
