

public class Oposicion {
	
	private int [][] punt;
	private final String nombres[]={"Test", "Teórico", " Práctico", "Oral"};
	
	public Oposicion(){
		punt=new int [20][4];
		for (int i=0; i<punt.length; i++)
			for (int j=0; j<punt[0].length; j++)
				punt[i][j]=(int)(Math.random()*10);
	}
	
	public void verPunt(){
		for (int i=0; i<punt.length; i++){
			System.out.println("Puntuaciones del opositor "+i);
			for (int j=0; j<punt[0].length; j++){
				System.out.print(nombres[j]+" "+punt[i][j]+" ");
			}
			System.out.println();
		}
					
	}
	
	public void puntMax(){
		
		int max;
		for (int j=0; j<punt[0].length; j++ ){
			 max=0;
			for (int i=0;i<punt.length; i++)
				if (max<punt[i][j])
					max=punt[i][j];
			System.out.println("La puntuación máxima de la prueba "+nombres[j]+" es "+max);
		}
			
	}
	
	public void mejorOpositor(){
		
		int suma,oposMax=99;
		double media, max=0;
		for (int i=0; i<punt.length; i++ ){
			 suma=0;
			for (int j=0;j<punt[0].length; j++)
				suma+=punt[i][j];
			media=(double)suma/punt[0].length;
			System.out.println("el opositor "+i+ " tiene de media "+media);
			if(max<media)
			{max=media;
			oposMax=i;
			}
			}
		System.out.println("El opositor con mejor media es "+oposMax +" y su media es "+max);
							
			
		
	}
	

}
