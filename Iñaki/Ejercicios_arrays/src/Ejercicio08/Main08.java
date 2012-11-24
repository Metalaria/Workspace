package Ejercicio08;



public class Main08 {
	public static void main(String[] args) {
		int []cifra= new int[6];
		
		System.out.println("Introduce la cantidad:");
		int ns=LeerTeclado.readInteger();
		System.out.println("Introduce el numero:");
		int n=LeerTeclado.readInteger();
		
		separar(cifra,ns);
		buscar(cifra,n);
	}
	
	//Metodos
	public static void separar(int cifra[], int ns)
	{
		int i;
		for(i=0; ns>=10||i<cifra.length; i++)
		{
			cifra[i]=ns%10;
			ns=ns/10;
		}
	}
	
	
	public static void buscar(int cifra[], int n)
	{
		int cont=0;
		
		for (int i=0; i<cifra.length; i++)
			if(n==cifra[i])
				cont++;
		
		if(cont>0)
			System.out.println("El numero "+n+" se ha encontrado. Cantidad de veces: "+cont);
		else
			System.out.println("El numero "+n+" no se ha encontrado");
	}
}