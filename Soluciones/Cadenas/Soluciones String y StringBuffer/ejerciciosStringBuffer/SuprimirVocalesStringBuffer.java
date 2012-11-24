package ejerciciosStringBuffer;

import ejerciciosCadenas.LeerTeclado;

public class SuprimirVocalesStringBuffer {

	public static void main(String[] args) {
		String cadena;
		System.out.println("Introduce la cadena ");
		cadena=LeerTeclado.readString();
		
		StringBuffer cadenaB=new StringBuffer(cadena);
		
		System.out.println("La cadena sin vocales es "+sinVocales(cadenaB));
	}
	
	public static StringBuffer sinVocales(StringBuffer cadenaB){
		StringBuffer cadenaFinal=new StringBuffer();
		int pos=0;
		char car;
		
		while (pos<cadenaB.length()){ // se puede hacer con un for
			car=cadenaB.charAt(pos); //extrae cada posición de la cadena y lo guarda en un char
			if (Character.toLowerCase(car)!='a'&&Character.toLowerCase(car)!='e'&&Character.toLowerCase(car)!='i'&&Character.toLowerCase(car)!='o'&&Character.toLowerCase(car)!='u'){ //si no son vocales las concatenará
				cadenaFinal.append(car); //concatena la cadena con el nuevo caracter
			}
			pos++; //aumenta la posición para seguir recorriendo la cadena
		}
		return cadenaFinal;

	}
	
}


