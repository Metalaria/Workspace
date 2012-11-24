package agenda;


public class PrincipalAgenda {
	public static void main(String[] args){
		// Agenda agenda=new Agenda;
		try {
			ConexionBD.conectar();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Agenda a1 = new Agenda();
		System.out.println("ELIGE LA OPCION ");
		System.out.println("1-DAR DE ALTA");
		System.out.println("2-DAR DE BAJA");
		System.out.println("3-BUSCAR");
		System.out.println("4-LISTAR");
		System.out.println("5-SALIR");
		int x = LeerTeclado.readInteger();
		while (x > 0 && x < 5) {
			switch (x) {
			case 1:
				System.out.println("------OPCIONES-------");
				System.out.println("1-DAR DE ALTA UNA PERSONA");
				System.out.println("2-DAR DE ALTA UN LUGAR");
				System.out.println("3-CREAR UNA CITA");
				int y = LeerTeclado.readInteger();
				if (y == 1) {
					a1.registrarPersona();
				}
				if (y == 2) {
					a1.registrarLugar();
				}
				if (y == 3) {
					a1.registrarCita();
				}
				if (y > 3) {
					System.out.println("SOLO EXISTEN 3 OPCIONES");
				}
				break;
			case 2:
				System.out.println("------OPCIONES-------");
				System.out.println("1-DAR DE BAJA UNA PERSONA");
				System.out.println("2-DAR DE BAJA UN LUGAR");
				System.out.println("3-DAR DE  BAJA UNA CITA");
				int z = LeerTeclado.readInteger();
				if (z == 1) {
					a1.borrarPersona();
				}
				if (z == 2) {
					a1.borrarLugar();
				}
				if (z == 3) {
					a1.borrarCita();
				}
				if (z > 3) {
					System.out.println("SOLO EXISTEN 3 OPCIONES");
				}
				break;
			case 3:
				System.out.println("------OPCIONES-------");
				System.out.println("1-BUSCAR UNA PERSONA");
				System.out.println("2-BUSCAR UN LUGAR");
				System.out.println("3-BUSCAR UNA CITA");
				int n = LeerTeclado.readInteger();
				if (n == 1) {
					a1.consultarPersona();
				}
				if (n == 2) {
					a1.consultarLugar();
				}
				if (n == 3) {
					a1.borrarCita();
				}
				if (n > 3) {
					System.out.println("SOLO EXISTEN 3 OPCIONES");
				}
				break;
			case 4:
				System.out.println("------OPCIONES-------");
				System.out.println("1-LISTAR UNA PERSONA");
				System.out.println("2-LISTAR UN LUGAR");
				System.out.println("3-LISTAR UNA CITA");
				int u = LeerTeclado.readInteger();
				if (u == 1) {
					a1.listaPersona();
				}
				if (u == 2) {
					a1.listaLugar();
				}
				if (u == 3) {
					a1.listaCita();
				}
				if (u > 3) {
					System.out.println("SOLO EXISTEN 3 OPCIONES");
				}
				break;
			default:

				break;
			}
			System.out.println("ELIGE LA OPCION ");
			System.out.println("1-DAR DE ALTA");
			System.out.println("2-DAR DE BAJA");
			System.out.println("3-BUSCAR");
			System.out.println("4-LISTAR");
			System.out.println("5-SALIR");
			x = LeerTeclado.readInteger();
		}

	}

}
