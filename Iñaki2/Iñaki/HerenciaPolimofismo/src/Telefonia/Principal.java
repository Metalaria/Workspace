package Telefonia;

import java.util.Vector;

public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Centralita a1=new Centralita();
		int opcion;
		int continuar;
		do{
			System.out.println("Introduce Numero de opcion");
			System.out.println(menu());
			opcion=LeerTeclado.readInteger();
			switch(opcion){
				case 1:a1.nuevaLlamada();
				break;
				case 2:a1.visualizar();
				break;
				default:System.out.println("El numero de opcion no es correcto");
			}
			System.out.println("Desea Continuar: SI:1   NO:0");
			continuar=LeerTeclado.readInteger();
		}while(continuar==1);
		
	}
	
	public static String menu(){
		String salida;
		salida="-----MENU-----\n";
		salida+="1) Nueva Llamada\n";
		salida+="2) Visuelizar Informe\n";
		return salida;
	}

}
