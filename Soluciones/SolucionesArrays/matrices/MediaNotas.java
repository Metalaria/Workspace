package matrices;

public class MediaNotas {

	public static void main(String[] args) {
		int[][]notas=new int[30][5];
		System.out.println("Cargamos la matriz de notas");
		cargarMatriz (notas);
		System.out.println("Las notas de los alumnos son: ");
		visualizar(notas);
		System.out.println("Estadísticas");
		estadisticas (notas);
		
}
	
	public static void cargarMatriz (int[][]notas){
		for (int i = 0; i < notas.length; i++)
			for (int j = 0; j < notas[0].length; j++)
				notas[i][j] = (int) (Math.random() * 11);
	}
	
	public static void visualizar (int[][]notas){
		for (int i = 0; i < notas.length; i++) {
			for (int j = 0; j < notas[0].length; j++)
				System.out.print(notas[i][j]+" ");
			System.out.println();
		}
	}
	
	public static void estadisticas (int[][]notas){
		
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		double media, mediaAlum, mediaAsig;
		int suma=0, sumaAlum=0, sumaAsig=0;



		for (int i = 0; i < notas.length; i++){
			sumaAlum=0;
			for (int j = 0; j < notas[0].length; j++){
				suma+=notas[i][j];
				sumaAlum+=notas[i][j];
				if (notas[i][j]>max)
					max=notas[i][j];
				if (notas[i][j]<min)
					min=notas[i][j];

			}
			mediaAlum=((double)sumaAlum)/notas[0].length;
			System.out.println();

			System.out.println("La media de notas del alumno "+(i+1)+" es "+mediaAlum);
		}	

		for (int j = 0; j < notas[0].length; j++){
			sumaAsig=0;
			for (int i = 0; i < notas.length; i++){

				sumaAsig+=notas[i][j];
			}
			mediaAsig=((double)sumaAsig)/notas.length;
			System.out.println();
			System.out.println("La media de notas de la asignatura "+(j+1)+" es "+mediaAsig);
		}	

		media=((double)suma)/(notas.length*notas[0].length);
		System.out.println();
		System.out.println("La nota media de la clase es "+media);
		System.out.println("La nota máxima de la clase es "+max);
		System.out.println("La nota mínima de la clase es "+min);	

		
	}
}
