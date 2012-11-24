package ClaseFile;
import java.io.File;
public class PrincipalEjercicio1 {
	public static void main(String[] args) {
		try {
			if (args.length==0){
				throw new ExcepcionArgumentos("No hay argumentos");
			}
			else {
				for (int i=0; i<args.length;i++){
					propiedades(args[i]);
				}
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		
			
	}
	public static void propiedades(String nomFich){
		File f=new File(nomFich);
		if (f.isFile()==false){
			ExcepcionFicheroNoExiste exF = new ExcepcionFicheroNoExiste();
		}
		System.out.println("El nombre del archivo es: "+f.getName()+
				"\n ¿Se puede modicar? "+f.canWrite()+
				"\n Longitud: "+f.length()
				
				);
	}
}
