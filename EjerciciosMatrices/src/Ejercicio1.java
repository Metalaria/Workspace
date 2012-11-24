public class Ejercicio1 {
	public static void main(String[] args) {
		int [][]matriz1=new int [5][5];
		calcularMatriz(matriz1);
		verMatriz(matriz1);
	}
	public static void calcularMatriz (int[][] m){
		int i=0;
		for (i=0; i<m.length; i++){
			for (int n=0; n<m.length; n++){
				m[i][n]=n+i;
			}
		}
	}
	public static void verMatriz (int m[][]){
		int i=0;
		for (i=0; i<m.length; i++){
			for (int n=0; n<m.length; n++){
				m[i][n]=n+i;
				System.out.print(" "+m[i][n]);
			}
			System.out.println(" ");
		}
	}
}
