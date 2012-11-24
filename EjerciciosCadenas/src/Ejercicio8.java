public class Ejercicio8 {
	public static void main (String[] args){
		System.out.println("Introduce una cadena de texto");
		String s=new String ();
		s=LeerTeclado.readString();
		StringBuffer buf1= new StringBuffer (s);
		
		System.out.println("Esta es la cadena sin vocales ");
		vocales(buf1);
		
	}
	public static void vocales (StringBuffer cadena){
		String cadenaNueva="";
		for(int i=0;i<cadena.length();i++){

			if(cadena.charAt(i)!='a' && cadena.charAt(i)!='e' && cadena.charAt(i)!='i' &&
			cadena.charAt(i)!='o' && cadena.charAt(i)!='u'){

				cadenaNueva+=cadena.charAt(i);
				}
			}
		System.out.println(cadenaNueva);
	}
}

