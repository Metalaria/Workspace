package Ejercicio04;

public class Main04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] tabla=new int[5][3]; 
		
		cargar(tabla);
		System.out.println(" ");
		mostrar(tabla);
		
	}

	public static void cargar(int tabla[][]){
		for(int i=0;i<5;i++){
			for(int j=0;j<3;j++){
			tabla[i][j]=(int) (Math.random()*9+1);
			System.out.print(tabla[i][j]+" ");
			}
			System.out.println(" ");
		}
	}
	public static void mostrar(int tabla[][]){
		for(int j=0;j<3;j++){
			for(int i=0;i<5;i++){
				System.out.print(tabla[i][j]+" ");
			}
			System.out.println("");
		}
	}
}
