package agenda;

public class ListaLugar implements Acceso {

	@Override
	public void borrar(Object o) {

		if (o instanceof Lugar) {
			try {
				ConexionBD.Conectar();
				ConexionBD.sentenciaSQL.executeUpdate("DELETE FROM " + Lugares
						+ " WHERE  nombre= " + ((Lugar) o).getNombre());

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
			ConexionBD.sentenciaSQL.executeUpdate("SELECT * FROM" + Lugares
					+ "WHERE NOMBRE= " + nombre);
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	@Override
	public void listado() {
		try {
			ConexionBD.Conectar();
			ConexionBD.sentenciaSQL.executeUpdate("SELECT * FROM" + Lugares);
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	@Override
	public void añadir(Object l) {
		if (l instanceof Lugar) {
			try {
				ConexionBD.Conectar();
				ConexionBD.sentenciaSQL.executeUpdate("INSERT INTO " + Lugares
						+ " VALUES (‘ " + ((Lugar) l).getNombre() + " ‘ ,‘ "
						+ ((Lugar) l).getDireccion() + " ‘,’ "
						+ ((Lugar) l).getTelefono() + " ‘, "
						+ ((Lugar) l).getNotaAlumno() + ")");

			} catch (Exception e) {

				e.printStackTrace();
			}

		}

	}

}
