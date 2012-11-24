import Ejercicio1.LeerTeclado;


public class Ejercicio15 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int a;
		
		do {
		System.out.println("Introduzca un numero del 0 al 10");
		a=LeerTeclado.readInteger();
		}
		while (a<0 || a>10);
		
		switch (a){
		case 0: case 1:case 2: System.out.println("Muy Deficiente");
		break;
		case 3: case 4: System.out.println("Insuficiente");
		break;
		case 5: System.out.println("Suficiente");
		break;
		case 6: System.out.println("Bien");
		break;
		case 7: case 8: System.out.println("Notable");
		break;
		case 9: case 10: System.out.println("Sobresaliente");
		break;
		}
	}

}
