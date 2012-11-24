
public class Ejercicio2 {
	public static void main(String[] args) {
		int numeros []= new int[10];
		int i = 0;
		for(i=0; i<10; i++){
			System.out.println("Introduzca valores de los números del array");
			numeros[i]=LeerTeclado.readInteger();
		}
		String posicion=mostrarPosicion(numeros);
		String ceros=encontrarCeros(numeros);
		String positivos=encontrarPositivos(numeros);
		String mayor=elementoMayor(numeros);
	}
	public static void rellenar (int array[]){
		int i;
		for (i=0; i<10; i++){
			System.out.println("Introduce los números del array");
			array[i]=LeerTeclado.readInteger();
		}
	}
	
/*	public static int suma [] (int suma[]){
		int suma[]=new int [10];
		int i=0;
		int sumaArray=0;
		for (i=0; i<10; i++){
			sumaArray=sumaArray+i;
		}
		return sumaArray;
	}*/
	
	public static String  mostrarPosicion (int arrayposicion[]){
		int posicion []=new int [10];
		int i = 0;
		int contPosic=0;
		if (posicion[i]<17)
			contPosic++;
		return "Posicion: +i";
	}
	
	public static String encontrarCeros (int ceros[]){
		int cero[]=new int[10];
		int i = 0;
		int a=0;
		int contCeros=0;
		for (i=0; i<10; i++){
			if (i%2==0)
				if (cero[i]==0)
				contCeros++;
		}
		return "Hay "+contCeros+" ceros.";
	}
	
	public static String encontrarPositivos (int[] positivos){
		int positivo[]=new int[10];
		int i = 0;
		int a=0;
		int contPos=0;
		int contNeg=0;
		for (i=0; i<10; i++){
			if (i%2==0)
				if (positivo[i]>0)
				contPos++;
				else contNeg++;
		}
		return "Hay "+contPos+" números positivos y "+contNeg+" números negativos.";
	}
	
	public static String elementoMayor (int arrayMayor []){
		int mayor[]= new int[10];
		int i;
		int a = 0;
		int aux = 0;
		i=aux;
		for (i=0; i<10; i++){
			if (mayor[i]>aux)
				aux=i;
		}
		System.out.println("El número mayor del array es: "+aux);
		return null;
	}
}
