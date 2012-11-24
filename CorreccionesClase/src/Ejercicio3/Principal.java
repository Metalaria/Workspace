package Ejercicio3;
public class Principal {
		public static void main(String[] args) {
		nuevoCliente();
	}
	public static Cliente nuevoCliente(){
		Cliente cl1= new Cliente();
		
		String resp = "s";
		
		while (cl1.compLleno()==false && resp.contains("s")) {
			if (cl1.compLleno()==false){
				
			cl1.alquilar();
			cl1.rebajarPrecio();
			cl1.factura();
			System.out.println("¿Quiere dar de alta otro alquiler? s/n");
			resp=LeerTeclado.readString();
			if(resp.equalsIgnoreCase("n"))
				cl1.toString();
			}
		}
		return cl1;
	}
}
