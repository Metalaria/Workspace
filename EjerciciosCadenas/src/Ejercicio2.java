public class Ejercicio2 {
	public static void main(String[] args) {
		System.out.println("Introduce la primera cadena de texto");
		String s1=new String();
		s1=LeerTeclado.readString();
		System.out.println("Introduzca ahora la segunda cadena de texto");
		String s2=new String();
		s2=LeerTeclado.readString();
		String concatenado =new String();
		concatenar(s1,s2);
	}
	public static void concatenar(String s, String g){
		System.out.println(s.concat(g).toUpperCase());
	}
}
