

public class PotenciaRecursiva {

	public static void main(String[] args) {
		int a,b;
		System.out.println("Introduce base ");
		a = LeerTeclado.readInteger();
		System.out.println("Introduce exponente ");
		b = LeerTeclado.readInteger();
		System.out.println ("La potencia de "+a+ " elevado a "+b+" es igual a "+potencia(a,b));
		
	}
	public static double potencia (int x, int y){
		if (y == 0)
			return 1;
		else if (y > 0)
			return x * potencia(x, y - 1);
		else
			return 1 / (x * potencia(x, -y));
	}
}
