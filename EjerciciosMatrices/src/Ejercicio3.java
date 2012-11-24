public class Ejercicio3 {
	public static void main(String[] args) {
		int [][]matriz1=new int [10][10];
		completar(matriz1);
		suma(matriz1);
	}
	public static void completar (int [][] m){
		int i=0;
		for (i=0; i<m.length; i++){
			for (int n=0; n<m.length; n++){
				m[i][n]=(int)( Math.random()*9 +1);
			}
		}
	}

	public static void suma (int[][]m){
		int i=0, fil=0; int sumf = 0, sumc=0, sumTotf=0, sumTotc=0;
		for (i=0; i<m.length; i++){
			sumf=0;
			for (int n=0; n<m[i].length;n++){
				sumf=sumf+m[i][n];
				System.out.println("Suma de filas = "+sumf);
			}
			sumTotf=sumf+sumf;
		}
		System.out.println("Total filas = "+sumTotf);
		
			sumc=0;
		
		for (int n=0; n<m[0].length;n++){
			sumc=0;
			for (i=0; i<m.length; i++){
			sumc=sumc+m[i][n];
			System.out.println("Suma de columnas = "+sumc);
		}
		sumTotc=sumc+sumc;
		System.out.println("Totalcolumnas = "+sumc);
	}
	}
}