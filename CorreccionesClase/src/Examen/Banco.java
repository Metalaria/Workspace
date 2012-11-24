package Examen;
public class Banco {
	private String nombre;
	private int tamanno;
	private Cuenta[] arrayCuentas;
	private int cantidadCuentas; // no es estático porque sino todos los bancos compartirían el mismo número de cuentas. Indica la posición del array que va a ocupar
	
	public Banco (String nombre, int tamanno){
		this.nombre=nombre;
		this.tamanno=tamanno;
		arrayCuentas=new Cuenta[tamanno];
		cantidadCuentas=0;
	}

	public String getNombre() {
		return nombre;
	}

	public int getTamanno() {
		return tamanno;
	}
	
	public int getcantidadCuentas() {
		return cantidadCuentas;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void insertar (){
		if (cantidadCuentas>=tamanno)
			System.out.println("No hay espacio libre para insertar más cuentas");
		else
		{
			System.out.println("Introduce nº de cuenta, nombre del cliente y saldo");
			String numCuenta=LeerTeclado.readString();
			String nombre=LeerTeclado.readString();
			double saldo=LeerTeclado.readDouble();
			arrayCuentas[cantidadCuentas]=new Cuenta (numCuenta, nombre, saldo);
			cantidadCuentas++;
		}
	}
	
	public void ingreso(){
		if(cantidadCuentas==0)
			System.out.println("Aún no hay cuentas en el banco");
		else {
			System.out.println("Introduce nº de cuenta ");
			String numero=LeerTeclado.readString();
			Cuenta cuentaAux= buscarCuenta(numero);
			if (cuentaAux==null){
				System.out.println("La cuenta no existe");
			}
			else {	
			System.out.println("La cuenta buscada es "+cuentaAux.toString());
			System.out.println("Introduce la cantidad a ingresar");
			double cantidad=LeerTeclado.readDouble();
			cuentaAux.ingreso(cantidad); //LLama al ingreso de la clase cuentas porque aquí se trabaja con un objeto de tipo Cuenta y no de tipo Banco
			System.out.println("Datos de la cuenta despues del ingreso "+cuentaAux.toString());
			}	
		}	
	}
	
	public void cuentaMayor(){
		if(cantidadCuentas==0)
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
	
	public Cuenta buscarCuenta (String numeroCuenta){
		// boolean enc=false;
		Cuenta cuenta=null;
		if (cantidadCuentas==0){
			System.out.println("No hay cuentas en el banco");
		}
		else{
		for (int i=0; i<cantidadCuentas; i++){
			if (arrayCuentas[i].getNumCuenta().equals(numeroCuenta)){
				// enc=true;
				cuenta=arrayCuentas[i];
				break;
			}
		}	
		}
		return cuenta;
	}
}
