package Recursividad;

import arrays.LeerTeclado;

public class CifrasRecursivo {

	public static void main(String[] args) {
		int n;
		System.out.println("Introduce un nº");
		n = LeerTeclado.readInteger();
		System.out.println("Las cifras en orden inverso son ");
		cifra(n);
	}
	public static void cifra(int i){
		int aux;
		if (i<10)
			System.out.println(i);
		else {
			aux=i%10;
			System.out.println(aux);
			cifra(i/10);
		}
	}
}
