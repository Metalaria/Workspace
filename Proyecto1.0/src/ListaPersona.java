

public class ListaPersona implements Acceso {

	@Override
	public void añadir(Object o) {
		// TODO Auto-generated method stub
		if (o instanceof Amistad) {
			try {
				ConexionBD.conectar();
				ConexionBD.sentenciaSQL.executeUpdate("INSERT INTO amistad " + 
						" VALUES (‘ " + ((Amistad) o).getDireccion()
						+ " ‘ ,‘ " + ((Amistad) o).getEmail() + " ‘,’ "
						+ ((Amistad) o).getNombreCompleto() + " ‘,’ "
						+ ((Amistad) o).getTelefono() + ")");
				ConexionBD.sentenciaSQL.executeUpdate("INSERT INTO Pesona " +
						 " VALUES (‘ " + ((Amistad) o).getEmail() + " ‘,’ "
						+ ((Amistad) o).getNombreCompleto() + ")");

			} catch (Exception e) {

				e.printStackTrace();
			}

		} else {
			if (o instanceof Contacto) {
				try {
					ConexionBD.conectar();
					ConexionBD.sentenciaSQL.executeUpdate("INSERT INTO contacto "
							+ " VALUES (‘ "
							+ ((Contacto) o).getInfoAdicional() + " ‘ ,‘ "
							+ ((Contacto) o).getEmail() + " ‘,’ "
							+ ((Contacto) o).getNombreCompleto() + " ‘,’ "
							+ ((Contacto) o).getNombreEmpresa() + ")");
					ConexionBD.sentenciaSQL.executeUpdate("INSERT INTO persona"
							+ " VALUES (‘ "
							+ ((Amistad) o).getEmail() + " ‘,’ "
							+ ((Amistad) o).getNombreCompleto() + ")");

				} catch (Exception e) {

					e.printStackTrace();
				}

			}
		}
	}

	@Override
	public void borrar(Object o) {
		// TODO Auto-generated method stub
		if (o instanceof Amistad) {
			try {
				ConexionBD.conectar();
				ConexionBD.sentenciaSQL
						.executeUpdate("DELETE FROM persona "
								+ " WHERE  fecha= "
								+ ((Persona) o).getNombreCompleto());
				ConexionBD.sentenciaSQL
						.executeUpdate("DELETE FROM amistad"
								+ " WHERE  fecha= "
								+ ((Persona) o).getNombreCompleto());

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (o instanceof Contacto) {
			try {
				ConexionBD.conectar();
				ConexionBD.sentenciaSQL
						.executeUpdate("DELETE FROM persona "
								+ " WHERE  fecha= "
								+ ((Persona) o).getNombreCompleto());
				ConexionBD.sentenciaSQL
						.executeUpdate("DELETE FROM contacto "
								+ " WHERE  fecha= "
								+ ((Persona) o).getNombreCompleto());

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	@Override
	public Object buscar(String nombre) {
		try {
			ConexionBD.conectar();
			ConexionBD.sentenciaSQL.executeUpdate("SELECT * FROM persona"
					+ "WHERE fecha= " + nombre);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

	@Override
	public void listado() {
		try {
			ConexionBD.conectar();
			System.out.println("--------------PERSONAS----------------");
			ConexionBD.sentenciaSQL.executeUpdate("SELECT * FROM persona");
			System.out.println("--------------AMISTADES---------------");
			ConexionBD.sentenciaSQL.executeUpdate("SELECT * FROM amistad");
			System.out.println("-------------CONTACTOS-----------");
			ConexionBD.sentenciaSQL.executeUpdate("SELECT * FROM contacto");
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
