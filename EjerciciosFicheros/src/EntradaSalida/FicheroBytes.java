package EntradaSalida;
import java.io.*;

public class FicheroBytes {
	public static void main(String[] args) throws IOException {
		System.out.println("Introduzca el texto que quiere grabar en el fichero");
		String cad1=LeerTeclado.readString();
		System.out.println("Introduzca ahora el nombre del fichero que quiere crear");
		String nomFich1=LeerTeclado.readString();
		
		File f = new File(nomFich1);
		try {
			if (!f.exists()){
				FileOutputStream fos = new FileOutputStream(f);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println(f.createNewFile());
		System.out.println("La ruta del fichero es: "+f.getAbsolutePath());
	}
}
