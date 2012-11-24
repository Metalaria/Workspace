package agenda;

public class ListaCita implements Acceso {

	@Override
	public void añadir(Object o) {
		// TODO Auto-generated method stub
		if (o instanceof Cita) {
			try {
				ConexionBD.Conectar();
				ConexionBD.sentenciaSQL.executeUpdate("INSERT INTO " + Lugares
						+ " VALUES (‘ " + ((Cita) o).getFechayhora() + " ‘ ,‘ "
						+ ((Cita) o).getLugar() + " ‘,’ "
						+ ((Cita) o).getPersona() + ")");

			} catch (Exception e) {

				e.printStackTrace();
			}

		}
	}

	@Override
	public void borrar(Object o) {
		// TODO Auto-generated method stub
		if (o instanceof Cita) {
			try {
				ConexionBD.Conectar();
				ConexionBD.sentenciaSQL.executeUpdate("DELETE FROM " + Citas
						+ " WHERE  fecha= " + ((Cita) o).getFechayhora());

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	@Override
	public Object buscar(String nombre) {
		try {
			ConexionBD.Conectar();
			ConexionBD.sentenciaSQL.executeUpdate("SELECT * FROM" + Citas
					+ "WHERE fecha= " + nombre);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Override
	public void listado() {
		try {
			ConexionBD.Conectar();
			ConexionBD.sentenciaSQL.executeUpdate("SELECT * FROM" + Citas);
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
