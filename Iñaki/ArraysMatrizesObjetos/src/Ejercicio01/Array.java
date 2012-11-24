package Ejercicio01;

public class Array {
	
	//Declaracion Atributos
	
	private int ar[];


	public Array(){
		ar=new int[10];
	}

	public void rellenar(){
		for(int i=0;i<ar.length;i++){
			System.out.println("Introduce un valor para la posicion "+i+" del array.");
			ar[i]=LeerTeclado.readInteger();
		}
	}
	
	public void mostrar (){
		for(int i=0;i<10;i++){
			System.out.print(ar[i]+" ");
		}
	}
		
	public  Array invertido(){
		Array inverso=new Array();
		int j=9;
		for(int i=0;i<10;i++){
			inverso.ar[j]=ar[i];
			
			j=j-1;
		}
		return inverso;
	}
	
}