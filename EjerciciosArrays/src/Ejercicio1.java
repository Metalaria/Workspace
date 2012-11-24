
public class Ejercicio1 {
	public static void main (String[] args) {
		int numeros [] = new int [10];
		int numeros1[]= new int [10];
		int arraysuma[]=new int[10];
		int n=0;
		int i;
		for(i=0; i<10; i++){
			System.out.println("Introduzca valores de los números del array");
			numeros[i]=LeerTeclado.readInteger();
		}
		for (n=0; n<numeros.length; n++){
			System.out.println("El número es: "+numeros[n]);
		}
		for(n=0; n<10; n++){
			System.out.println("Introduzca valores de los números del segundo array");
			numeros1[n]=LeerTeclado.readInteger();
		}
		arraysuma=suma(numeros, numeros1);
		mostrar(arraysuma);
	}
	
		public static int[] suma (int x [], int y []){
			int arraysuma[]=new int [10];
			int i;
			for (i=0; i<10; i++){
				arraysuma[i]=x[i]+y[i];
			}
			return arraysuma;
		}
	public static void mostrar (int arraysuma[]){
		for (int i=0; i<10; i++){
			System.out.println(arraysuma[i]+" ");
		}
	}
}

