
public class Ejercicio22 {
	public static void main(String[] args) {
		/*22. Dada la ecuación y= x3+ 5*x2-2*x, visualizar el valor
		 * de y para los valores de x múltiplos de 5 desde el 10 hasta el 75.*/
		
		int x=5;
		int y=0;
		
		while (x<=75)
		{
			y=(x^3)+(5*(x^2))-(2*x);
			System.out.println("Para x= "+x+" Y vale: "+y);
			x=x+5;
		}	
	}
}