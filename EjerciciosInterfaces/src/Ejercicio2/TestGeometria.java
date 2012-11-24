package Ejercicio2;

public class TestGeometria {

	public static void main(String[] args) {
		
	int i;
		Casa c1=new Casa("Calle Avellana",4, 28, 38 );
		Rectangulo r2= new Rectangulo ("azul", 4, 8, 1);
		Circulo c7= new Circulo ("verde", 5);
		
		Geometria arrayG [] =new Geometria[3];
		arrayG [0]= c1;
		arrayG [1]= r2;
	    arrayG [2]= c7;
		for (i=0;i<arrayG.length; i++){
			System.out.println(arrayG.toString());
		}
	
		
		
		
	}

}
