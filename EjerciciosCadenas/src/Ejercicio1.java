public class Ejercicio1 {
	public static void main(String[] args) {
		System.out.println("Introduce una cadena de texto");
		String s=new String();
		s=LeerTeclado.readString();
		System.out.println("La longitud de la cadena es: "+s.length());
		System.out.println("El caracter intermedio de la cadena es: "+s.charAt(s.length()/2));
		System.out.println("La parte izquierda de la cadena es: "+s.substring(0, s.length()/2));
		System.out.println("La parte derecha de la cadena es: "+s.substring(s.length()/2, s.length()));
	}
}
