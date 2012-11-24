public class Ejercicio9 {
	public static void main(String[] args) {
		System.out.println("Introduzca una cadena de texto");
		String s= new String();
		s=LeerTeclado.readString();
		StringBuffer buf1;
		buf1=new StringBuffer(s);
        if(espalindromo(buf1)==true){
            System.out.println("Es un palindromo");
        }
        else{
           System.out.println("No es un Palindromo");
        }
	}
	public static boolean espalindromo(StringBuffer cadena){
	    boolean palindromo=true;
	    int i,ind; 
	    StringBuffer cadena2;
	    cadena2 = new StringBuffer();
	    // Aquí se eliminan los espacios
	    for (int j=0;j<cadena.length();j++) {
	        if (cadena.charAt(j)!= ' ')
	           cadena2.append(cadena.charAt(j));
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
