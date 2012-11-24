package ejerciciosStringBuffer;

import ejerciciosCadenas.LeerTeclado;

public class CadenaPalindroma {

	public static void main(String[] args) {
		String cadena;
		
		System.out.println("Introduce la cadena ");
		cadena=LeerTeclado.readString();
		
		StringBuffer cadenaB=new StringBuffer(cadena);
		
		//invocamos al primer método para borrarEspacios, generando una nueva cadena
		StringBuffer cadenaSinEspacios=borrarEspacios(cadenaB);
		System.out.println("La cadena sin espacios es "+borrarEspacios(cadenaB));
		if (palindromo(cadenaSinEspacios))
			System.out.println("La cadena es palíndroma y se lee igual hacia adelante que hacia atrás");
		else
			System.out.println("La cadena no es palíndroma");
		
	}
	
	public static StringBuffer borrarEspacios (StringBuffer cad){
		//añade a un nuevo StringBuffer los caracteres que no son espacios con append()
		StringBuffer cad2=new StringBuffer();
		
		for (int i=0; i<cad.length(); i++){
			if (cad.charAt(i)!=' ')
				cad2.append(cad.charAt(i)); 
		}
		return cad2;
	}
	
	public static boolean palindromo (StringBuffer cad){
		boolean esPalindromo=true;
		
		int i=0, j=cad.length()-1;
		while (i<=cad.length()/2 && esPalindromo){
			//if (cad.charAt(i)!=cad.charAt(j)) es mejor pasarlo a minúsculas
			if (Character.toLowerCase(cad.charAt(i))!=Character.toLowerCase(cad.charAt(j)))
				esPalindromo=false;
			else {
				i++;
				j--;
			}
		}
		return esPalindromo;
			}
		
	}


