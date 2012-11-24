package Vehiculos;

public class Empresa {
	
	private String nombreEmpresa;
	private int tamañoFota;
	private Vehiculo flota[];
	private int numeroVehiculos;
	
	
	public Empresa (String nombreEmpresa,int tamañoFlota){
		this.nombreEmpresa=nombreEmpresa;
		this.tamañoFota=tamañoFlota;
		flota=new Vehiculo [tamañoFlota];
		numeroVehiculos=0;
	}
	
	public void buscarVehiculo(String matricula){
		String buscaMatricula;
		boolean encontrado=false;
		for(int i=0;i<flota.length;i++){
			buscaMatricula=flota[i].getMatricula();
			if(buscaMatricula.compareTo(matricula)==0){
				encontrado=true;
				System.out.println(flota[i].listar());
			}
		}
		if(encontrado==false){
			System.out.println("Dicho vehiculo no existe.");
		}
	} 
	
	public void comprar(Vehiculo vehiculocompra){
		if(numeroVehiculos<tamañoFota){
			flota[numeroVehiculos]=vehiculocompra;
			numeroVehiculos++;
		}
		else System.out.println("La flota esta completa.");
	}
	
	public void venderVehiculo(String matricula){
		String buscaMatricula;
		int posicion=0;
		boolean encontrado=false;
		for(int i=0;i<numeroVehiculos;i++){
			buscaMatricula=flota[i].getMatricula();
			if(buscaMatricula.compareTo(matricula)==0){
				encontrado=true;
				flota[i]=null;
				posicion=i;
			}
		}
		if(encontrado==true){
			for(int i=posicion;i<numeroVehiculos;i++){
				flota[i]=flota[i+1];
			}
			numeroVehiculos--;
			System.out.println("Vehiculo con matricula "+matricula+" ha sido vendido");
		}
		else{
			System.out.println("Vehiculo con matricula "+matricula+" no existe");
		}
	} 
	
	public void visualizarFlota(){
		System.out.println("");
		System.out.println("Empresa: "+nombreEmpresa);
		for(int i=0;i<numeroVehiculos;i++){
			System.out.println(flota[i].listar());
		}
	}
	

}
