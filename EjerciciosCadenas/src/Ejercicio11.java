public class Ejercicio11 {
	public static void main(String[] args) {
		System.out.println("Introduzca una cadena e n�meros");
		String s = new String();
		s=LeerTeclado.readString();
		StringBuffer buf1;
		buf1= new StringBuffer(s);
		
		System.out.println("Esta es la cadena de n�meros separada por puntos ");
		
		puntos(buf1);
		System.out.println(buf1.toString());
	}
	public static void puntos (StringBuffer f){
		int pos=f.length();
		System.out.println("�Cada cuento quiere que se separen los car�cteres?");
		int sep=LeerTeclado.readInteger();
		pos=pos-sep;
		System.out.println("�Cu�l quiere que sea el car�cter separador?");
		String csep=LeerTeclado.readString();
		while (pos>0 ){
			f.insert(pos, csep);
			pos=pos-sep;
		}
	}
}
