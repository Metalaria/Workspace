package agenda;

public class ListaLugar implements Acceso {

	@Override
	public void borrar(Object o) {
		Lugar l=(Lugar)o;
		if (o instanceof Lugar) {
			try {
				
				ConexionBD.actualizar("DELETE FROM lugares "
						+ " WHERE  nombre= " + l.getNombre()+";");

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	@Override
	public Object buscar(String nombre) {
		try {
			
			ConexionBD.sentenciaSQL.executeUpdate("SELECT * FROM lugares"
					+ "WHERE NOMBRE= " +nombre+";");
		} catch (Exception e) {
			// TODO: handle exception
		}
		return nombre;
	}

	@Override
	public void listado() {
		//String lista;
		try {
			ConexionBD.conectar();
			ConexionBD.consultar("SELECT * FROM lugares");
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	@Override
	public void añadir(Object l) {
		if (l instanceof Lugar) {
			try {
				ConexionBD.conectar();
				ConexionBD.sentenciaSQL.executeUpdate("INSERT INTO lugares "
						+ " VALUES (' " + ((Lugar) l).getNombre() + "' ,' "
						+ ((Lugar) l).getDireccion() + " ',' "
						+ ((Lugar) l).getTelefono() + "')");

			} catch (Exception e) {

				e.printStackTrace();
			}

		}

	}

}
