package arraysClases;
import arrays.LeerTeclado;


public class PrincipalMatriz {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int f,c;
		System.out.println("Introduce filas de la matriz");
		f=LeerTeclado.readInteger();
		System.out.println("Introduce columnas de la matriz");
		c=LeerTeclado.readInteger();
		
		Matriz matriz=new Matriz(f,c);
		System.out.println("Se procede a la carga de datos...");
		matriz.introducir();
		System.out.println("La matriz es: ");
		matriz.visualizar();
		

	}

}
