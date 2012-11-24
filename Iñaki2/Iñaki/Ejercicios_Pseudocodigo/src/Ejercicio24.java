import Ejercicio1.LeerTeclado;


public class Ejercicio24 {
	public static void main(String[] args) {
		/*24. Algoritmo que, dado un año, decida si es bisiesto o no.*/
		
		System.out.println("Introduce un año: ");
		int anio=LeerTeclado.readInteger();
		
		if ((anio%4==0) && ((anio%100!=0) || (anio%400==0)))
			System.out.println("El año es bisiesto");
		else
			System.out.println("El año no es bisiesto");
	}
}