package arraysClases;

import arrays.LeerTeclado;

public class Array {
	
	int[] num;
	
	public Array (int longitud){ //constructor
		num =new int[longitud];	
	}
	
	public void inicializarnum(){
		System.out.println("Introduce las componentes");
		for(int i=0;i<num.length;i++)
			num[i]=LeerTeclado.readInteger();
	}
	
	public void visualizar(){
		System.out.println("Las componentes del array son:");
		for(int i=0;i<num.length;i++)
			System.out.print(num[i]+" ");
		System.out.println();
	}
	public void visualizarInvertido(){ //este método solo visualiza el array invertido
		System.out.println("Las componentes en orden inverso son:");
		for(int i=num.length-1;i>=0;i--)
			System.out.print(num[i]+" ");
		System.out.println();
	}
	
	public Array invertir(){ //este metodo genera un objeto Array que contiene ul array invertido
		Array inverso=new Array(num.length);//creo un objeto de la clase Array 
		//con la misma longitud que el atributo num (num.length)
		// int j=num.length-1; Podría usar un variable j para empezar colocando las posiciones al final
		for (int i=0; i<num.length; i++){
			inverso.num[num.length-1-i]=this.num[i]; //tambien {inverso.num[j]=this.num[i]; j--;}
		}
		return inverso;
		
	}
	
	

}

