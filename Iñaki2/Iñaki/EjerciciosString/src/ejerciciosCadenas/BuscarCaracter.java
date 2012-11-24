package ejerciciosCadenas;

public class BuscarCaracter {

	public static void main(String[] args) {
		String cadena;
		char caracter;
		
		System.out.println("Introduce la cadena");
		cadena=LeerTeclado.readString();
		System.out.println("Introduce el caracter a buscar");
		caracter=LeerTeclado.readCharacter();
		
		System.out.println("Buscamos la primera aparición del carácter desde el principio de la cadena");
		buscarPrincipio(cadena,caracter);
		System.out.println();
		
		
		System.out.println("Buscamos todas las apariciones del carácter en la cadena");
		buscarTodos (cadena, caracter);
		System.out.println();
		
		System.out.println("Buscamos la primera aparición del carácter desde el final de la cadena");
		buscarFinal(cadena,caracter);

	}
	
	public static void buscarPrincipio (String caden, char car){
		int posicion= caden.indexOf(car);
		if (posicion==-1)
			System.out.println("El carácter no se encuentra en la cadena");
		
		else 	
			System.out.println("El carácter se encuentra en la posición "+posicion);
	}
	
	public static void buscarFinal (String caden, char car){
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
				System.out.println("el carácter no se encuentra en la cadena");
			else
				System.out.println("El carácter se encuentra en la posición "+posicion);	
		}
	
	
	public static void buscarTodos (String caden, char car){
		int pos=0;

		if (caden.indexOf(car,pos)==-1)
			System.out.println("El carácter no se encuentra en la cadena");

		else 
			while (caden.indexOf(car, pos)!=-1)
			{	
				System.out.println("El carácter se encuentra en la posición "+caden.indexOf(car,pos));
				pos=caden.indexOf(car,pos)+1;//buscamos a partir de la posicion donde se encontró (pos)
			}

	}

}
