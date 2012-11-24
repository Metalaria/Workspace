package ejerciciosStringBuffer;

import ejerciciosCadenas.LeerTeclado;

public class BuscarCaracter {

	public static void main(String[] args) {
		String cadena;
		StringBuffer cadenaB;
		char caracter;
		
		System.out.println("Introduce la cadena");
		cadena=LeerTeclado.readString();
		
		cadenaB=new StringBuffer(cadena);
		
		System.out.println("Introduce el caracter a buscar");
		caracter=LeerTeclado.readCharacter();
		
		String car=String.valueOf(caracter);
		
		System.out.println("Buscamos la primera aparici�n del car�cter desde el principio de la cadena");
		buscarPrincipio(cadenaB,car);
		System.out.println();
		
		
		System.out.println("Buscamos todas las apariciones del car�cter en la cadena");
		buscarTodos (cadenaB, car);
		System.out.println();
		
		System.out.println("Buscamos la primera aparici�n del car�cter desde el final de la cadena");
		buscarFinal(cadenaB,caracter);

	}
	
	public static void buscarPrincipio (StringBuffer caden, String car){
		int posicion= caden.indexOf(car);
		if (posicion==-1)
			System.out.println("El car�cter no se encuentra en la cadena");
		
		else 
			System.out.println("El car�cter se encuentra en la posici�n "+posicion);
		
	}
	
	public static void buscarFinal (StringBuffer caden, char car){
		int posicion=0;
		boolean encontrado=false;
		for (int i=caden.length()-1; i>=0; i--){
			if (caden.charAt(i)==car){
				encontrado=true;
				posicion=i;
				break;
				}
		}
			if (!encontrado)
				System.out.println("el car�cter no se encuentra en la cadena");
			else
				System.out.println("El car�cter se encuentra en la posici�n "+posicion);	
	}
	
	public static void buscarTodos (StringBuffer caden, String car){
		
		int pos=0;

		if (caden.indexOf(car,pos)==-1)
			System.out.println("El car�cter no se encuentra en la cadena");

		else 
			while (caden.indexOf(car, pos)!=-1)
			{	
				System.out.println("El car�cter se encuentra en la posici�n "+caden.indexOf(car,pos));
				pos=caden.indexOf(car,pos)+1;//buscamos a partir de la posicion donde se encontr� (pos)
			}

	}

}
