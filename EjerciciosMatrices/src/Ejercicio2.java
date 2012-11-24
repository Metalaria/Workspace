public class Ejercicio2 {
	public static void main(String[] args) {
		int [][]matriz1=new int [5][5];
		diagonal(matriz1);
		verMatriz(matriz1);
		}
	public static void diagonal (int[][] m){
		int i=0;
		for (i=0; i<m.length; i++){
			for (int n=0; n<m.length; n++){
				if (i==n){
					m[i][n]=1;
				}
				else {
					m[i][n]=0;
				}
			}
		}
	}
	public static void verMatriz (int m[][]){
		int i=0;
		for (i=0; i<m.length; i++){
			for (int n=0; n<m.length; n++){
				if (i==n){
					m[i][n]=1;
				}
				else {
					m[i][n]=0;
				}
				System.out.print(" "+m[i][n]);
			}
			System.out.println(" ");
		}
	}
}
