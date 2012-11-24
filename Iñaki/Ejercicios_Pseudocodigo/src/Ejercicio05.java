
public class Ejercicio05 {
	public static void main(String[] args) {
		/*5. Algoritmo que decida si un número es positivo, negativo o cero.*/
		
		int n;
		System.out.println("Introduce un número: ");
		n=Integer.parseInt(args[0]);
		
		if (n==0)
			System.out.println("Es cero");
		else{
			if (n>0)
				System.out.println("Es positivo");
			else
				System.out.println("Es negativo");
			
		}
	}

}
