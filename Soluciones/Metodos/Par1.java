
public class Par1 {

	public static boolean par(int num)
	{
		if (num%2==0) 
			return true;
		else return false;
	}
	
	public static int introduceEntero ()
	{	int n;
		do {
			System.out.println ("Introduce un n� positivo");
			n=LeerTeclado.readInteger();		
		}
		while (n<0);
		return n;
	}
	
	public static void main(String[] args) {
		
		int n=introduceEntero();
		if (par(n))
			System.out.println ("El n� "+n+" es par");
		else
			System.out.println ("El n� "+n+" es impar");

	}
	
	

}
