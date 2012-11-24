package arrayParte2;

import arrayParte1.LeerTeclado;

public class Banco {
	
	private String nombre;
	private int tamanno;
	private Cuenta[] arrayCuentas;
	private int posicion;
	
	public Banco (String nombre, int tamanno){
		this.nombre=nombre;
		this.tamanno=tamanno;
		arrayCuentas=new Cuenta[tamanno];
		posicion=0;
	}

	public String getNombre() {
		return nombre;
	}

	public int getTamanno() {
		return tamanno;
	}
	
	public int getPosicion() {
		return posicion;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void insertar (){
		if (posicion>=tamanno)
			System.out.println("No hay espacio libre para insertar más cuentas");
		else
		{
			System.out.println("Introduce nº de cuenta, nombre del cliente y saldo");
			String numCuenta=LeerTeclado.readString();
			String nombre=LeerTeclado.readString();
			double saldo=LeerTeclado.readDouble();
			arrayCuentas[posicion]=new Cuenta (numCuenta, nombre, saldo);
			posicion++;
		}
	}
	
	public void ingreso(){
		if(posicion==0)
			System.out.println("Aún no hay cuentas en el banco");
		else {
			System.out.println("Introduce nº de cuenta ");
			String numero=LeerTeclado.readString();
			
			boolean enc=false;
			Cuenta cuenta=null;
			for (int i=0; i<arrayCuentas.length; i++){
				if (arrayCuentas[i]!=null && arrayCuentas[i].getNumCuenta().equals(numero)){
					enc=true;
					cuenta=arrayCuentas[i];
					break;
				}
					
			}
			if (!enc)
				System.out.println("No existe una cuenta con ese numero");
			else {
				System.out.println("La cuenta buscada es "+cuenta.toString());
				System.out.println("Introduce la cantidad a ingresar");
				double cantidad=LeerTeclado.readDouble();
				cuenta.ingreso(cantidad);
				System.out.println("Datos de la cuenta despues del ingreso "+cuenta.toString());
			}	
		}
			
	}
	
	public void cuentaMayor(){
		if(posicion==0)
			System.out.println("Aún no hay cuentas en el banco");
		else {
			double max=0;
			Cuenta cuenta=null;
			for (int i=0; i<arrayCuentas.length; i++)
				if (arrayCuentas[i]!=null && arrayCuentas[i].getSaldo()>max){
					max=arrayCuentas[i].getSaldo();
					cuenta=arrayCuentas[i];
				}
			System.out.println("La cuenta con mayor saldo es "+cuenta.toString());
		}
		
	}
	

}
