package Ejercicio04;


public class Main04 {
	public static void main(String[] args) {
		double [] dinero={500f,100f,50f,20f,10f,5f,2f,1f,0.50f,0.20f,0.10f,0.05f,0.02f,0.01f};
		int []aux=new int[14];
		
		System.out.println("Introduce la cantidad:");
		double cantidad=LeerTeclado.readInteger();
		
		calcular(dinero,aux,cantidad);
		visualizar(dinero,aux);
	}
	
	//Metodos
	public static void visualizar (double dinero[], int aux[])
	{
		for(int i=0; i<dinero.length; i++)
			if(aux[i]>0)
			System.out.println("La cantidad "+dinero[i]+" se usa "+aux[i]+" veces");
	}
	
	public static void calcular (double dinero[], int aux[], double cantidad)
	{
		for(int i=0; i<dinero.length && cantidad!=0; i++)
			while(cantidad>=dinero[i] && cantidad!=0)
			{
				aux[i]=(int) (cantidad/dinero[i]);
				cantidad=cantidad%dinero[i];
			}
	}
}