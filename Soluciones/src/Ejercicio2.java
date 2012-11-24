public class Ejercicio2 {
	public static void main(String[] args) {
		int matriz [][]=new int [3][4];
		int array[]=new int [3];
		
		completar(matriz);
		verMatriz(matriz);
		System.out.println(" ");
		suma1(matriz, array);
		
	}
	public static void completar (int [][] m){
		int i=0;
		for (i=0; i<m.length; i++){
			for (int n=0; n<m.length; n++){
				m[i][n]=(int)( Math.random()*10);
			}
		}
	}
	public static void verMatriz (int m[][]){
		int i=0;
		for (i=0; i<m.length; i++){
			for (int n=0; n<m[0].length; n++){
				System.out.print(" "+m[i][n]);
			}
			System.out.println(" ");
		}
	}
	public static void suma1 (int[][]m, int a[]){
		int i=0, fil=0; int sumf = 0;
		for (i=0; i<m.length; i++){
			sumf=0;
			for (int n=0; n<m[i].length;n++){
				sumf=sumf+m[i][n];
				a[i]=sumf;
			}
			System.out.print(a[i]+" ");
		}
		
	}
}
