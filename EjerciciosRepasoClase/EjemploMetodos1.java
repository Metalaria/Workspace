
public class EjemploMetodos1 {

	
	public static void main(String[] args) {
		
		int num, contPos=0, contNeg=0;
		
		System.out.println("Introduce una serie de n�, 0 es fin");
		num=LeerTeclado.readInteger();
		
		while (num!=0){
			
			if (esPositivo(num)==true)
				contPos++;
			else contNeg++;
			
			System.out.println("Introduce una serie de n�, 0 es fin");
			num=LeerTeclado.readInteger();
			
		}
		System.out.println("el n� de positivos es " +contPos);
		System.out.println("el n� de negativos es " +contNeg);

	}
	
	public static boolean esPositivo (int n ){
		if (n>0)
			return true;
		else return false;
	}
	
	

}
