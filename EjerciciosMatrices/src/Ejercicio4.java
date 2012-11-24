
public class Ejercicio4 {
	public static void main (String[] args){
		int[][]matriz =new int [5][3];
		completar(matriz);
		verMatriz(matriz);
		transponer(matriz);
	}
	public static void completar (int [][] m){
		int i=0;
		for (i=0; i<m.length; i++){
			for (int n=0; n<m[0].length; n++){
				m[i][n]=(int)( Math.random()*9 +1);
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
	public static void transponer (int m[][]){
	    System.out.println("La matriz transpuesta es: ");
	     for(int j = 0; j < m[0].length; j++){
	            for(int i = 0; i < m.length; i++){
	                System.out.print(" "  + m[i][j] + " ");
	            }
	            System.out.println();
	        }
	  }
}
