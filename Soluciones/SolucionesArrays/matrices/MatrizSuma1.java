package matrices;

public class MatrizSuma1 {

	public static void main(String[] args) {
		
		int [][]matriz=new int [5][5];
		//carga la matriz
		for (int i=0;i<matriz.length;i++)
			for (int j=0; j<matriz[0].length;j++)
				matriz[i][j]=i+j; //si queremos que visualice de 1 a 5 hay que sumarle 2 suma[i][j]=i+j+2
		
		//visualiza la matriz
			

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++)
				System.out.print(matriz[i][j]);
			System.out.println();
		}
			


	}

}
