package ejerciciosCadenas;

public class DosCadenas {
	
	public static void main(String[] args){
		String cadena1, cadena2;
		System.out.println("Introduce la cadena 1");
		cadena1=LeerTeclado.readString();
		System.out.println("Introduce la cadena 2");
		cadena2=LeerTeclado.readString();
		contenida(cadena1,cadena2);
		//otra forma
		contenida2(cadena1,cadena2);
	}
	
	public static void contenida (String cad1,String cad2){
		if (cad1.length()==cad2.length())
			if (cad1.equalsIgnoreCase(cad2))
				System.out.println("Las cadenas son iguales");
			else 
				System.out.println("Las cadenas son de la misma longitud pero no son iguales");
		else
			if (cad1.length()>cad2.length())
				if (cad1.indexOf(cad2)!=-1)
					System.out.println("La cadena 2 es menor y está contenida en la cadena 1");
				else 
					System.out.println("La cadena 2 es menor y no está contenida en la cadena 1");
			else 
				if (cad2.indexOf(cad1)!=-1)
					System.out.println("La cadena 1 es menor y está contenida en la cadena 2");
				else 
					System.out.println("La cadena 1 es menor y no está contenida en la cadena 2");
	}
	
	public static void contenida2 (String cad1,String cad2){ //Otra forma intercambiando las cadenas 
		if (cad1.length()==cad2.length())
			if (cad1.equalsIgnoreCase(cad2))
				System.out.println("Las cadenas son iguales");
			else 
				System.out.println("Las cadenas son de la misma longitud pero no son iguales");
		else {
			if (cad1.length()<cad2.length()){
				String cadAux;
				cadAux=cad1;
				cad1=cad2;
				cad2=cadAux;
			}
			if (cad1.indexOf(cad2)!=-1)
				System.out.println("Las cadena son de distinta longitud y una cadena está contenida en la otra");
			else 
				System.out.println("Las cadena son de distinta longitud y ninguna de las dos está contenida en la otra");
			
			
		}
			
		
	}
	
	}



