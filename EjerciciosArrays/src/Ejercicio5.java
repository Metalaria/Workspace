public class Ejercicio5 {
	public static void main(String[] args) {
		System.out.println("Introduzca un número");
		int n=LeerTeclado.readInteger();
		System.out.println("Introduzca ahora otro número");
		int m=LeerTeclado.readInteger();
		int i;
		int b;
		int array1[]=new int[n];
		int array2[]=new int[m];
		int array3[]=new int[n];
		int array4[]=new int[m];
		int a = 0;
		int c = 0;
		if (n>m){
		for (b=0; b<=array1.length; b++){	
			for (i=0; i<n; i++){
				System.out.println("Introduce los valores de array");
				array3[a]=LeerTeclado.readInteger();
			}
			i=0;
			for (i=0; i<10; i++){
				System.out.println("Introduce los valores del segundo array");
				array4[c]=LeerTeclado.readInteger();
			}
		}
		}
		/*else {
			for (b=0; b<=array2.length; b++){	
				for (i=0; i<10; i++){
					System.out.println("Introduce los valores de array");
					array3[c]=LeerTeclado.readInteger();
				}
				i=0;
				for (i=0; i<10; i++){
					System.out.println("Introduce los valores del segundo array");
					array4[c]=LeerTeclado.readInteger();
				}
			}
		}*/
		if (array3[1]==array4[1] && array3[2]==array4[2] && array3[3]==array4[3] ){
			System.out.println("El primer array está contenido en el segundo");
		}
		else System.out.println("El primer array no está contenido en el segundo");
	}
}
