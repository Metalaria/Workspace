
public class Ejercicio19 {
	public static void main(String[] args) {
		/*19. Imprimir la suma de los múltiplos de 2 desde el 8 al 400.*/
		
		int n=8;
		int suma=0;
		
		while (n!=400)
		{
			if (n%2==0)
			{
				suma=suma+n;
			}
			
			n++;
		}
		
		System.out.println("Suma: "+suma);
	}
}
