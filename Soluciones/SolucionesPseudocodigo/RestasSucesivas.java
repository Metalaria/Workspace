
public class RestasSucesivas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int a,b,coc=0, resto=0; 
		System.out.println ("Introduce a y b");
		
		a=LeerTeclado.readInteger();
		b=LeerTeclado.readInteger();
		resto=a;
		if (b==0)
			System.out.println ("No se puede dividir por 0");
		else 
		{	
			while (resto>=b) //si cont=1 el while (cont<=b)
			{
				resto-=b;
				coc++;
			}
			System.out.println ("cociente: "+coc+ " resto: "+resto);
		}

	}

}
