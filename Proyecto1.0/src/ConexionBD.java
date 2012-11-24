
import java.sql.*;
import com.mysql.jdbc.Connection;

public class ConexionBD 
{
	static Connection conexion;
	static Statement sentenciaSQL;
	static ResultSet rs;
	public ConexionBD(){}

	public static void conectar() throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");
		conexion=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/Agenda","root", "girasol");	
		sentenciaSQL=conexion.createStatement();
	}
	public void desconectar() throws Exception
	{
		rs.close();
		sentenciaSQL.close();
		conexion.close();
	}
	public static void actualizar(String sentencia) throws Exception
	{
		sentenciaSQL.executeUpdate(sentencia);
	}
	public static void consultar(String sentencia) throws Exception
	{
		rs=sentenciaSQL.executeQuery(sentencia);
	}
	public static ResultSet getrs()
	{
		return rs;
	}
}
