public abstract class Personal implements Calculable {
	
	public Personal() {
		// TODO Auto-generated constructor stub
	}


	// Método que evalúa si el empleado es un ejecutivo o no
	public boolean esEjecutivo(){
		System.out.println("¿El empleado es un ejecutivo?(s/n)");
		String resp=LeerTeclado.readString();
		if (resp.equalsIgnoreCase(resp)==true)
			return true;
		else return false;
	}
	
	public abstract  double calcularSueldo();


	public boolean evaluar(Calculable cal) {
		// TODO Auto-generated method stub
		return false;
	}


	public void aumentar(int cantidad) {
		// TODO Auto-generated method stub
		
	}
}


