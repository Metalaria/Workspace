package TrianguloEquilatero;

import Articulo.LeerTeclado;

public class Principal {
	public static void main(String[] args) {
		
		//Declaración de los objetos
		Metodos t1, t2;
		
		//Creación del primer objeto, y pedida de atributos por teclado
		t1 = new Metodos();
		System.out.println("Introduce lado: ");
		double l = LeerTeclado.readDouble();
		t1.setLado(l);
		System.out.println("Introduce altura: ");
		double a = LeerTeclado.readDouble();
		t1.setAltura(a);
		
		//Creación del segundo objeto, y pedida de atributos por teclado
		System.out.println("Introduce lado: ");
		l = LeerTeclado.readDouble();
		System.out.println("Introduce altura: ");
		a = LeerTeclado.readDouble();
		t2=new Metodos(l,a); //Defino t2 y le paso los valores al constructor
		
		//Muestro por pantalla la cadena del toString
		System.out.println("Triangulo 1 => " +t1.toString());
		System.out.println("Triangulo 2 => " +t2.toString());
		
		//Cambio el lado de uno
		System.out.println("Dame un nuevo lado: ");
		l = LeerTeclado.readDouble();
		t2.setLado(l);
		
		//Muestro el nuevo area y perimetro
		System.out.println("Triangulo modificado: "+t2.toString());
	}
}