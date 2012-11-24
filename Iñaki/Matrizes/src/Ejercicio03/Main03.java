package Ejercicio03;

public class Main03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] tabla=new int[10][10]; 
		
		cargar(tabla);
		sumar(tabla);
		
	}

	public static void cargar(int tabla[][]){
		for(int i=0;i<10;i++){
			for(int j=0;j<10;j++){
			tabla[i][j]=(int) (Math.random()*9+1);
			System.out.print(tabla[i][j]+" ");
			}
			System.out.println(" ");
		}
	}
	public static void sumar(int tabla[][]){
		int fil=0;
		int col=0;
		int sumaFil=0;
		int sumaCol=0;
		int sumaTotal=0;
		for(fil=0;fil<10;fil++){
			sumaFil=0;
			for(col=0;col<10;col++){
				sumaFil=sumaFil+tabla[fil][col];
			}
			System.out.println("La fila "+fil+" es: "+sumaFil);
			sumaTotal=sumaTotal+sumaFil;
		}
		System.out.println("La suma total de filas es: "+sumaTotal);
		sumaTotal=0;
		for(col=0;col<10;col++){
			sumaCol=0;
			for(fil=0;fil<10;fil++){
				sumaCol=sumaFil+tabla[fil][col];
			}
			System.out.println("La columna "+col+" es: "+sumaCol);
			sumaTotal=sumaTotal+sumaCol;
		}
		System.out.println("La suma total de columnas es: "+sumaTotal);
	}
	
}
