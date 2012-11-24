import java.io.*;
public class Principal {
	public static void main(String[] args) throws IOException{
		@SuppressWarnings("unused")
		File f=null;
		Agenda a = new Agenda();
		
		a.deserializar();
		
		System.out.println("Elige opcion ");
		System.out.println("1.- Alta");
		System.out.println("2.- Baja");
		System.out.println("3.- Buscar");
		System.out.println("4.- Listar");
		System.out.println("5.- Salir");
		int opc = LeerTeclado.readInteger();
		
		while (opc > 0 && opc < 5) {
			switch (opc) {
			case 1:
				System.out.println("****Opciones****");
				System.out.println("1-Alta Persona");
				System.out.println("2-Alta Lugar");
				System.out.println("3-Alta Cita");
				int op = LeerTeclado.readInteger();
				
				if (op == 1) 
					a.registrarPersona();
				
				if (op == 2) 
					a.registrarLugar();
				
				if (op == 3) 
					a.registrarCita();
				
				if (op > 3 || op < 1)
					System.out.println("Opcion incorrecta");
				
				break;
				
			case 2:
				System.out.println("*****-Opciones*****");
				System.out.println("1.- Baja Persona");
				System.out.println("2.- Baja Lugar");
				System.out.println("3.- Baja Cita");
				int o = LeerTeclado.readInteger();
				if (o == 1) 
					a.eliminarPersona();
				
				if (o == 2) 
					a.eliminarLugar();
				
				if (o == 3) 
					a.eliminarCita();
				
				if (o > 3 || o < 1)
					System.out.println("Opcion incorrecta");
				
				break;
				
			case 3:
				System.out.println("****Opciones****");
				System.out.println("1.- Buscar Persona");
				System.out.println("2.- Buscar Lugar");
				System.out.println("3.- Buscar Cita");
				int n = LeerTeclado.readInteger();
				
				if (n == 1) 
					a.consultarPersona();
				
				if (n == 2) 
					a.consultarLugar();
				
				if (n == 3) 
					
					a.consultarCita();
				
				if (n > 3 || n < 1)
				System.out.println("Opcion incorrecta");
				
				break;
				
			case 4:
				a.listar();
				break;
				
			case 5: 
				break;
			
			default: System.out.println("Opcion incorrecta"); 
				break;
			}
			
			System.out.println("Elige opcion ");
			System.out.println("1.- Alta");
			System.out.println("2.- Baja");
			System.out.println("3.- Buscar");
			System.out.println("4.- Listar");
			System.out.println("5.- Salir");
			opc = LeerTeclado.readInteger();
			
		}
		System.out.println("Adios");
		a.serializar();
	}
}