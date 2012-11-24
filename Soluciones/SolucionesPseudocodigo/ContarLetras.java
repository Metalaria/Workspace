
public class ContarLetras {

	
	public static void main(String[] args) {
		String letra,aux;
	//	char letra,aux; da problemas si se usa char
		System.out.println("introduce una letra");
		letra=LeerTeclado.readString();
		aux=letra;
		int cont=1;
		for (int i=2;i<=20;i++)
		{
			System.out.println("introduce una letra");
			letra=LeerTeclado.readString();
			if (letra.equals(aux))
				cont++;
		}
		System.out.println("la primera letra es "+aux);
		System.out.println ("el nº de veces que se repite es "+cont);
		
			
			

	}

}
