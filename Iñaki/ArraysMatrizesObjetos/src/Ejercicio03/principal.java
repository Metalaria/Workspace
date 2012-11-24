package Ejercicio03;

public class principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*Utilizar la clase Matriz anterior para almacenar en las 
		 * filas los códigos de vendedores (el nº de vendedores se introducirá 
		 * por teclado)  y en las columnas los días trabajados (6 columnas). 
		 * Esta matriz recoge los totales vendidos por cada empleado en los distintos 
		 * días trabajados de la semana. 
		 */
		
		System.out.println("Cuantos empleados quiere introducir:");
		int nEmpleado=LeerTeclado.readInteger();
		Matriz empleados=new Matriz(nEmpleado);
		empleados.introducir(); //Introduce los datos en la matriz
		empleados.visualizar();
		
		
		System.out.println("Introduce el codigo del empleado para ver su máximo de ventas y su total semanal");
		int codEmpleado=LeerTeclado.readInteger();
		System.out.println("El maximo de ventas del empleado "+codEmpleado+" es: "+empleados.maxFila(codEmpleado));
		System.out.println("Su total semanal es: "+empleados.totalFila(codEmpleado));
		
		int dia;
		do{
		System.out.println("Introduce el dia para ver su min de ventas y su vendedor");
		dia=LeerTeclado.readInteger();}
		while(dia<1 && dia>6);
		empleados.minColumna(dia);

		System.out.println("El Total por dias es:");
		for(int i=0;i<6;i++){
			dia=i+1;
			System.out.println("El total del dia "+dia+" es: "+empleados.totalColumna(i));
			dia=0;
		}
		
		System.out.println("El total de ventas es: "+empleados.total());
	}
	

}
