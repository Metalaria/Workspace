package agenda;

import java.sql.ResultSet;

import examen.LeerTeclado;

public class Agenda {
	private ListaLugar lugaresAgenda;
	private ListaPersona personasAgenda;
	private ListaCita citasAgenda;

	public Agenda(ListaLugar lugaresAgenda, ListaPersona personasAgenda,
			ListaCita citasAgenda) {
		super();
		this.lugaresAgenda = new ListaLugar();
		this.personasAgenda = new ListaPersona();
		this.citasAgenda = new ListaCita();
	}

	public ListaLugar getLugaresAgenda() {
		return lugaresAgenda;
	}

	public void setLugaresAgenda(ListaLugar lugaresAgenda) {
		this.lugaresAgenda = lugaresAgenda;
	}

	public ListaPersona getPersonasAgenda() {
		return personasAgenda;
	}

	public void setPersonasAgenda(ListaPersona personasAgenda) {
		this.personasAgenda = personasAgenda;
	}

	public ListaCita getCitasAgenda() {
		return citasAgenda;
	}

	public void setCitasAgenda(ListaCita citasAgenda) {
		this.citasAgenda = citasAgenda;
	}

	public void registrarLugar() {
		System.out.println("INTRODUCE NOMBRE");
		String nombre = LeerTeclado.readString();
		System.out.println("INTRODUCE DIRECCION");
		String direccion = LeerTeclado.readString();
		System.out.println("INTRODUCE TELEFONO");
		String telefono = LeerTeclado.readString();
		Lugar l1 = new Lugar(nombre, direccion, telefono);
		lugaresAgenda.añadir(l1);

	}

	public void registrarPersona() {
		System.out.println("INTRODUCE NOMBRE COMPLETO DE LA PERSONA");
		String nombre = LeerTeclado.readString();
		System.out.println("INTRODUCE  CORREO ELECTRONICO");
		String direccion = LeerTeclado.readString();
		System.out.println("ELIGE EL TIPO DE PERSONA ");
		System.out.println("1-AMISTAD");
		System.out.println("2-CONTACTO");
		int x = LeerTeclado.readInteger();
		if (x == 1) {
			System.out
					.println("--------CREAMOS NUESTRO CONTACTO AMISTAD------");
			System.out.println("INTRODUCE DIRECCION");
			String calle = LeerTeclado.readString();
			System.out.println("INTRODUCE TELEFONO");
			String telefono = LeerTeclado.readString();
			Amistad a1 = new Amistad(nombre, direccion, calle, telefono);
			personasAgenda.añadir(a1);
		} else {
			System.out
					.println("---------CREAMOS NUESTRO CONTACTO DE EMPRESA-------");
			System.out.println("INTRODUCE NOMBRE DE EMPRESA");
			String nombreEmpresa = LeerTeclado.readString();
			System.out.println("INTRODUCE INFORMACION ADICIONAL");
			String informacion = LeerTeclado.readString();
			Contacto c1 = new Contacto(nombre, direccion, nombreEmpresa,
					informacion);
			personasAgenda.añadir(c1);
		}
	}

	public void registrarCita() {
		System.out.println("INTRODUCE FECHA DE LA CITA");
		String fecha = LeerTeclado.readString();
		System.out.println("INTRODUCE NOMBRE DE LA PERSONA");
		String nombre = LeerTeclado.readString();
		System.out.println("INTRODUCE NOMBRE DEL LUGAR");
		String lugar = LeerTeclado.readString();
		Lugar l1 = (Lugar) lugaresAgenda.buscar(lugar);
		Persona p1 = (Persona) personasAgenda.buscar(nombre);
		Cita c1 = new Cita(p1, l1, fecha);
		citasAgenda.añadir(c1);

	}

	public void borrarLugar() {
		System.out.println("INTRODUCE NOMBRE DEL LUGAR A BORRAR");
		String lugar = LeerTeclado.readString();
		Lugar l1 = (Lugar) lugaresAgenda.buscar(lugar);
		lugaresAgenda.borrar(l1);

	}

	public void borrarPersona() {
		System.out.println("INTRODUCE NOMBRE DE LA PERSONA A BORRAR");
		String nombre = LeerTeclado.readString();
		Persona p1 = (Persona) personasAgenda.buscar(nombre);
		personasAgenda.borrar(p1);

	}

	public void borrarCita() {
		System.out.println("INTRODUCE LA FECHA EN LA QUE OCURRIO LA CITA");
		String cita = LeerTeclado.readString();
		Cita c1 = (Cita) citasAgenda.buscar(cita);
		citasAgenda.borrar(c1);
	}

	public void consultarLugar() {
		System.out.println("INTRODUCE NOMBE DE EL LUGAR");
		String lugar = LeerTeclado.readString();
		Lugar l1 = (Lugar) lugaresAgenda.buscar(lugar);
		l1.toString();
	}

	public void consultarPersona() {
		System.out.println("INTRODUCE NOMBE DE LA PERSONA");
		String lugar = LeerTeclado.readString();
		Lugar l1 = (Lugar) personasAgenda.buscar(lugar);
		l1.toString();
	}

	public void consultarCita() {
		System.out.println("INTRODUCE NOMBE DE LA CITA");
		String cita = LeerTeclado.readString();
		Cita c1 = (Cita) citasAgenda.buscar(cita);
		c1.toString();
	}

	public void listaLugar() {
		lugaresAgenda.listado();
	}

	public void listaPersona() {
		personasAgenda.listado();
	}

	public void listaCita() {
		citasAgenda.listado();
	}
}
