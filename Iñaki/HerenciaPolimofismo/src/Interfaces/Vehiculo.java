package Interfaces;

public interface Vehiculo {

	int factura();
	boolean hayPlaza(Parking p);
	void aparca(Parking p);
	void setTiempo(int tiempo,Parking p);
}
