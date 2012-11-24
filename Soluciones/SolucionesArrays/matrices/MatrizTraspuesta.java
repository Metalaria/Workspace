package matrices;

public class MatrizTraspuesta {

	
	public static void main(String[] args) {
		int filas=5, columnas=3;
		
		int [][]matriz=new int [filas][columnas];
		int [][]trasp=new int[columnas][filas];
		
		//carga la matriz
		cargarMatriz (matriz);
		//crea la matriz traspuesta
		trasp=trasponer(matriz);
		
		System.out.println("La matriz original es");
		visualizar(matriz);
		System.out.println();
		System.out.println("La matriz traspuesta es");
		visualizar (trasp);
		
	}
	
	public static void cargarMatriz (int [][]mat){
		
		for (int i=0;i<mat.length;i++)
			for (int j=0; j<mat[0].length;j++)
				mat [i][j]=(int)(Math.random()*10);
	}
	
	public static int [][]  trasponer (int [][] mat){
		
		int [][]trs=new int[mat[0].length][mat.length]; //crea la matriz con 3 filas y 5 columnas
		for (int i=0;i<trs.length;i++)
			for (int j=0; j<trs[0].length;j++)
				trs[i][j]=mat [j][i];
		return trs;
	}
	
	public static void visualizar (int [][] mat){
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++)
				System.out.print(mat[i][j]+" ");
			System.out.println();
		}
	}

}
