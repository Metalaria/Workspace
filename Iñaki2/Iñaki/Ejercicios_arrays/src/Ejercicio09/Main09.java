package Ejercicio09;


public class Main09 {
	public static void main(String[] args) {
		int []aleatorio= new int[20];
		int []pares=new int[20];
		int []imp=new int[20];
		
		rellenar(aleatorio);
		separar(aleatorio,pares,imp);
		System.out.println("Pares: ");
		ver(pares);
		System.out.println("");
		System.out.println("Impares: ");
		ver(imp);
	}
	
	//Metodos
	public static void rellenar(int ale[])
	{
		for(int i=0; i<ale.length; i++)
			ale[i]=(int)(Math.random() * 100 +1);
	}
	
	public static void separar(int a[], int p[], int i[])
	{
		int m=0, n=0;
		for(int j=0; j<a.length; j++)
			if(a[j]%2==0)
			{
				p[n]=a[j];
				n++;
			}
			else
			{
				i[m]=a[j];
				m++;
			}
	}
	
	public static void ver(int v[])
	{
		for (int i=0; i<v.length; i++)
			if(v[i]!=0)
				System.out.print(v[i]+" ");
	}
}