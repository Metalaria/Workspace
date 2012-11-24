package arrayParte2;

public class Cuenta {
	
	private String numCuenta;
	private String cliente;
	private double saldo;
	
	public Cuenta(String numCuenta, String cliente, double saldo) {	
		
		this.numCuenta = numCuenta;
		this.cliente = cliente;
		this.saldo = saldo;
	}
	
	public String getNumCuenta() {
		return numCuenta;
	}

	public void setNumCuenta(String numCuenta) {
		this.numCuenta = numCuenta;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void ingreso (double cantidad){
		saldo+=cantidad;
	}
	
	public void reintegro (double cantidad){
		if (saldo<cantidad)
			System.out.println("No hay saldo suficiente para el reintegro. El saldo actual es "+saldo);
		else
			saldo-=cantidad;
	}

	public String toString() {
		return "Cuenta [numCuenta=" + numCuenta + ", cliente=" + cliente
				+ ", saldo=" + saldo + "]";
	}
	
	

	
	
}

