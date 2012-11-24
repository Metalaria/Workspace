package Ejercicio05;

public class Main05 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] tabla=new int[30][5]; 
		int max;
		int med;
		String asignaturas[]={"Lengua","Matematicas","Sociales","Quimica","Biologia"};
		
		cargar(tabla);
		max=maxima(tabla);
		System.out.println("La nota maxima es: "+max);
		med=media(tabla);
		System.out.println("La nota media es: "+med);
		mediaAlumno(tabla);
		mediaAsignatura(tabla,asignaturas);
		
	}

	public static void cargar(int tabla[][]){
		for(int i=0;i<30;i++){
			for(int j=0;j<5;j++){
			tabla[i][j]=(int) (Math.random()*11);
			System.out.print(tabla[i][j]+" ");
			}
			System.out.println(" ");
		}
	}
	public static int maxima(int tabla[][]){
		int max=0;
		for(int i=0;i<30;i++){
			for(int j=0;j<5;j++){
				if(tabla[i][j]>max){
					max=tabla[i][j];
				}
			
			}
		}
		return max;
	}
	public static int media(int tabla[][]){
		int med=0;
		for(int i=0;i<30;i++){
			for(int j=0;j<5;j++){
				med=med+tabla[i][j];
			
			}
		}
		med=med/150;
		return med;
	}
	public static void mediaAlumno (int tabla[][]){
		int media = 0;
		for(int i=0;i<30;i++){
			for(int j=0;j<5;j++){
				media=media+tabla[i][j];
			}
			media=media/5;
			System.out.println("La nota del alumno "+i+" es "+media);
			media=0;
		}
	}
	public static void mediaAsignatura (int tabla[][],String asignaturas[]){
		int media = 0;
		for(int j=0;j<5;j++){
			for(int i=0;i<30;i++){
				media=media+tabla[i][j];
			}
			media=media/30;
			System.out.println("La nota de la asignatura "+j+" "+asignaturas[j]+" es "+media);
			media=0;
		}
	}
}

