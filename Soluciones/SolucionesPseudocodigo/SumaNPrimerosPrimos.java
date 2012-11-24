
public class SumaNPrimerosPrimos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n, cont, div=0, suma=0;
		boolean primo;
		System.out.println ("Introduce un nº");
		n=LeerTeclado.readInteger();
		if (n<=0)
			System.out.println ("No hay primos");
		else 
			{
				int num=2;
				cont=1;
				System.out.println ("los "+n+" primeros primos son: ");
				while (cont<=n)
				{
					div=2;
					primo=true;
					while(primo && div<=num/2)
					{
						if (num%div==0)
							primo=false;
							else
								div++;
					}
					if (primo)
					{
						System.out.println ("El "+num);
						cont++;
						suma+=num;
					}				
					
					num++;
				}
				
				System.out.println ("La suma de todos los primos es "+suma);
				
			}

	}

}
