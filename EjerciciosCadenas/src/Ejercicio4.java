public class Ejercicio4 {
	public static void main(String[] args) {
		System.out.println("Introduce una cadena de texto");
		String s=new String();
		s=LeerTeclado.readString();
		System.out.println("Introduce ahora un car�cter");
		char c=LeerTeclado.readCharacter();
		buscar(s, c);
		encontrar(s,c);
	}
	public static void buscar (String s, char c){
		if (s.indexOf(s)!=-1)
		System.out.println("El caracter est� en la posici�n "+s.indexOf(c));
		else System.out.println("El car�cter introducico no est� en la cadena");
	}
	public static void encontrar (String s, char c){
		int pos=0;
		
			if (s.indexOf(c,pos)==-1)
				System.out.println("El caracter no  est� en la cadena");
				
				else while (s.indexOf(c,pos)!=-1){
					System.out.println("Est� en la posici�n "+s.indexOf(c,pos+1));
					pos=s.indexOf(c,pos)+1;
				}				
	}
}
