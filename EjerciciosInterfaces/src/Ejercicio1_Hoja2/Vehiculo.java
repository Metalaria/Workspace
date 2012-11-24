package Ejercicio1_Hoja2;
public interface Vehiculo {
	int factura(); // proporciona el importe a pagar por estacionar un Vehículo durante determinado tiempo en un parking.
	boolean  hayPlaza( Parking p); // recibe como argumento una referencia a un objeto Parking y determina si hay sitio en dicho parking para estacionar un Vehículo.
	void aparca (Parking p); // recibe como argumento una referencia a un objeto Parking y estaciona un Vehículo en dicho parking
	void  setTiempo(int tiempo, Parking p); // establece ese entero como tiempo de estancia del vehículo en el parking.
	
}
