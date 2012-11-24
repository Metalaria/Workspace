package ejerciciosStringBuffer;

import ejerciciosCadenas.LeerTeclado;

public class InsertarCaracter {

	public static void main(String[] args) {
		String cadena;
		System.out.println("Introduce la cadena");
		cadena=LeerTeclado.readString();
		
		StringBuffer cadenaB=new StringBuffer(cadena);
		StringBuffer cadenaB2=new StringBuffer(cadena);
		insertPunto(cadenaB);
		
		int posicion;
		char c;
		
		System.out.println("Introduce la separación para colocar el carácter separador");
		posicion=LeerTeclado.readInteger();
		System.out.println("Introduce el carácter separador que desees");
		c=LeerTeclado.readCharacter();
		
		
		insertCaracter(cadenaB2, posicion, c);
	}
	
	public static void insertPunto (StringBuffer cadenB){
		if (cadenB.length()>3){
			int pos=cadenB.length()-3;
			while (pos>=0){
				cadenB.insert(pos, '.');
				pos-=3;
			}
			
		}		
		System.out.println("la nueva cadena es: "+cadenB);
	}
	
	public static void insertCaracter (StringBuffer cadenB, int posicion, char c){
		
		if (cadenB.length()>posicion){
			int pos=cadenB.length()-posicion;
			while (pos>=0){
				cadenB.insert(pos, c);
				pos-=posicion;
			}
			
		}		
		System.out.println("la nueva cadena es: "+cadenB);
	}
}

		
		
		
		

	


