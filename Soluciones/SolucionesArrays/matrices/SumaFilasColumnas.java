package matrices;

public class SumaFilasColumnas {

	public static void main(String[] args) {
		
		int [][]matriz=new int [10][10];
		
		//carga la matriz
		cargarMatriz(matriz);
		//visualiza la matriz
		visualizarMatriz(matriz);
		
		
		System.out.println();
		//calcular la suma de filas y columnas
		System.out.println("Se suman las filas");
		sumarFilas(matriz);
		
		System.out.println();
		System.out.println("Se suman las columnas");
		sumarColum(matriz);
		
		
	}
	
	public static void cargarMatriz (int [][]matriz){
		for (int i=0;i<matriz.length;i++)
			for (int j=0; j<matriz[0].length;j++)
				matriz [i][j]=(int)(Math.random()*9+1);
	}
	
	public static void visualizarMatriz (int [][]matriz){
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++)
				System.out.print(matriz[i][j]+" ");
			System.out.println();
		}
	}
	
	public static void sumarFilas (int [][]matriz){
		
		int suma;
		for (int i = 0; i < matriz.length; i++) {
			suma=0;
			for (int j = 0; j < matriz[0].length; j++)
				suma+=matriz[i][j];		
			System.out.println("la suma de la fila "+i+" es "+suma);
		}
		
	}
	
	public static void sumarColum (int [][]matriz){
	int suma;
	for (int j = 0; j < matriz[0].length; j++){
		suma=0;
		for (int i = 0; i < matriz.length; i++) 
			suma+=matriz[i][j];
		System.out.println("la suma de la columna "+j+" es "+suma);
	}
	}
}

	
