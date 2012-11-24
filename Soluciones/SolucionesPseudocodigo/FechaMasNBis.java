
public class FechaMasNBis {

	public static void main(String[] args) {
		int dia, mes, anno, n,  diasMes=0, nuevoDia, nuevoMes, nuevoAnno;
		
		do {
			System.out.println ("introduce dia entre 1 y 31");
			dia=LeerTeclado.readInteger();
		}
		while (dia<1 || dia>31);
		
		
		do {
			System.out.println ("introduce mes entre 1 y 12");
			mes=LeerTeclado.readInteger();
		}
		while (mes<1 || mes>12);
		
		System.out.println ("introduce año");
		anno=LeerTeclado.readInteger();
		
		do {
			System.out.println ("introduce los días a sumar");
			n=LeerTeclado.readInteger();
		}
		while (n<0);
		
		
		switch (mes){
		case 1: case 3: case 5: case 7: case 8: case 10: case 12: 
			diasMes=31;
			break; 
		case 4: case 6: case 9: 
			diasMes=30;
			break;
		case 2: {
			if ((anno%4==0) && ((anno%100!=0) || (anno%400==0))){
				System.out.println (anno+ " es bisiesto");
				diasMes=29;
			}
				
			else {
				System.out.println (anno+ "  no es bisiesto");
				diasMes=28;
			}
				
			break;
		}
		}
		
		nuevoDia=dia+n;
		nuevoMes=mes;
		nuevoAnno=anno;
		
		if (nuevoDia>diasMes){
			nuevoDia-=diasMes;
			nuevoMes++;
			if (nuevoMes>12){
				nuevoMes=1;
				nuevoAnno++;
			}
		}
		
		System.out.println ("la nueva fecha es: "+nuevoDia+"/"+nuevoMes+"/"+nuevoAnno);
		

	}

}
