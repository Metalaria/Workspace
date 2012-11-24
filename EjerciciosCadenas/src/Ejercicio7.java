public class Ejercicio7 {
	public static void main (String[] args){
		System.out.println("Introduce una cadena de texto");
		String s=new String();
		s=LeerTeclado.readString();
		StringBuffer buf1;
		buf1=new StringBuffer(s);
		System.out.println("Introduce ahora un carácter");
		char c = LeerTeclado.readCharacter();
		s=String.valueOf(c);
		buscar(buf1, s);
		encontrar(buf1,s);
	}
	public static void buscar (StringBuffer f, String s){
		if (f.indexOf(s)!=-1)
		System.out.println("El caracter está en la posición "+f.indexOf(s));
		else System.out.println("El carácter introducico no está en la cadena");
	}
	public static void encontrar (StringBuffer f, String c){
		int pos=0;
			if (f.indexOf(c,pos)==-1)
				System.out.println("El caracter no  está en la cadena");
				
				else while (f.indexOf(c,pos)!=-1){
					System.out.println("Está en la posición "+f.indexOf(c,pos));
					pos=f.indexOf(c,pos)+1;
				}				
	}
}	