package arraysClases;
import arrays.LeerTeclado;


public class PrincipalVendedores {

	public static void main(String[] args) {
		
		int f,c=6;
		System.out.println("Introduce nº de vendedores");
		f=LeerTeclado.readInteger();
		
		Matriz ventas=new Matriz(f,c);
		System.out.println("Generando las ventas diarias de cada vendedor...");
		ventas.introducir();
		
		int opcion;
		 
		do {
			
			System.out.println("MENU");
			System.out.println("1.- Visualizar las ventas");
			System.out.println("2.- Ventas máximas de un vendedor y total semanal ");
			System.out.println("3.- Ventas mínimas de un día");
			System.out.println("4.- Ventas totales por día");
			System.out.println("5.- Ventas totales");
			System.out.println("6.- Salir");
			do {
				System.out.println("Introduce opcion (1-6)");
				opcion = LeerTeclado.readInteger();
			} while (opcion < 1 || opcion > 6);
		
			switch (opcion){
			case 1:visualizarVentas(ventas) ;break;
			case 2:totalesVendedor(ventas) ;break;
			case 3:minimoDia(ventas);break;
			case 4:totalesDia(ventas) ;break;
			case 5:ventasTotales(ventas);break;
			}	
		}
		while (opcion!=6);
		
	}
	
	public static void visualizarVentas (Matriz ventas){
		
		System.out.println("Las ventas son: ");
		ventas.visualizar();
	}
	
	public static void totalesVendedor(Matriz ventas){
		
		int n;
		int f=ventas.getFilas();
		do {
			System.out.println("Introduce un vendedor (entre 1 y "+f+")");
			n=LeerTeclado.readInteger();
		}
		while (n<0 || n>f);
		
		System.out.println ("Ventas máximas del vendedor "+n+ ": "+ventas.maxFilas(n));
		System.out.println ("Total semanal de ventas del vendedor "+n+": "+ventas.totalFila(n));
	}
	
	public static void minimoDia (Matriz ventas){
		int n;
		int c=ventas.getColumnas();
		
		do {
			System.out.println("Introduce un dia para obtener sus ventas mínimas(entre 1 y "+c+")");
			n=LeerTeclado.readInteger();
		}
		while (n<0 || n>6);
		
		System.out.println("El dia elegido es: "+n);
		ventas.minColumnas(n);
	}
	
	public static void totalesDia (Matriz ventas){
		System.out.println("Total de ventas de cada día de la semana");
		for (int j=1; j<=6; j++){
			System.out.println("Total de ventas del dia "+j+" "+ventas.totalColumna(j));
			
		}
	}
	
	public static void ventasTotales (Matriz ventas){
		
		System.out.println("Las ventas totaldes de la empresa son: "+ventas.totalMatriz());
		
	}

}
