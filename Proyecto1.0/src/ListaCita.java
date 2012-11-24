

public class ListaCita implements Acceso {

	@Override
	public void añadir(Object o) {
		// TODO Auto-generated method stub
		if (o instanceof Cita) {
			try {
				ConexionBD.conectar();
				ConexionBD.actualizar("INSERT INTO citas "
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
				ConexionBD.conectar();
				ConexionBD.actualizar("DELETE FROM citas"
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
			ConexionBD.conectar();
			ConexionBD.consultar("SELECT * FROM citas"
					+ "WHERE fecha= " + nombre);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return nombre;
	}

	@Override
	public void listado() {
		try {
			ConexionBD.conectar();
			ConexionBD.consultar("SELECT * FROM citas");
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
