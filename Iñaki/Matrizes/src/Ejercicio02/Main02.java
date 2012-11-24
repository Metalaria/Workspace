package Ejercicio02;

public class Main02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] tabla=new int[5][5]; 
		
		cargar(tabla);
		mostrar(tabla);
		
	}

	public static void cargar(int tabla[][]){
		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){
				if(i==j){
					tabla[i][j]=1;
				}
				else tabla[i][j]=0;
			}
		}
	}
	public static void mostrar(int tabla[][]){
		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){
				System.out.print(tabla[i][j]+" ");
			}
			System.out.println("");
		}
	}

}
