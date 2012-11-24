package Ejercicio3;

public class Principal {
	public static void main(String[] args) {
		try {
			Factorial a = new Factorial();
		}
		catch (Exception e) {
			System.out.println("No metas numeros negativos");
		}
	}
}