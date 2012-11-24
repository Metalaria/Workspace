
public class PrimosHastaN {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n;
		do
		{
			System.out.println ("Introduce un nº mayor a 1");
			n=LeerTeclado.readInteger();
		}
		while (n<=1);
		System.out.println ("Los nº primos hasta "+n+" son: ");
		for (int i=2; i<=n; i++)
		{
			int div=2;
			boolean primo=true;
			while(primo && div<=i/2)
			{
				if (i%div==0)
					primo=false;
					else
						div++;
			}
			if (primo)
				System.out.println ("El "+i);
			
	
		}
		}
		
			


	}
