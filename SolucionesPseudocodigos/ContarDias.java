
public class ContarDias {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int dia, mes, anno, total1, total2=0;
		System.out.println ("introduce dia");
		dia=LeerTeclado.readInteger();
		System.out.println ("introduce mes");
		mes=LeerTeclado.readInteger();
		System.out.println ("introduce año");
		anno=LeerTeclado.readInteger();
		total1=(mes-1)*30+dia;//dias transcurridos considerando meses de 30 
		total2=dia; //días transcurridos considerando meses naturales
		switch (mes-1){
			case 11:total2+=30;
			case 10:total2+=31;
			case 9: total2+=30;
			case 8: total2+=31;
			case 7: total2+=31;
			case 6: total2+=30;
			case 5: total2+=31;
			case 4: total2+=30;
			case 3: total2+=31;
			case 2: {if ((anno%4==0) && ((anno%100!=0) || (anno%400==0))){
					total2+=29;System.out.println("El año es bisiesto");
					}					
					else total2+=28;}
			case 1: total2+=31;
			
		}
		
		System.out.println ("si se consideran meses de 30 días han pasado "+total1+" dias");
		System.out.println ("si se consideran meses naturales han pasado "+total2+" dias");

	}

}
