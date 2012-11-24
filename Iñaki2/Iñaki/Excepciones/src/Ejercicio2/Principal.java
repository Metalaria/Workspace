package Ejercicio2;

import java.io.IOException;

public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			sumaPositivos();
		}
		catch (Exception e) {
			System.out.println("No metas numeros negativos capullo");
		}

	}
	
	public static void sumaPositivos() throws ArithmeticException{
		int numero;
		int suma=0;
		System.out.println("Introduzca numero");
		numero=LeerTeclado.readInteger();
		while(numero!=0){
			if(numero<0)throw new ArithmeticException();
			else{
				suma=suma+numero;
				System.out.println("Introduzca numero");
				numero=LeerTeclado.readInteger();
			}
		}
		System.out.println("Suma: "+suma);
		
	}

}
