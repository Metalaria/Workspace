package ejerciciosCadenas;

public class SuprimirVocales {

	public static void main(String[] args) {
		String cadena;
		System.out.println("Introduce la cadena ");
		cadena=LeerTeclado.readString();
		System.out.println("La cadena sin vocales es "+sinVocales(cadena));
		System.out.println("La cadena sin vocales es "+sinVocales2(cadena));
	}
	
	public static String sinVocales (String cadena){
		//extrae los char y, si no son vocales, los concatena en un string
		//para concatenar, debe pasar los char a String con valueOf
		int pos=0;
		char car;
		String cadena2, cadenaFinal="";
		while (pos<cadena.length()){ //puede ser un for
			car=cadena.charAt(pos); //extrae cada posición de la cadena y lo guarda en un char
			if (car!='a'&&car!='e'&&car!='i'&&car!='o'&&car!='u'){ //si no es vocal 
			
			//en realidad es mejor pasar los caracteres a minúsculas con Character.toLowerCase(car) para hacer la comparación 
			//if (Character.toLowerCase(car)!='a'&&Character.toLowerCase(car)!='e'&&Character.toLowerCase(car)!='i'&&Character.toLowerCase(car)!='o'&&Character.toLowerCase(car)!='u'){ //si no son vocales las concatenará
				
				cadena2=String.valueOf(car); //pasa el caracter a cadena con valueOf para poder concatenarlo con otra cadena
				cadenaFinal=cadenaFinal.concat(cadena2); //concatena la cadena con el nuevo caracter
			// tambien: cadenaFinal=cadenaFinal.concat(String.valueOf(car));
			}
			pos++; //aumenta la posición para seguir recorriendo la cadena
		}
		return cadenaFinal;
	}
	
	public static String sinVocales2(String cadena){ 
		//Otra forma: volcando la cadena a un array, copiando este en otro array eliminando las vocales
		// y volcando el nuevo array en un string
		String cadenaFinal;
		char car;
		char [] array= new char[cadena.length()]; //array que contendrá la cadena original
		char [] arrayNuevo= new char[cadena.length()]; //array donde se copiarán las consonantes
		cadena.getChars(0, cadena.length(), array, 0); //copia la cadena en el array original
		int j=0; //indice para manejar el nuevo array
		for (int i=0; i<array.length; i++){ 
			car=array[i]; 
			if (Character.toLowerCase(car)!='a'&&Character.toLowerCase(car)!='e'&&Character.toLowerCase(car)!='i'&&Character.toLowerCase(car)!='o'&&Character.toLowerCase(car)!='u'){ //si no es vocal 
				arrayNuevo[j]=array[i]; //lo copia en el nuevo array
				j++;
			}
		}
		cadenaFinal=new String(arrayNuevo); //al final del for, vuelca el nuevo array en la cadenaFinal
		return cadenaFinal.trim(); //elimina los espacios de la cadenaFinal que estaban al final del array nuevo
		}
		
	}


