package Ejercicio03;

public class Matriz {
	private int filas;
	private int columnas;
	private int tabla[][];

	//Constructores
	
	public Matriz(int filas){
		this.filas=filas;
		columnas=6;
		tabla=new int[filas][columnas];
	}

	public void introducir(){
		for(int i=0;i<tabla.length;i++){
			for(int j=0;j<tabla[i].length;j++){
				tabla[i][j]=(int) (Math.random()*10);
			}
		}
	}
	public void visualizar(){
		for(int i=0;i<tabla.length;i++){
			System.out.print("El empleado "+i+": ");
			for(int j=0;j<tabla[i].length;j++){
				System.out.print(tabla[i][j]+" ");
			}
			System.out.println(" ");
		}
	}
	public int total(){ //Total Suma de la matriz
		int sum=0;
		for(int i=0;i<tabla.length;i++){
			for(int j=0;j<tabla[i].length;j++){
				sum=sum+tabla[i][j];
			}
		}
		return sum;
	}
	public int totalFila(int n){  //Total Suma fila pasandole el numero de esta
		int sumFila=0;
			for(int j=0;j<tabla[n].length;j++){
				sumFila=sumFila+tabla[n][j];
			}
		return sumFila;
	}
	public int totalColumna(int n){  //Total Suma columna pasandole el numero de esta
		int sumColumna=0;
			for(int i=0;i<tabla.length;i++){
				sumColumna=sumColumna+tabla[i][n];
			}
		return sumColumna;
	}
	public int maxFila(int n){
		int max=0;
		for(int j=0;j<tabla[n].length;j++){
			if(max<tabla[n][j]){
				max=tabla[n][j];
			}
		}
		return max;
	}
	public void  minColumna(int n){  				     //Método que reciba una columna y obtenga el 
		n=n-1;											//mínimo de la misma y la fila donde se produce.
		int min=tabla[0][n];						
		int posicion=0;
		for(int i=0;i<tabla.length;i++){
			if(min>tabla[i][n]){
				min=tabla[i][n];
				posicion=i;
			}
		}
		System.out.println("El minimo es: "+min+" y es del vendedor "+posicion);
	}
	public void  maxTotal(int tabla[][],int n){    //Método que reciba una columna y obtenga el 
		int max=0;
		int posicionFil=0;
		int posicionCol=0;
		for(int i=0;i<tabla.length;i++){
			for(int j=0;j<tabla[i].length;j++){
				if(max<tabla[i][j]){
					max=tabla[i][j];
					posicionFil=i;
					posicionCol=i;
				}
			}
		}
		System.out.println("El maximo de la tabla es: "+max+" y se encuenta en la fila: "+posicionFil+" y la columna "+posicionCol);
	}
}

