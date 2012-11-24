package ejercicio1;

import java.io.*;


public class Ejercicio1 {
	public static void main (String [] args){
		try {
			if (args.length!=2)
				throw new ExcepcionFichero("No se ha introducido dos nombres de fichero");
			else {
			String fichero1=args[0];
			String fichero2=args[1];
			File f1=new File (fichero1);
			File f2=new File (fichero2);
			gestionFichero(f1,f2);
			}
		}
		catch (ExcepcionFichero e){
			System.out.println(e);
		}
		
		catch (IOException e){
			System.out.println("Error en la gestion del fichero");
			e.printStackTrace();
		}
	}
	
	public static void gestionFichero(File f1, File f2)throws IOException{
		//	File f=new File (fichero);
			boolean anadir=false;
			if (f1.exists())	{
				System.out.println("El fichero ya existe: 1.-Añadir datos en él 2.-Reescribirlo");
				int opc=LeerTeclado.readInteger();
				if (opc==1)
					anadir=true;
			}
			FileOutputStream fos=new FileOutputStream (f1, anadir);
			//grabamos
			System.out.println("Introduce texto a grabar");
			String texto=LeerTeclado.readString();
			byte dato;
			for (int i=0; i<texto.length(); i++){
				dato=(byte)texto.charAt(i);
				fos.write(dato);
			}
			fos.close();
			//abrimos para leer
			FileInputStream fis=new FileInputStream(f1);
			int size=fis.available();
			String salida1="", salida2="", salida3="";
			char c;
			for(int i=0; i<size; i++){
				c=(char)fis.read();
				salida1+=c;
			}
			System.out.println("Contenido del fichero de bytes "+salida1);	
			fis.close();
			//creamos el fichero FileWriter
			//String copia=fichero;
			
	//		File f2=new File(copia);
			FileWriter fw=new FileWriter(f2, true);
			//grabamos
			salida2=salida1.toUpperCase();
			fw.write(salida2);
			fw.close();
			//creamos el fichero FileReader
			FileReader fr=new FileReader(f2);
			//leemos
			char eof=(char)(-1);
			char leido=(char)fr.read();
			while(leido!=eof){
				salida3+=leido;
				leido=(char)fr.read();
			}
			System.out.println("Contenido del fichero de caracteres "+salida3);
			fr.close();
			System.out.println("Fin de programa");
			
			
			
		}
		
	}


