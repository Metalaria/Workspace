package Ejercicio02;

import Ejercicio01.LeerTeclado;

public class main2 {

	/**
	 * @param args
	 */
	//Main
	public static void main(String[] args) {
		
		int [] array1=new int[10]; 
		int arraysuma;
		
		System.out.println("Introduce los valores del primer array");
		inicializar(array1);
		
		System.out.println("Visualizar valores menores que 17");
		mostrar17(array1);
		System.out.println(" ");
		System.out.println("Visualizar valores menores que 17");
		arraysuma=suma(array1);
		System.out.println("La suma de todos los valores del array es: "+arraysuma);
		mayor(array1);
		contar(array1);
		
	}
	
	//Metodos
	public static void inicializar(int array[]){
		
		for (int i=0; i<10;i++){
		System.out.println("Introduce un valor para la posicion "+i+" del array");
		array[i]=LeerTeclado.readInteger();
		}
	}
	public static void mostrar17 (int array1[]){
		
		for(int i=0;i<10;i++){
			if (array1[i]<17){
			System.out.print(array1[i]+" ");
			}
		}
	}
	public static int suma (int array1[]){
		int arraysuma=0;
		for(int i=0;i<10;i++){
			arraysuma=arraysuma+array1[i];
		}	
		return arraysuma;
	}
	public static void mayor(int array1[]){
		int mayor;
		int cuenta=0;
		mayor=array1[1];
		for(int i=0;i<10;i++){
			if(array1[i]>mayor){
				mayor=array1[i];
				cuenta=0;
			}
			if(array1[i]==mayor){
				cuenta=cuenta+1;
			}
		}
		 System.out.println("El numero mayor es: "+mayor+" y se repite "+cuenta+" veces");
	}
	
	public static void contar (int array[]){
		int p=0, n=0, c=0;
		for (int i=0; i<10; i=i+2){
			if(array[i]<0){
				n=n+1;
			}
			else{
				if(array[i]>0){
					p=p+1;
				}
				else{
					c=c+1;
				}
			}
			
		}
		System.out.println(" ");
		System.out.println("En las posiciones pares.");
		System.out.println("Hay: "+p+" numeros Positivos "+n+" numeros Negativos "+c+" Ceros");
	}
	
}
