package Ejercicio10;

public class Main10 {
	public static void main(String[] args) {

		int []aleatorio= new int[30];

		rellenar(aleatorio);
		System.out.println("Antes del cambio: ");
		ver(aleatorio);
		cambio(aleatorio);
		System.out.println("");
		System.out.println("Despues del cambio: ");
		ver(aleatorio);
	}
	
	//Metodos
	public static void rellenar(int ale[])
	{
		for(int i=0; i<ale.length; i++)
			ale[i]=(int)(Math.random() * 50 +1);
	}
	
	public static void cambio(int a[])
	{
		int aux=0;
			
		for(int i=1; i<a.length; i++)
		{
			aux=a[i-1];
			a[i-1]=a[i];
			a[i]=aux;
		}
	}
	
	public static void ver(int v[])
	{
		for (int i=0; i<v.length; i++)
			if(v[i]!=0)
				System.out.print(v[i]);
	}
}
