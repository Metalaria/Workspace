
public class PrimosHastaNBis {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n;
		do
		{
			System.out.println ("Introduce un n� mayor a 1");
			n=LeerTeclado.readInteger();
		}
		while (n<=1);
		System.out.println ("Los n� primos hasta "+n+" son: ");
		
		System.out.println ("El 2");
		for (int i=3; i<=n; i+=2)
		{
			int div=3;
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
