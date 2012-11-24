package Ejercicio01;

public class Main01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] tabla=new int[5][5]; 
		
		sumar(tabla);
		mostar(tabla);
	}

	public static void sumar(int tabla[][]){
		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){
				tabla[i][j]=i+j;
			}
		}
	}
	public static void mostar(int tabla[][]){
		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){
				System.out.print(tabla[i][j]+" ");
			}
			System.out.println("");
		}
	}
}
