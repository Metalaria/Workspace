public class Ejercicio1 {
	public static void main (String[] args){
		System.out.println("Introduce un número");
		double n=LeerTeclado.readInteger();
		System.out.println("Introduzca ahora otro número");
		double m=LeerTeclado.readInteger();
		int suma=(int) (n+m);
		System.out.println("La suma de ambos es: "+suma);
		int resta=(int) (n-m);
		System.out.println("La resta de ambos es: "+resta);
		System.out.println("El producto de ambos es: "+n*m);
		double cociente=n/m;
		System.out.println("El cociente de ambos es: "+cociente);
		
	}
}
