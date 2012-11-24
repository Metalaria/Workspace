public class Ejercicio5 {
	public static void main(String[] args) {
		int notas[][]= new int [30][5];
		completar(notas);
		verNotas(notas);
		notaMedia(notas);
	}
	public static void completar (int [][] m){
		int i=0;
		for (i=0; i<m.length; i++){
			for (int n=0; n<m[0].length; n++){
				m[i][n]=(int)( Math.random()*11);
			}
		}
	}
	public static void verNotas (int m[][]){
		int i=0;
		for (i=0; i<m.length; i++){
			for (int n=0; n<m[0].length; n++){
				System.out.print(" "+m[i][n]);
			}
			System.out.println(" ");
		}
	}
	public static void notaMedia(int m [][]){
		int i=0,  sumf=0; int sumtotf=0,  max=0;
		double media=0, mediaTotal=0, sumaMedias = 0;
		for (i=0; i<m.length; i++){
			sumf=0;
			for (int n=0; n<m[i].length;n++){
				sumf=sumf+m[i][n];
				if (m[i][n]>max){
					max=m[i][n];
				}
			}
			
			media=sumf/5;
			System.out.println("La nota media del alumno "+i+" = "+media);
			sumtotf=sumf+sumf;
			sumaMedias= ((media)+sumaMedias);
			mediaTotal=sumaMedias/(30);
		}
		System.out.println("La media total de la clase es = "+mediaTotal);
		System.out.println("La nota máxima es: "+max);
	}
}
