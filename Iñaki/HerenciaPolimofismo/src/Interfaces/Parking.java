package Interfaces;

import java.util.Vector;

public class Parking {

	private String nombre;
	private int plazasTotal;
	private int plazasOcupadas;
	private int plazasAbonados;
	private int plazasHotel;
	private Vector <Vehiculo> plazasVehiculos;
	
	public Parking(String nombre, int plazasTotal){
		this.nombre=nombre;
		this.plazasTotal=plazasTotal;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPlazasTotal() {
		return plazasTotal;
	}

	public void setPlazasTotal(int plazasTotal) {
		this.plazasTotal = plazasTotal;
	}

	public int getPlazasOcupadas() {
		return plazasOcupadas;
	}

	public void setPlazasOcupadas(int plazasOcupadas) {
		this.plazasOcupadas = plazasOcupadas;
	}

	public int getPlazasAbonados() {
		return plazasAbonados;
	}

	public void setPlazasAbonados(int plazasA) {
		int plazas=plazasTotal-plazasHotel;
		if(plazas>=plazasHotel) plazasAbonados = plazasA;
		else System.out.println("No se pueden introducir tantas plazas de Abonados");
	}

	public int getPlazasHotel() {
		return plazasHotel;
	}

	public void setPlazasHotel(int plazasH) {
		int plazas=plazasHotel-plazasAbonados;
		if(plazas>=plazasAbonados) plazasHotel = plazasH;
		else System.out.println("No se pueden introducir tantas plazas para el Hotel");
	}
	public void colocar(Vehiculo veh){
		plazasVehiculos.add(veh);
	}
	
	public String toString(){
		String salida;
		salida="Nombre"+nombre+"\n";
		salida+="Numero plazas totales"+plazasTotal+"\n";
		salida+="Numero plazas ocupadas"+plazasOcupadas+"\n";
		salida+="Numero plazas totales"+plazasAbonados+"\n";
		salida+="Numero plazas totales"+plazasHotel+"\n";
		for(int i=0;i<plazasVehiculos.size();i++){
			salida+=plazasVehiculos.elementAt(i).toString();
		}
		return salida;
	}
	
	
}
