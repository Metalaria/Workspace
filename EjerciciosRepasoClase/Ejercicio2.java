public class Ejercicio2 {

	public static void main(String[] args) {
		
		int n;
		
		n=intNumero();
		
		while (n!=0)
		{
			
			
			estudiarNum(n);
			n=intNumero();
			
		}
			
		
}
	public static int intNumero(){
		
		int num;
		do {
			System.out.println("Introduce un nº, fin es 0");
			num=LeerTeclado.readInteger();
		}
		while (num<0);
		
		return num;
		
	}
	
	public static void estudiarNum (int num){
		int opc;
		do {
			System.out.println("Menu");
			System.out.println("1. Es divisible por 2");
			System.out.println("2. Es divisible por 3");
			System.out.println("3. Es divisible por 5");
			System.out.println("4. Fin");
			
			System.out.println("introduce opcion de 1 a 4");
			opc=LeerTeclado.readInteger();
			
			switch (opc){
			case 1: divisibleDos(num);
					break;
			case 2: divisibleTres(num);
					break;
			case 3: divisibleCinco(num);
					break;
			case 4: System.out.println("adios");
					break;
			default: System.out.println("Error en opción");
			break;
			}
			}
		
			while (opc!=4);
			
	}

	public static int ultimaCifra(int x) {
		int resto = x % 10;
		return resto;
	}

	public static int sumaCifras(int x) {
		int suma = 0, aux = x;
		while (aux != 0) {
			suma += aux % 10;
			aux /= 10;
		}
		return suma;
	}

	public static void divisibleDos(int x) {
		if (ultimaCifra(x) == 0 || ultimaCifra(x) % 2 == 0)
			System.out.println("El nº es divisible por 2");
		else
			System.out.println("El nº no es divisible por 2");
	}

	public static void divisibleCinco(int x) {
		if (ultimaCifra(x) == 0 || ultimaCifra(x) == 5)
			System.out.println("El nº es divisible por 5");
		else
			System.out.println("El nº no es divisible por 5");
	}

	public static void divisibleTres(int x) {

		if (sumaCifras(x) % 3 == 0)
			System.out.println("El nº es divisible por 3");
		else
			System.out.println("El nº no es divisible por 3");
	}

}
