
public class Ejercicio39 {
	public static void main(String[] args) {
		
		
		
		
		int n,i,sum=0;
		for(n=1;n<=1000;n++){
		
			for (i=1; i<n; i++)
			{
				if(n%i==0)
				{
					sum=sum+i;
				}
			}
		
			if (sum==n)
				System.out.println(n+" es un numero perfecto");
			sum=0;
		}
	}
}