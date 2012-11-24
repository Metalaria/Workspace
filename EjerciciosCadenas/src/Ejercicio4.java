public class Ejercicio4 {
	public static void main(String[] args) {
		System.out.println("Introduce una cadena de texto");
		String s=new String();
		s=LeerTeclado.readString();
		System.out.println("Introduce ahora un carácter");
		char c=LeerTeclado.readCharacter();
		buscar(s, c);
		encontrar(s,c);
	}
	public static void buscar (String s, char c){
		if (s.indexOf(s)!=-1)
		System.out.println("El caracter está en la posición "+s.indexOf(c));
		else System.out.println("El carácter introducico no está en la cadena");
	}
	public static void encontrar (String s, char c){
		int pos=0;
		
			if (s.indexOf(c,pos)==-1)
				System.out.println("El caracter no  está en la cadena");
				
				else while (s.indexOf(c,pos)!=-1){
					System.out.println("Está en la posición "+s.indexOf(c,pos+1));
					pos=s.indexOf(c,pos)+1;
				}				
	}
}
