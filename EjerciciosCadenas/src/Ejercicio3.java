public class Ejercicio3 {
	public static void main(String[] args) {
		System.out.println("Introduce la primera cadena de texto");
		String s1=new String();
		s1=LeerTeclado.readString();
		System.out.println("Introduce ahora la segunda cadena de texto");
		String s2=new String();
		s2=LeerTeclado.readString();
		comparar(s1, s2);
		
	}
	public static void comparar (String s, String g){
		if (s.length()==g.length()){
			if (s.equalsIgnoreCase(g)==true){
				System.out.println("Ambas cadenas de texto son iguales");
			}
		}else if (s.length()>g.length()) {
			if (s.indexOf(g)==0)
			System.out.println("La segunda cadena está contenida en la primera");
			else System.out.println("La segunda cadena no está contenida en la primera");
		}else if (g.length()>s.length()){
			if (g.indexOf(s)==0)
				System.out.println("La primera cadena está contenida en la segunda");
				else System.out.println("La primera cadena no está contenida en la segunda");
		}
	}
}
