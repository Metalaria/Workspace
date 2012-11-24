import java.util.List;
import java.util.Vector;


public class Empresa {
	protected String nombre;
	Personal listaPersonal [] = new Personal [20];
	Vector <Calculable> listaCalculable=new Vector <Calculable> ();

	private Ejecutivo1 emp1;
	
	public Empresa(String nombre, Personal[] listaPersonal) {
		super();
		System.out.println("Introduce el nombre de la empresa");
		this.nombre = LeerTeclado.readString();
		this.listaPersonal = listaPersonal;
	}

	// Métodos get() y set()
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Personal[] getListaPersonal() {
		return listaPersonal;
	}

	public void setListaPersonal(Personal[] listaPersonal) {
		this.listaPersonal = listaPersonal;
	}

	public Vector<Calculable> getListaCalculable() {
		return listaCalculable;
	}

	public void setListaCalculable(Vector<Calculable> listaCalculable) {
		this.listaCalculable = listaCalculable;
	}
	
	// Método para insertar objetos en el vector listaCalculable
	public void insertarListaCalculable (Departamento dp){
		for(int i=0; i<(listaCalculable).size(); i++){
			listaCalculable.addElement(dp);
	}
	}
	
	public void contratar (Departamento dpto){
		System.out.println("Introduce el número del empleado a contratar");
		int cod=LeerTeclado.readInteger();
		boolean enc=false;
		Empleado emp=null;
		for (int i=0; i<listaPersonal.length; i++)
			if (listaPersonal[i]!=null && listaPersonal[i].equals(emp.getNumEmpersonal())){
				enc=true;
				emp=(Empleado) listaPersonal[i];
				break;
			}
		if (enc)
			System.out.println("El empleado contratado es: "+emp.toString());
	}
	public void ascender(){
		
		System.out.println("Introduce el número del empleado a ascender");
		int cod=LeerTeclado.readInteger();
		boolean enc=false;
		Empleado emp=null;
		for (int i=0; i<listaPersonal.length; i++)
			if (listaPersonal[i]!=null && listaPersonal[i].equals(emp.getNumEmpersonal())){
				enc=true;
				Ejecutivo1 ej = new Ejecutivo1(nombre, i, nombre, null, i);
				
				break;
			}
		if (enc){
			System.out.println("El ejecutivo nuevo es: "+emp.toString());
		}
	}
	
	public void incrementar(){
		for (int i=0; i<listaCalculable.size(); i++){
			System.out.println(listaCalculable.elementAt(i).toString());
			System.out.println("Introduce la cantidad a aumentar");
			int cant=LeerTeclado.readInteger();
		}
	}


		
}
