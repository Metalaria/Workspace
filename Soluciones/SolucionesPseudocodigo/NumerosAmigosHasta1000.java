
public class NumerosAmigosHasta1000 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int sumaN=0,sumaM=0,cont=0;
		for (int n=1;n<=999;n++)
		{
			for (int i=1;i<=n/2;i++)
				if (n%i==0)
					sumaN+=i; 
			for (int m=n+1;m<=1000;m++)
			{
				for (int j=1;j<=m/2;j++)
					if (n%j==0)
						sumaM+=j; 
				if (n==sumaM && m==sumaN)
				{
					System.out.println (n+" y "+m+" son amigos");
					cont++;
				}
					
				/*else 
					System.out.println (n+" y "+m+" no son amigos");*/
				
			}
				
		}
		System.out.println ("hay "+cont+" nºs amigos");
	}

}
