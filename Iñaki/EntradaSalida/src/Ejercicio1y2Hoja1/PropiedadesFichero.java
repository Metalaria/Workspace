package Ejercicio1y2Hoja1;

import java.io.File;

public class PropiedadesFichero {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try{
			if(args.length==0)
				throw new ExcepcionArgumentos("El programa no tiene argumentos: hay que escribir uno o varios nombres de fichero o directorio");
				
			else 
				for(int i=0;i<args.length;i++){
					File f=new File(args[i]);
					propiedades(f);
				}
		}
		catch (ExcepcionArgumentos e) {
			System.out.println(e);
		}
	}
	
	public static void propiedades(File f){
		
		System.out.println("Ruta absoluta "+f.getAbsolutePath()+
				"\n ¿Se puede leer? "+f.canRead()+
				"\n ¿Se puede escribir? "+f.canWrite()+
				"\n Nombre del fichero: "+f.getName()+
				"\n Padre del fichero: "+f.getParent()+
				"\n Ruta del fichero: "+f.getPath()+
				"\n Longitud: "+f.length());
		if(f.isFile())System.out.println("Es un fichero");
		else{
			System.out.println("Es un directorio");
			File ficheros[]=f.listFiles();
			for(int i=0;i<ficheros.length;i++){
				propiedades(ficheros[i]);
			}
		}
	}

}
