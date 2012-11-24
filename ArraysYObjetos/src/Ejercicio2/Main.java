package Ejercicio2;
public class Main {
	public static void main(String[] args) {
		int[] alumnos= new int [30];
		Alumnos al=new Alumnos();
		rellenarNotas(alumnos);
		verNotas(alumnos);
		al.rellenarNombres(alumnos);
		
	}
	public static  void rellenarNotas (int []notas){
		int i=0;
		System.out.println();
		for (i=0; i<notas.length; i++){
			notas[i]=(int) (Math.random()*11);
		}
	}
	public static void verNotas (int []alumnos){
		int i=0;
		for (i=0; i<alumnos.length; i++){
				System.out.print(alumnos[i]+" ");
			}
			System.out.println(" ");
	}
}
