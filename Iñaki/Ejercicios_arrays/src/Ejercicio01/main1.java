package Ejercicio01;

public class main1 {
	
	
	//Main
	public static void main(String[] args) {
		
		int [] array1=new int[10]; 
		int [] array2=new int[10];
		int arraysuma[]=new int[10];
		
		System.out.println("Introduce los valores del primer array");
		inicializar(array1);
		System.out.println("Introduce los valores del segundo array");
		inicializar(array2);
		
		arraysuma=suma(array1,array2);
		mostrar(arraysuma);
		
	}
		
		//Metodos
	public static void inicializar(int array[]){
		
		for (int i=0; i<10;i++){
		System.out.println("Introduce un valor para la posicion "+i+" del array");
		array[i]=LeerTeclado.readInteger();
		}
	}
	
	public static int[] suma (int []array1,int []array2){
		int arraysuma[]=new int[10];
		for (int i=0; i<10;i++){
			arraysuma[i]=array1[i]+array2[i];
			
		}
		return arraysuma;
	}
	public static void mostrar (int arraysuma[]){
		
		for(int i=0;i<10;i++){
			System.out.print(arraysuma[i]+" ");
		}
		
	}
		
	}


