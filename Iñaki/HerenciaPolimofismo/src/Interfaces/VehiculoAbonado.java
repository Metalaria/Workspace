package Interfaces;

public class VehiculoAbonado implements Vehiculo {
	
	private String id;
	private int tiempo;
	
	public VehiculoAbonado(String id, int tiempo){
		this.id=id;
		this.tiempo=tiempo;
	}
	public int factura(){
		int coste;
		coste=tiempo*200;
		return coste;
	}
	public boolean hayPlaza(Parking p){
		if(p.getPlazasAbonados()>0){
			return true;			
		}
		else return false;
	}
	
	public void aparca(Parking p){
		if(hayPlaza(p)==true){
			p.setPlazasOcupadas(p.getPlazasOcupadas()+1);
			p.setPlazasAbonados(p.getPlazasAbonados()-1);
			p.colocar(this);
		}
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getTiempo() {
		return tiempo;
	}
	public void setTiempo(int tiempo,Parking p) {
		this.tiempo = tiempo;
	}
	public String toString(){
		String salida;
		salida="Vehiculo Abonado\n";
		salida+="ID: "+id+"\n";
		salida+="Tiempo: "+tiempo+" meses\n";
		salida+="Factura: "+factura()+"€\n";
		return salida;
	}

}
