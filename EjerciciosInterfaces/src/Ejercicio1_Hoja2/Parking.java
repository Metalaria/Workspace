package Ejercicio1_Hoja2;
import java.util.*;
public class Parking {
	private String nombre;
	private int plazasTotales;
	private int plazasOcupadas;
	private int plazasAbonados;
	private int plazasHotel;
	
	Vector <Vehiculo> plazasVehiculos;

	// Constructor
	
	public Parking(String nombre, int plazasTotales) {
		super();
		this.nombre = nombre;
		this.plazasTotales = plazasTotales;
	}
	// Métodos get y set
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPlazasTotales() {
		return plazasTotales;
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


	public int getPlazasHotel() {
		return plazasHotel;
	}

	public void setPlazasHotel(int num) {
		if (num<plazasTotales){
			plazasHotel=num;
		}
	}
	
	public  Vector<Vehiculo> getVehiculo(int m){
		int plazasAux2=plazasTotales-plazasAbonados;
		if (m<plazasTotales){
			return plazasVehiculos;
		}else return null;
	}
	public void setPlazasAbonados (int n){
		int plazasAux=plazasTotales-plazasHotel;
		if (n<plazasAux){
			plazasAbonados=n;
		}else System.out.println("No hay tantas plazas disponibles");
	}
	
	public int numAbonados(){
		return numAbonados();
	}
	
}
