package arraysClases;

public class Matriz {
	
	private int filas;
	private int columnas;
	private int [][] datos;
	
	public Matriz (int filas, int columnas){
		this.filas=filas;
		this.columnas=columnas;	
		datos=new int[this.filas][this.columnas];
	}
	
	public int getFilas() {
		return filas;
	}

	public void setFilas(int filas) {
		this.filas = filas;
	}

	public int getColumnas() {
		return columnas;
	}

	public void setColumnas(int columnas) {
		this.columnas = columnas;
	}

	public void introducir (){
		for (int i=0;i<filas;i++)
			for (int j=0; j<columnas; j++)
				datos [i][j]=(int)(Math.random()*10);
	}
	
	public void visualizar (){
		for (int i=0;i<filas;i++){
			for (int j=0; j<columnas; j++)
				System.out.print(datos [i][j]+" ");
			System.out.println();
		}
	}
	
	public int totalMatriz(){
		int suma=0;
		for (int i=0;i<filas;i++)
			for (int j=0;j<columnas;j++)
				suma+=datos[i][j];
		return suma;
	}
	
	public int totalFila(int fila){
		int total=0;
		for (int j=0; j<columnas; j++)
			total+=datos[fila-1][j];
			
		return total;
	}
	
	public int totalColumna(int columna){
		int total=0;
		for (int i=0; i<filas; i++)
			total+=datos[i][columna-1];
			
		return total;
	}
	
	public int maxFilas(int fila){
		int maximo=Integer.MIN_VALUE;
		for (int j=0; j<columnas; j++)
			if (datos[fila-1][j]>maximo)
				maximo=datos[fila-1][j];
		return maximo;
	}
	
	public void minColumnas(int columna){
		int iMin=0, minimo=Integer.MAX_VALUE;
		
		for (int i=0; i<filas; i++)
			if (datos[i][columna-1]<minimo){
				minimo=datos[i][columna-1];
				iMin=i;
			}			
		System.out.println("El mínimo es "+minimo+ " y corresponde al vendedor  "+(iMin+1));
	}
	
	public void maxMatriz(){
		int maximo=Integer.MIN_VALUE;
		int iMax=0,jMax=0;
		for (int i=0; i<filas; i++)
			for (int j=0; j<columnas; j++)
				if (datos[i][j]>maximo){
					maximo=datos[j][j];
					iMax=i;
					jMax=j;
				}
		System.out.println("El máximo es "+maximo+ " y se produce por el vendedor "+iMax+" en el dia "+jMax);
		
					
		
	}
	
	
	
	

}
