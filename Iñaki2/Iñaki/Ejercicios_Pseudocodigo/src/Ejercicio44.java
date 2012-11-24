import Ejercicio1.LeerTeclado;


public class Ejercicio44 {
	public static void main(String[] args) {
		/*44. Algoritmo que lea una fecha en formato día, mes, año y obtiene el número
		 * de orden del día en el total del año (Ejemplo: si se lee 01 03 2005,
		 * se obtiene 61º de 2005)
		 * 
		a) Considerando todos los meses de 30 días
		b) Considerando en cada mes los días que tiene*/
		
		int orden;
		int cont=1;
		System.out.println("Introduce dia: ");
		int dia=LeerTeclado.readInteger();
		System.out.println("Introduce mes: ");
		int mes=LeerTeclado.readInteger();
		System.out.println("Introduce año completo: ");
		int anio=LeerTeclado.readInteger();
		
		System.out.println("1.- Considerando todos los meses de 30 días  2.- Considerando en cada mes los días que tiene ");
		int opc=LeerTeclado.readInteger();
		
			switch (opc){
		
			case 1: 
				orden=((mes-1)*30)+dia;
				System.out.println(orden+" del año "+anio);	
	     		break;
	     		
			case 2: 
				int maxdias=0,total=0;
				
				while (cont<mes)
				{
					if (cont==2)
					{
						if ((anio%4==0) && ((anio%100!=0) || (anio%400==0)))
						{
							maxdias=29;
							orden=dia*maxdias;
						}
						else
						{					
							maxdias=28;
							orden=dia*maxdias;
						}
					}
					else 
						if (cont==1 || cont==3 || cont==5 || cont==7 || cont==8 || cont==10 || cont==12)
						{	
							maxdias=31;
							orden=dia*maxdias;
						}
						else
						{
							maxdias=30;
							orden=dia*maxdias;
						}
					
					total=total+orden;
					cont++;
				}
				
				total=total+dia;
				System.out.println(total+" del año "+anio);	
	 			break;
			
			default: System.out.println("Opción incorrecta");
		}
	}
}