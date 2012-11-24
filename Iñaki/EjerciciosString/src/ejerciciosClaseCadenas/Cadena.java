package ejerciciosClaseCadenas;

public class Cadena { 
	//una única clase Cadena para resolver todos los ejercicios anteriores
	//esta clase se invoca desde el PrincipalCadena creando un objeto haciendo un new Cadena()
	
	String s;
	
	public Cadena (String s){
		this.s=s;
	}
	
	//Ejercicio 1: longitud, caracter central y mitad derecha e izquierda
	
	public int longitud(){ //obtiene la longitud
		return s.length();
	}
	
	public char caracterCentro (){
		
		/*int centro=longitud()/2;  
		char car=s.charAt(centro);
		return car;*/
		
		return s.charAt(longitud()/2);
	}
	
	public String mitadDerecha (){ //obtiene la mitad derecha
	
			
		String aux=s.substring(longitud()/2);
		return aux;
		//return s.substring(longitud()/2);
	}
	
	public String mitadIzq (){ // obtiene la mitad izquierda
		
		return (s.substring(0,longitud()/2));
	}
	
	//Ejercicio 2 Concatenar cadenas
	
	public String concatenar (String s2){ //version 1 se le pasa un string para concatenar
		return s.concat(" ").concat(s2).toUpperCase();
	}
	
	public String concatenar2 (Cadena cadena2){ //version 2 se le pasa un objeto de clase Cadena 
		//cuyo atributo es el string a concatenar
		return s.concat(" ").concat(cadena2.s).toUpperCase();
	}
	
	//Ejercicio 3: cadenas contenidas
	
	public  void contenida (Cadena cadena2){//se le pasa un objeto de tipo Cadena
		//String s2=cadena2.s; //similar al caso anterior si se le pasara un objeto String
		if (this.longitud()==cadena2.longitud())
			if (s.equalsIgnoreCase(cadena2.s))
				System.out.println("Las cadenas son iguales");
			else 
				System.out.println("Las cadenas son de la misma longitud pero no son iguales");
		else
			if (longitud()>cadena2.longitud())
				if (s.indexOf(cadena2.s)!=-1)
					System.out.println("La cadena 2 es menor y está contenida en la cadena 1");
				else 
					System.out.println("La cadena 2 es menor y no está contenida en la cadena 1");
			else 
				if (cadena2.s.indexOf(s)!=-1)
					System.out.println("La cadena 1 es menor y está contenida en la cadena 2");
				else 
					System.out.println("La cadena 1 es menor y no está contenida en la cadena 2");
	}
	//Ejercicio 4: buscar caracter
	
	public void buscarCaracterPrincipio (char car){ //apartado a
		int posicion= s.indexOf(car);
		if (posicion==-1)
			System.out.println("El carácter no se encuentra en la cadena");
		else 	
			System.out.println("El carácter se encuentra en la posición "+posicion);
		}
	
	public void buscarCaracterFinal (char car){ //apartado c		
		int posicion=0;
		boolean encontrado=false;
		for (int i=s.length()-1; i>=0; i--){
			if (s.charAt(i)==car){
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

	public  void buscarTodos (char car){ //apartado b
		int pos=0;

		if (s.indexOf(car,pos)==-1)
			System.out.println("El carácter no se encuentra en la cadena");

		else 
			while (s.indexOf(car, pos)!=-1)
			{	
				System.out.println("El carácter se encuentra en la posición "+s.indexOf(car,pos));
				pos=s.indexOf(car,pos)+1;//buscamos a partir de la posicion donde se encontró (pos)
			}

	}
	
	public  String sinVocales (){ //Ejercicio 5
		String cadena2, cadenaFinal="";
		int pos=0;
		char car;
		while (pos<s.length()){
			car=s.charAt(pos); //extrae cada posición de la cadena y lo guarda en un char
			if (car!='a'&&car!='e'&&car!='i'&&car!='o'&&car!='u'){ //si no es vocal 
			
			//en realidad es mejor pasar los caracteres a minúsculas con Character.toLowerCase(car) para hacer la comparación 
			//if (Character.toLowerCase(car)!='a'&&Character.toLowerCase(car)!='e'&&Character.toLowerCase(car)!='i'&&Character.toLowerCase(car)!='o'&&Character.toLowerCase(car)!='u'){ //si no son vocales las concatenará
				
				cadena2=String.valueOf(car); //pasa el caracter a cadena con valueOf para poder concatenarlo con otra cadena
				cadenaFinal=cadenaFinal.concat(cadena2); //concatena la cadena con el nuevo caracter
			}
			pos++; //aumenta la posición para seguir recorriendo la cadena
		}
		return cadenaFinal;
	}
	//Ejercicio 6
	
	public String borrarEspacios (){ //borra los espacios de la cadena generando un string
		String cad2=new String();
		char c;
		for (int i=0; i<longitud(); i++){
			if (s.charAt(i)!=' '){
				c=s.charAt(i);
				 cad2=cad2.concat(String.valueOf(c)); 
			}
				
		}
		return cad2;
	}
	public boolean palindroma (){ 
		String s2=borrarEspacios(); //borramos los espacios primero
		System.out.println("La cadena sin espacios es "+s2);
		boolean esPalindromo=true;
		int i=0, j=s2.length()-1;
		while (i<=s2.length()/2 && esPalindromo){
			//if (cad.charAt(i)!=cad.charAt(j)) es mejor pasarlo a minúsculas
			if (Character.toLowerCase(s2.charAt(i))!=Character.toLowerCase(s2.charAt(j)))
				esPalindromo=false;
			else {
				i++;
				j--;
			}
		}
		return esPalindromo;
			}
	}


