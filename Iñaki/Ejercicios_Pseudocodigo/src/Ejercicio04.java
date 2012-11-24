
public class Ejercicio04 {
	public static void main(String[] args) {
		/*4. Algoritmo que decida si un número introducido por teclado es par o impar.*/
		
		int n;
		System.out.println("intoduce un numero: ");
		n=Integer.parseInt(args[0]);
		
		if (n%2==0)
			System.out.println("Es par");
		else
			System.out.println("Es impar");
	}
}