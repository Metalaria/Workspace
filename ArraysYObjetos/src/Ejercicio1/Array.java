package Ejercicio1;
public class Array {
	
	int array1[]; 
	
	
	public Array (){
		array1=new int[10];
	}
	
	public  void rellenarArray (){
		int i=0;
		System.out.println("Este es el array normal");
		for (i=0; i<array1.length; i++){
			array1[i]=(int) (Math.random()*10);
		}
	}
	
	public Array invertirArray (){
		Array inverso = new Array();
		int j=9;
		System.out.println("Este es el array invertido");
		for(int i=0; i<10;i++){
			inverso.array1[j]=array1[i];
			j=j-1;
		}
		return inverso;
	}

	public  void verArray (){
		int i=0;
		for (i=0; i<array1.length; i++){
				System.out.print(array1[i]+" ");
			}
			System.out.println(" ");
	}
}
