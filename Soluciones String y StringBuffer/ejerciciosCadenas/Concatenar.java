package ejerciciosCadenas;

public class Concatenar {

	
	public static void main(String[] args) {
		String cadena1, cadena2, cadena3;
		System.out.println("Introduce la cadena 1");
		cadena1=LeerTeclado.readString();
		System.out.println("Introduce la cadena 2");
		cadena2=LeerTeclado.readString();
		cadena3=concatena (cadena1,cadena2);
		System.out.println("La cadena concatenada es "+ cadena3);

	}
	
	public static String concatena (String cad1, String cad2){
		return cad1.concat(" ").concat(cad2).toUpperCase(); //return (cad1+cad2).toUpperCase();
	}

}
