
public class Cifras {

	public static void main(String[] args) {
		int n, aux, cont=0;
		
		System.out.println("Introduce un n�");
		n=LeerTeclado.readInteger();
		aux=n;
		while (aux!=0)
		{
			cont++;
			aux=aux/10;
		}
		System.out.println ("El n� de cifras es "+cont);

	}

}
