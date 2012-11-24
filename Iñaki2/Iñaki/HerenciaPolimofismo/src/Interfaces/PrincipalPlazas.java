package Interfaces;

public class PrincipalPlazas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parking p= null;
		boolean continuar=true;
		do{
			System.out.println("Introduca opcion del Menu:");
			System.out.println("1: Nuevo Parking");
			System.out.println("2: Aparcar Vehiculo");
			System.out.println("3: Listar Parking");
			System.out.println("4: Salir");
			int menu=LeerTeclado.readInteger();
			
			switch(menu){
			case 1:p=nuevoParking();
			break;
			case 2:aparcar(p);
			break;
			case 3:listarParking(p);
			break;
			case 4:continuar=false;
			default: System.out.println("Opcion invalida de menu");
			}
		}while(continuar==true);
		
		
	}
	public static Parking nuevoParking(){
		System.out.println("Introduce el nombre del Parking.");
		String nombre=LeerTeclado.readString();
		System.out.println("Introduce las plazas totales del parking.");
		int plazas=LeerTeclado.readInteger();
		Parking p =new Parking(nombre,plazas);
		System.out.println("Introduce numero de plazas para el hotel");
		int numero=LeerTeclado.readInteger();
		p.setPlazasHotel(numero);
		System.out.println("Introduce numero de plazas para los Abonados");
		numero=LeerTeclado.readInteger();
		p.setPlazasAbonados(numero);
		return p;
	}
	
	public static void aparcar(Parking p){
		String id;
		int tiempo;
		int opcion;
		
		System.out.println("¿El vehiculo se aparcara en plaza de abonado en la de hotel?");
		System.out.println("1:Abonado");
		System.out.println("2:Hotel");
		opcion=LeerTeclado.readInteger();
		if(opcion==1){
			System.out.println("Introduca ID.");
			id=LeerTeclado.readString();
			System.out.println("Introduca meses de reserva.");
			tiempo=LeerTeclado.readInteger();
			VehiculoAbonado veh=new VehiculoAbonado(id,tiempo);
			veh.aparca(p);
		}
		if(opcion==2){
			System.out.println("Introduca ID.");
			id=LeerTeclado.readString();
			System.out.println("Introduca los dias de reserva.");
			tiempo=LeerTeclado.readInteger();
			VehiculoHotel veh=new VehiculoHotel(id,tiempo);
			veh.aparca(p);
		}	
	}
	public static void listarParking(Parking p){
		System.out.println(p.toString());
	}

}
