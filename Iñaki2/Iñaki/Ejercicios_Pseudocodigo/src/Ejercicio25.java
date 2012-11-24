
public class Ejercicio25 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fact,f,i;
		fact=1;
		
		for(i=1;i<=10;i++){
			f=i;
			System.out.println("Factorial de "+i);
			while (f>0)
			{
				fact=fact*f;
				f--;
			}
			System.out.println("Numero "+fact);
			fact=1;
		}
	}
	

}
