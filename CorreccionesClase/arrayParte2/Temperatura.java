package arrayParte2;

import arrayParte1.LeerTeclado;

public class Temperatura {
	
	private int [][] temp;
	private static String[] franjas={ "Mañana", "Mediodia", "Tarde", "Noche"};
	
	public Temperatura(){
		temp=new int[20][4];
		for(int i=0; i<temp.length; i++)
			for (int j=0; j<temp[0].length; j++){
				temp[i][j]=(int)(Math.random()*40);
			}
	}
	
	public void verTemp(){
		for (int i=0; i<temp.length; i++){
			System.out.println("Temperaturas de la ciudad "+i);
			for (int j=0; j<temp[0].length; j++){
				System.out.print(franjas[j]+" "+temp[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public void franja(){
		int n;
		do {
			System.out.println("Introduce franja horaria (1-4)");
			n=LeerTeclado.readInteger();
		}
		
		while (n<0 || n>4);
				
		int min=99;
		for (int i=0; i<temp.length; i++)
			if (min>temp[i][n-1])
				min=temp[i][n-1];
		System.out.println("La temperatura minima de la franja horaria de "+franjas[n-1]+ " es "+min);
				
	}
	
	public void ciudadMasFria(){
		int suma, ciudadMin=99;		
		double media=0, min=99;
		for (int i=0; i<temp.length; i++){
			suma=0;		
			for (int j=0; j<temp[0].length; j++)
				suma+=temp[i][j];
			media=suma/temp[0].length;
			System.out.println("la ciudad "+i+ " tiene de media "+media);		
			if (min>media)
				{min=media;
				ciudadMin=i;
				}
			}
		System.out.println("La ciudad con la media más baja es "+ciudadMin +" y su media es "+min);
				
	}
}
