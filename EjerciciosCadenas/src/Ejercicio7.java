public class Ejercicio7 {
	public static void main (String[] args){
		System.out.println("Introduce una cadena de texto");
		String s=new String();
		s=LeerTeclado.readString();
		StringBuffer buf1;
		buf1=new StringBuffer(s);
		System.out.println("Introduce ahora un car�cter");
		char c = LeerTeclado.readCharacter();
		s=String.valueOf(c);
		buscar(buf1, s);
		encontrar(buf1,s);
	}
	public static void buscar (StringBuffer f, String s){
		if (f.indexOf(s)!=-1)
		System.out.println("El caracter est� en la posici�n "+f.indexOf(s));
		else System.out.println("El car�cter introducico no est� en la cadena");
	}
	public static void encontrar (StringBuffer f, String c){
		int pos=0;
			if (f.indexOf(c,pos)==-1)
				System.out.println("El caracter no  est� en la cadena");
				
				else while (f.indexOf(c,pos)!=-1){
					System.out.println("Est� en la posici�n "+f.indexOf(c,pos));
					pos=f.indexOf(c,pos)+1;
				}				
	}
}	