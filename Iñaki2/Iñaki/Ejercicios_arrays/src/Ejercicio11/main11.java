package Ejercicio11;

public class main11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Declarar Meses
		String meses[]={"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Nobiembre","Diciembre"};
		int diasMeses[]={31,28,31,30,31,30,31,31,30,31,30,31};
		
		//Preguntar dias
		System.out.println("Introduca dia y mes en formato: dd-mm");
		System.out.println("Inroduca dia");
		int dia1=LeerTeclado.readInteger();
		System.out.println("Inroduca mes");
		int mes1=LeerTeclado.readInteger();
		System.out.println("Introduca dia y mes en formato: dd-mm");
		System.out.println("Inroduca dia");
		int dia2=LeerTeclado.readInteger();
		System.out.println("Inroduca mes");
		int mes2=LeerTeclado.readInteger();
		
		//mostrar dias
		
		cuentaDias(dia1,mes1,dia2,mes2,diasMeses,meses);
	}




	public static void cuentaDias(int dia1,int mes1,int dia2,int mes2,int diasMeses[],String meses[]){
		int i;
		int j;
			for(j=mes1;j<mes2;j++){
				
				for(i=dia1;i<=diasMeses[j-1];i++){
					System.out.println(i+" de "+meses[j-1]);
				}
			dia1=1;
			}
			for(i=1;i<=dia2;i++){
				System.out.println(i+" de "+meses[j-1]);
			}
	}
}
