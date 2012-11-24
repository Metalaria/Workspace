public class Ejercicio1 {
	public static void main(String[] args) {
		System.out.println("Introduzca una cadena de texto");
		String s=LeerTeclado.readString();
		StringBuffer buf1= new StringBuffer (s);
		remplazar(buf1);
		
		
	}
	public static void remplazar(StringBuffer b){
		int pos=0;
		System.out.println("Introduzca ahora un número entero");
		int n=LeerTeclado.readInteger();
		while (n>b.length()){
			System.out.println("El número introducido es mayor que la longitud de la cadena, " +
					"vuelva a introducirlo");
			n=LeerTeclado.readInteger();
		}
		char car;
		String cadena2 = "", cadenaFinal="";
		do {
			
			
			car=b.charAt(pos);
				 cadenaFinal=cadenaFinal.concat(cadena2);
				 cadena2=String.valueOf("*");
				pos++;
			System.out.print(cadena2);
		}while (pos<=n);
		;
	}
}
