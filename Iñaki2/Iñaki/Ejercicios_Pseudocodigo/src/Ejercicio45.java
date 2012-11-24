import Ejercicio1.LeerTeclado;


public class Ejercicio45 {
	public static void main(String[] args) {
		/*45. Dada una fecha en formato dd mm aaaa calcular cuál será la fecha dentro de n días*/
	
		System.out.println("Introduce dia: ");
		int dia=LeerTeclado.readInteger();
		System.out.println("Introduce mes: ");
		int mes=LeerTeclado.readInteger();
		System.out.println("Introduce año completo: ");
		int anio=LeerTeclado.readInteger();
		
		int orden=0,maxdias=0,cont=1,total=0;
		
		while (cont<mes)
		{
			if (cont==2)
			{
				maxdias=28;
				orden=dia*maxdias;
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
		
		
		//45
		
		System.out.println("Días que pasarán: ");
		int n=LeerTeclado.readInteger();
		
		dia=dia+n;
		
		while (dia>=maxdias)
		{
			dia=dia-maxdias;
			mes=mes+1;
			if (mes==2)
			{
				if ((anio%4==0) && ((anio%100!=0) || (anio%400==0)))
					maxdias=29;
				else
					maxdias=28;
			}
			else 
				if (mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12)
					maxdias=31;
				else
					maxdias=30;
		
			if (mes>12)
				 anio=anio+1;
		}
		
		System.out.println("dia: "+dia+" mes: "+mes+" del año: "+anio);
	}
}