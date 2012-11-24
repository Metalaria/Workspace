package Ejercicio2;

public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Vivienda viv1=new Vivienda ();
		Chalet ch1=new Chalet();
		Chalet ch2=new Chalet();
		Palacio pal1=new Palacio();
		
		System.out.println("¿Cuál es el tamaño de la vivienda?");
		viv1.setMetrosCuadrados(LeerTeclado.readDouble());
		System.out.println("Introduzca el número de la vivienda");
		viv1.setNumero(LeerTeclado.readInteger());
		System.out.println("¿Cuál es la dirección de la vivienda?");
		viv1.setCalle(LeerTeclado.readString());
		
		Vivienda array []=new Vivienda [4];
			array[0]=viv1;
			array[1]=ch1;
			array[2]=ch2;
			array[3]=pal1;
			
		verArray(array);	
			
	}
	public static void verArray (Vivienda m[]){
		int i=0;
		for (i=0; i<m.length; i++){
							System.out.print(" "+m[i].toString());
			}
			System.out.println(" ");
		}
	

}
