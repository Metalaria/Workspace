import Ejercicio1.LeerTeclado;


public class Ejercicio42 {
	public static void main(String[] args) {
		/*42. Introducir dos números por teclado y mediante un menú
		 * calcular su suma, resta, multiplicación o división.*/
		
		System.out.println("Introduce dos numeros: ");
		int n=LeerTeclado.readInteger();
		int m=LeerTeclado.readInteger();
		
		System.out.println("1.- Suma  2.- Resta  3.- Multiplicación  4.-Division");
		int opc=LeerTeclado.readInteger();
		
		switch (opc){
		
	 	case 1: System.out.println(n+m);
	     		break;
	     		
	 	case 2: if (n>m)
	 			System.out.println(n-m);
	 			else
	 				System.out.println(m-n);
	 			break;
	 			
	 	case 3: System.out.println(n*m);
	 			break;
	 			
	 	case 4: if (n>m)
	 			System.out.println(n/m);
			else
				System.out.println(m/n);
			break;
			
		default: System.out.println("Opción incorrecta");
		}
	}
}