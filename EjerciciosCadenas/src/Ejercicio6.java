public class Ejercicio6 {
	public static void main(String[] args) {
		System.out.println("Introduzca una cadena de texto");
		String s= new String();
		s=LeerTeclado.readString();
        if(espalindromo(s)==true){
            System.out.println("Es un palindromo");
        }
        else{
           System.out.println("No es un Palindromo");
        }
	}
	public static boolean espalindromo(String cadena){
	    boolean palindromo=true;
	    int i,ind;    
	    String cadena2="";
	    // Aquí se eliminan los espacios
	    for (int j=0;j<cadena.length();j++) {
	        if (cadena.charAt(j)!= ' ')
	            cadena2+=cadena.charAt(j);
	    }
	    cadena=cadena2;    
	    ind=cadena.length();
	    // Aquí se comparan las cadenas
	    for (i=0 ;i<cadena.length();i++){        
	       if (cadena.substring(i, i+1).equals(cadena.substring(ind - 1, ind))==false){
	            palindromo=false;
	            break;
	       }
	       ind--;
	    }
	    return palindromo;
	}
}
