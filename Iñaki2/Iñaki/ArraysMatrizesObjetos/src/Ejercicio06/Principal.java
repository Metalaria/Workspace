package Ejercicio06;

public class Principal {
	public static void main(String[] args) {
		CartaMejorada c = new CartaMejorada();
		
		System.out.println("¡Bienvenido al BlackJack!");
		System.out.println("Barajando...");
		
		c.repartir();
	}
}
