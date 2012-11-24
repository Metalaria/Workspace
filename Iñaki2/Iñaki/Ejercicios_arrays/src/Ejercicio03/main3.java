package Ejercicio03;

public class main3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array1=new int[11];
		// array posiciones 0 1 2 3 4 5 6 7 8 9 10
		// array notas      0 1 2 3 4 5 6 7 8 9 10
		
		contarNota(array1);
		mostrar(array1);
		
	
	}
	
	
	public static void contarNota (int array1[]){
		int nota;
		do{
		System.out.println("Introduce nota");
		nota=LeerTeclado.readInteger();
			if(nota>=0 && nota<=10){
				array1[nota]=array1[nota]+1;
			}
		}
		while(nota>=0 && nota<=10);
	}

	public static void mostrar (int array1[]){
		
		for(int i=0;i<11;i++){
			System.out.println("Nota "+i+": "+array1[i]+" ");
		}
	}
}
