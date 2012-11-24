package Vehiculos;

public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vehiculo moto=new Vehiculo("Subaru","1534-AE",2,123);
		Coche coche01=new Coche("Ferrary","6384-DKE",502,"Negro",2,true);
		Camion camion01=new Camion("Merzedes","3749-SQK",10,735,1000,500,"Paco");
		Camion camion02=new Camion("Merzedes","4892-OSW",12,822,1200,235,"Rojelio");
		
		//Visualizar datos
		System.out.println(moto.listar());
		System.out.println(coche01.listar());
		System.out.println(camion01.listar());
		System.out.println(camion02.listar());
		
		
		//Modificar datos
		System.out.println("");
		System.out.println("El coche sera pintado de rojo");
		coche01.pintar("rojo");
		System.out.println("Cargar 30 Kg al camión 1.");
		camion01.cargar(30);
		System.out.println("Descargar 20 Kg del camión 2.");
		camion02.descargar(20);
		System.out.println("Descargar 200Kg del camión 1 y cargarlo en el camión 2.");
		camion01.descargar(200);
		camion02.cargar(200);
		System.out.println("Cambiar de conductor al camión 2.");
		camion02.cambiarConductor("Carlos");
		System.out.println("");
		
		
		//Visualizar datos
		System.out.println(moto.listar());
		System.out.println(coche01.listar());
		System.out.println(camion01.listar());
		System.out.println(camion02.listar());
		
		
		//Crear Empresa
		Empresa pepeCar=new Empresa("Pepe Car",4);
		//Comprar el vehiculo 1, el coche 1 y el camion 1
		pepeCar.comprar(moto);
		pepeCar.comprar(coche01);
		pepeCar.comprar(camion01);
		//Visualizar Flota
		pepeCar.visualizarFlota();
		//Vender vehiculos
		pepeCar.venderVehiculo("3749-SQK");
		pepeCar.venderVehiculo("4892-OSW");
		//Comprar Camion 2
		pepeCar.comprar(camion02);
		//Visualizar Flota
		pepeCar.visualizarFlota();
	}
	
	

}
