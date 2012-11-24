
public class Primo1 {

	public static void main(String[] args) {
		int n, cont=0, x;
		
		do{
		System.out.println ("Introduce el nº para ver si es primo o no");
		n=LeerTeclado.readInteger();
		}
		
		while (n<=1);
	
		
		if (primo(n))
			System.out.println ("El "+n+" es primo");
		else 
			System.out.println ("El "+n+" no es primo");

		System.out.println();
		System.out.println("Primos hasta el número "+n);
		for ( x=2; x<=n; x++){
			if (primo(x))
				System.out.println("El número "+x);
		}

		System.out.println();
		System.out.println("Los "+n+" primeros primos son ");
		x=2;
		while (cont<n){
			if (primo(x)){
				System.out.println("El nº "+x);
				cont++;
			}
			x++;
		}
		
	}

	

	static boolean primo (int x){
		
		boolean primo=true;
		
		for (int div=2; div<=x/2&&primo; div++)
		{
			if (x%div==0)
				{
				primo=false;
				}
		}
		return primo;

}
}
