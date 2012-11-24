package ejerciciosClaseCadenas;

import ejerciciosCadenas.LeerTeclado;

public class PrincipalCadena {

	public static void main(String[] args) {
		String cad;
		char caracter;
	
		System.out.println("Introduce la cadena");
		cad=LeerTeclado.readString();
		Cadena cadena=new Cadena(cad); //crea un objeto de la clase Cadena (no de la clase String)
		
		//Ejercicio 1
		System.out.println("Longitud de la cadena "+cadena.longitud());
		System.out.println("Carácter central "+ cadena.caracterCentro());
		System.out.println("Mitad derecha de la cadena "+cadena.mitadDerecha());
		System.out.println("Mitad izquierda de la cadena "+cadena.mitadIzq());
		
		//Ejercicio 2 
		
		System.out.println("Introduce el string a concatenar a la cadena");
		String cad2;
		cad2=LeerTeclado.readString();
		System.out.println("Las cadena concatenadas en mayúsculas son "+cadena.concatenar(cad2));
		
		Cadena cadena2=new Cadena(cad2);
		System.out.println("Las cadena concatenadas en mayúsculas son "+cadena.concatenar2(cadena2));
		
		//Ejercicio 3
		
		System.out.println("Introduce la segunda cadena para ver si una está contenida en la otra");
		String cad3;
		cad3=LeerTeclado.readString();
		Cadena cadena3=new Cadena(cad3);
		cadena.contenida(cadena3);
		
		//Ejercicio 4
		System.out.println("Introduce el caracter a buscar en la cadena");
		caracter=LeerTeclado.readCharacter();
		
		System.out.println("Buscamos la primera aparición del carácter desde el principio de la cadena");
		cadena.buscarCaracterPrincipio(caracter);
		System.out.println();
		
		
		System.out.println("Buscamos todas las apariciones del carácter en la cadena");
		cadena.buscarTodos(caracter);
		System.out.println();
		
		System.out.println("Buscamos la primera aparición del carácter desde el final de la cadena");
		cadena.buscarCaracterFinal(caracter);
		
		//Ejercicio 5
		
		System.out.println();
		System.out.println("La cadena sin vocales es "+cadena.sinVocales());
		
		
		//Ejercicio 6
		
		System.out.println();
		if (cadena.palindroma())
			System.out.println("La cadena es palíndroma y se lee igual hacia adelante que hacia atrás");
		else
			System.out.println("La cadena no es palíndroma");


	}
	}


