import Ejercicio1.LeerTeclado;


public class Ejercicio24 {
	public static void main(String[] args) {
		/*24. Algoritmo que, dado un a�o, decida si es bisiesto o no.*/
		
		System.out.println("Introduce un a�o: ");
		int anio=LeerTeclado.readInteger();
		
		if ((anio%4==0) && ((anio%100!=0) || (anio%400==0)))
			System.out.println("El a�o es bisiesto");
		else
			System.out.println("El a�o no es bisiesto");
	}
}