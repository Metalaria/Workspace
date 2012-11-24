package arrays;

public class DiferenciaFechas10Bis {

	public static void main(String[] args) {
		
		String[] meses= {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
		int[] dias={31,28,31,30,31,30,31,31,30,31,30,31};
		
		System.out.println("Introduce el primer día");
		int dia1=LeerTeclado.readInteger();
		
		System.out.println("Introduce el primer mes");
		int mes1=LeerTeclado.readInteger();
		
		System.out.println("Introduce el primer año");
		int anno1=LeerTeclado.readInteger();
		
		
		System.out.println("Introduce el segundo día");
		int dia2=LeerTeclado.readInteger();
		
		System.out.println("Introduce el segundo mes");
		int mes2=LeerTeclado.readInteger();
		
		System.out.println("Introduce el segundo año");
		int anno2=LeerTeclado.readInteger();
		
		
		while((mes1<mes2) || dia1 <= dia2 || anno1<anno2){
			
			if (bisiesto(anno1))
				dias[1]=29; //si el año1 es bisiesto o al avanzar el año encuentra un bisiesto
			else 
				dias[1]=28;
			
			if(dia1>dias[mes1-1]){
				mes1++;
				dia1=1;
			}
			if(mes1>12){
				mes1=1;
				anno1++;
			}
			System.out.println("Dia " + dia1 + " " + meses[mes1-1]+" de " +anno1);
			dia1++;
		}
	}
	
	public static boolean  bisiesto (int anno){
	if ((anno%4==0) && ((anno%100!=0) || (anno%400==0)))
		return true;
	else
		return false;

	}
}
