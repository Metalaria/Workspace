package Ejercicio2;
public class TestVivienda {
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
		
		System.out.println("Introdoce ahora los datos del primer chalet");
		System.out.println("Calle:");
		ch1.setCalle(LeerTeclado.readString());
		System.out.println("Numero:");
		ch1.setNumero(LeerTeclado.readInteger());

		System.out.println("Introdoce ahora los datos del segundo chalet");
		ch2.setCalle(LeerTeclado.readString());
		System.out.println("Numero:");
		ch2.setNumero(LeerTeclado.readInteger());
		
		System.out.println("Ahora es el turno del palacio");
		System.out.println("Calle:");
		pal1.setCalle(LeerTeclado.readString());
		System.out.println("Numero:");
		pal1.setNumero(LeerTeclado.readInteger());
		System.out.println("Metros cuadrados");
		pal1.setMetrosCuadrados(LeerTeclado.readDouble());
		System.out.println("Número de habitaciones:");
		pal1.setNumHabitaciones(LeerTeclado.readInteger());
		
		Vivienda array []=new Vivienda [4];
			array[0]=viv1;
			array[1]=ch1;
			array[2]=ch2;
			array[3]=pal1;
			
		verArray(array);
			
	}
	public static void verArray (Vivienda m[]){
		int i=0;
		int contCh=0;
		for (i=0; i<m.length; i++){
				System.out.print(""+m[i].toString());
				 if (m[i] instanceof Chalet){
					 contCh++;
				 }
			}
			System.out.print(" ");
			System.out.print("El número de chalets es: "+contCh);
	}
}
