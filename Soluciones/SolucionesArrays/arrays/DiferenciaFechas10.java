package arrays;

public class DiferenciaFechas10 {
	public static void main(String[]args){
		int i,j;
		
		System.out.println("Introduce el dia 1");
		int dia1=LeerTeclado.readInteger();
		System.out.println("Introduce el mes 1");
		int mes1=LeerTeclado.readInteger();
		System.out.println("Introduce el dia 2");
		int dia2=LeerTeclado.readInteger();
		System.out.println("Introduce el mes 2");
		int mes2=LeerTeclado.readInteger();
		
		String[]mes={"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
		int[] diasmes = {31,28,31,30,31,30,31,31,30,31,30,31};
		if(mes2==mes1)
			for(i=dia1;i<=dia2;i++)//Si los meses son iguales solo  visualiza desde el dia1 al dia2
				System.out.println(i+" de "+mes[mes1-1]);
		
		else	if (mes1>mes2)
			System.out.println("El 2º mes no puede ser menor que el 1º");
			
			else {
				for(i=dia1;i<=diasmes[mes1-1];i++)//Va desde el dia1 hasta final del mes1.
					System.out.println(i+" de "+mes[mes1-1]);
				for(j=mes1+1;j<=mes2-1;j++)//Recorre todos los meses comprendidos entre mes1 y mes2.
					for(i=1;i<=diasmes[j-1];i++)
						System.out.println(i+" de "+mes[j-1]);
				for(i=1;i<=dia2;i++)//Va desde el 1 hasta el dia2 del mes2.
					System.out.println(i+" de "+mes[mes2-1]);
			}
			
			
	}
}
