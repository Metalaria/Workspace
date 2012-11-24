package Empleados;
import java.util.Collection;
import java.util.Vector;

public class Jefes extends Empleados {
	private String nombre;
	private int edad;
	private double sueldo;
	String codJ;
	
	public Jefes(String nombre, int edad, double sueldo, String codJ) {
		super();
		System.out.println("Nombre:");
		this.nombre =LeerTeclado.readString();
		System.out.println("Edad:");
		this.edad = LeerTeclado.readInteger();
		System.out.println("Sueldo (no hace falta poner el símbolo €)");
		this.sueldo = sueldo;
		this.codJ = rellenarCodigo();
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getCodJ() {
		return codJ;
	}

	public void setCodJ(String codJ) {
		this.codJ = codJ;
	}

	public String rellenarCodigo() {
		int contJ=0;
		String codJefe="J-"+contJ;
		return codJefe;
	}
}
