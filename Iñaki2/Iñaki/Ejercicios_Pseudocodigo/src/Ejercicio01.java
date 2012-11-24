import Ejercicio1.LeerTeclado;


public class Ejercicio01 {

	public static void main(String[] args) {
		// Ejercicios de Suma Resta Multiplicacion y division
		System.out.println("Ejercicio 1");
		System.out.println("Introduzca dos numeros con los que efectuar las operaciones.");
		
		int a,b,suma,resta,multiplicacion,division;
		a=LeerTeclado.readInteger();
		b=LeerTeclado.readInteger();
		
		suma=a+b;
		resta=a-b;
		multiplicacion=a*b;
		division=a/b;
		
		
		System.out.println("La suma de "+a+" y "+b+" es "+suma);		
		System.out.println("La resta de "+a+" y "+b+" es "+resta);
		System.out.println("La multiplicacion de "+a+" y "+b+" es "+multiplicacion);
		System.out.println("La division de "+a+" y "+b+" es "+division);

		
	}

}
