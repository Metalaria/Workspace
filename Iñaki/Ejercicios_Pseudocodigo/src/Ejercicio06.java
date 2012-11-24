
public class Ejercicio06 {
	public static void main(String[] args) {
		/*6. Algoritmo que lea dos números y decida si uno es divisor de otro.*/

		int n1,n2;
		
		System.out.println("Introduce dos números: ");
		n1=Integer.parseInt(args[0]);
		n2=Integer.parseInt(args[1]);
		
		if (n1%n2==0)
			System.out.println("El primer numero es divisor del segundo");
		else
			System.out.println("No son divisores");
	}

}