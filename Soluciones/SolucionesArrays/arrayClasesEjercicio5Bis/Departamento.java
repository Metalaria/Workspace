package arrayClasesEjercicio5Bis;

public class Departamento {
	
	private int codigoDpto;
	private String nombre;
	private int numeroEmp;
	private Empleado[] arrayEmp;
	private static int contador=0; //variable estática que guarda cuántos dptos se han introducido
	
	public Departamento (String nombre, int numeroEmp) {
		contador++;
		this.codigoDpto = contador; // el código de dpto toma el valor de contador
		this.nombre = nombre;
		this.numeroEmp = numeroEmp;
		arrayEmp=new Empleado[numeroEmp];
		
	}

	public int getCodigoDpto() {
		return codigoDpto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumeroEmp() {
		return numeroEmp;
	}

	public int contadorEmpleados (){
		int cont=0;
		for (int i=0; i<arrayEmp.length; i++){
			if (arrayEmp[i]!=null)
				cont++;
		}
		return cont;
	}
	
	public Empleado[] getArrayEmp() {
		return arrayEmp;
	}
	
	public Empleado buscarEmp (String nbEmp){
		boolean encontrado=false;
		Empleado empl=null;
		for (int i=0; i<arrayEmp.length && !encontrado; i++){
			if (arrayEmp[i]!=null && arrayEmp[i].getNombre().compareTo(nbEmp)==0){
				encontrado=true;
				empl=arrayEmp[i];
			}
		}
		return empl;
	}
	
	public Empleado buscarCodEmp (int codEmp){
		return arrayEmp[codEmp-1];
	}

	public void asignarEmp (Empleado emp){
		
		int i=emp.getCodigoEmp()-1;

		arrayEmp[i]=emp;
		System.out.println("Se ha dado da alta el empleado en el dpto"+emp.toString());
		}
	
	public void visualizarEmp (){
		
		System.out.println("Datos de los empleados");
		for (int i=0; i<arrayEmp.length;i++){
			if (arrayEmp[i]!=null)
				System.out.println(arrayEmp[i].toString());
		}
	}
	
	public Empleado mayorSueldoDpto(){
		Empleado empMax=null;
		double max=0;
		for (int i=0;i<arrayEmp.length; i++){
			if (arrayEmp[i]!=null)
				if (arrayEmp[i].getSueldo()>max){
					max=arrayEmp[i].getSueldo();
					empMax=arrayEmp[i];
				}
		}
		return empMax;
	}

	@Override
	public String toString() {
		return "[codigoDpto=" + codigoDpto + ", nombre=" + nombre
				+ ", numero de empleados=" + numeroEmp + "]";
	}
	
	
	
	
	
	

}
