
public class FechaMasN {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int dia, mes, anno, n,  diasMes=0, nuevoDia, nuevoMes, nuevoAnno;
		System.out.println ("introduce dia");
		dia=LeerTeclado.readInteger();
		System.out.println ("introduce mes");
		mes=LeerTeclado.readInteger();
		System.out.println ("introduce año");
		anno=LeerTeclado.readInteger();
		System.out.println ("introduce los días a sumar");
		n=LeerTeclado.readInteger();
		
		switch (mes){
		case 1: case 3: case 5: case 7: case 8: case 10: case 12: 
			diasMes=31;
			break; 
		case 4: case 6: case 9: 
			diasMes=30;
			break;
		case 2: 
			diasMes=28;
			break;
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


