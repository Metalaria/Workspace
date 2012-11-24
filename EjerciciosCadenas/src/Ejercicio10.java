public class Ejercicio10 {
	public static void main(String[] args) {
		System.out.println("Introduzca una cadena e números");
		String s = new String();
		s=LeerTeclado.readString();
		StringBuffer buf1;
		buf1= new StringBuffer(s);
		
		System.out.println("Esta es la cadena de números separada por puntos ");
		
		puntos(buf1);
		System.out.println(buf1.toString());
	}
	public static void puntos (StringBuffer f){
		int pos=f.length();
		pos=pos-3;
		while (pos>0 ){
			f.insert(pos, '.');
			pos=pos-3;
		}
	}
}
